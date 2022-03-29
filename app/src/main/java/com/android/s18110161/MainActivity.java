package com.android.s18110161;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "CalculatorActivity";

    private Calculator mCalculator;

    private EditText mOperandOneEditText;
    private EditText mOperandTwoEditText;

    private TextView mResultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the calculator class and all the views
        mCalculator = new Calculator();
        mResultTextView = findViewById(R.id.operation_result_text_view);
        mOperandOneEditText = findViewById(R.id.operand_one_edit_text);
        mOperandTwoEditText = findViewById(R.id.operand_two_edit_text);
    }

    public void onAdd(View view) {
        compute(Calculator.Operator.ADD);
    }


    public void onSub(View view) {
        compute(Calculator.Operator.SUB);
    }

    public void onDiv(View view) {
        try {
            compute(Calculator.Operator.DIV);
        } catch (IllegalArgumentException iae) {
            Log.e(TAG, "IllegalArgumentException", iae);
            mResultTextView.setText("Calculator Error! Please Check");
        }
    }

    public void onMul(View view) {
        compute(Calculator.Operator.MUL);
    }
    public void onExp(View view) {
        compute(Calculator.Operator.EXP);
    }
    public void onFac(View view) {
        try {
            compute(Calculator.Operator.FAC);
        }catch (IllegalArgumentException iae){
            Log.e(TAG, "IllegalArgumentException", iae);
            mResultTextView.setText("Calculator Error! Please Check");
        }
    }
    public void onLog(View view) {
        try {
            compute(Calculator.Operator.LOG);
        }catch (IllegalArgumentException iae){
            Log.e(TAG, "IllegalArgumentException", iae);
            mResultTextView.setText("Calculator Error! Please Check");
        }
    }


    private void compute(Calculator.Operator operator) {
        double operandOne;
        double operandTwo;
        try {
            operandOne = getOperand(mOperandOneEditText);
            operandTwo = getOperand(mOperandTwoEditText);
        } catch (NumberFormatException nfe) {
            Log.e(TAG, "NumberFormatException", nfe);
            mResultTextView.setText("Calculator Error! Please Check");
            return;
        }

        String result;
        switch (operator) {
            case ADD:
                result = String.valueOf(
                        mCalculator.add(operandOne, operandTwo));
                break;
            case SUB:
                result = String.valueOf(
                        mCalculator.sub(operandOne, operandTwo));
                break;
            case DIV:
                result = String.valueOf(
                        mCalculator.div(operandOne, operandTwo));
                break;
            case MUL:
                result = String.valueOf(
                        mCalculator.mul(operandOne, operandTwo));
                break;
            case EXP:
                result = String.valueOf(
                        mCalculator.exp(operandOne, operandTwo));
                break;
            case FAC:
                result = String.valueOf(
                        mCalculator.fac(operandOne));
                break;
            case LOG:
                result = String.valueOf(
                        mCalculator.log(operandOne, operandTwo));
                break;
            default:
                result = "Calculator Error! Please Check";
                break;
        }
        mResultTextView.setText(result);
    }

    private static Double getOperand(EditText operandEditText) {
        String operandText = getOperandText(operandEditText);
        return Double.valueOf(operandText);
    }

    private static String getOperandText(EditText operandEditText) {
        return operandEditText.getText().toString();
    }
}