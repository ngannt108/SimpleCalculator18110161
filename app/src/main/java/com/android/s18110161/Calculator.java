package com.android.s18110161;

import java.math.BigInteger;

public class Calculator {
    public enum Operator {ADD, SUB, DIV, MUL, EXP, FAC, LOG}

    public double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        if (secondOperand==0){
            throw new IllegalArgumentException("Second Operand cannot equal 0");

        }else{
            return firstOperand / secondOperand;
        }
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }


    public double exp(double firstOperand, double secondOperand) {
        if (firstOperand>0) return (double) Math.pow( firstOperand, secondOperand);
        return -1 * Math.pow(-firstOperand, secondOperand);
    }

    public BigInteger fac(double firstParameter) {
        if (firstParameter==(int)firstParameter && firstParameter>=0){
            BigInteger result = BigInteger.ONE;
            for(int i=1; i<=(int)firstParameter;i++)
                result=result.multiply(BigInteger.valueOf(i));
            return result;
        }else{
            throw new IllegalArgumentException("First Operand must be interger and not negative");
        }
    }

    public double log(double firstParameter, double secondParameter) {
        if(firstParameter<0||secondParameter==1||secondParameter<=0){
            throw new IllegalArgumentException("First, Second Operand must be positive and First Operand different from 1");
        }else {return Math.log(firstParameter) / Math.log(secondParameter);}
    }
}
