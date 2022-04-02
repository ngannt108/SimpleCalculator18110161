package com.android.s18110161;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import java.math.BigInteger;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    private Calculator mCalculator;
    @Before
    public void setUp() {
        mCalculator = new Calculator();
    }
    @Test
    public void addPossitiveNumbers() {
        double resultAdd = mCalculator.add(2.2d, 1.8d);
        assertThat(resultAdd, is(equalTo(4d)));
    }

    @Test
    public void addNegativeNumbers() {
        double resultAdd = mCalculator.add(-2d, -1d);
        assertThat(resultAdd, is(equalTo(-3d)));
    }

    @Test
    public void addNumbers() {
        double resultAdd = mCalculator.add(-2d, 1d);
        assertThat(resultAdd, is(equalTo(-1d)));
    }

    @Test
    public void addTwoDifferentNumbers() {
        double resultAdd = mCalculator.add(-2.1d, 1d);
        assertThat(resultAdd, is(equalTo(-1.1d)));
    }

    @Test
    public void addTwoSameNumbers() {
        double resultAdd = mCalculator.add(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(-4.2d)));
    }

    @Test
    public void addNumbers2() {
        double resultAdd = mCalculator.add(-2.91d, -1.9d);
        assertThat(resultAdd, is(equalTo(-4.81d)));
    }

    @Test
    public void subNegativeNumbers() {
        double resultAdd = mCalculator.sub(-2d, -1d);
        assertThat(resultAdd, is(equalTo(-1d)));
    }

    @Test
    public void subNumbers() {
        double resultAdd = mCalculator.sub(-2d,3d);
        assertThat(resultAdd, is(equalTo(-5d)));
    }

    @Test
    public void SubTwoDifferentNumbers() {
        double resultAdd = mCalculator.sub(-2.1d, 1d);
        assertThat(resultAdd, is(equalTo(-3.1d)));
    }

    @Test
    public void subTwoSameNumbers() {
        double resultAdd = mCalculator.sub(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(0d)));
    }

    @Test
    public void subNumbers2() {
        double resultAdd = mCalculator.sub(-2.91d, -1.9d);
        assertThat(resultAdd, is(equalTo(-1.01d)));
    }

    @Test
    public void mulPossitiveNumbers() {
        double resultAdd = mCalculator.mul(2d, 17d);
        assertThat(resultAdd, is(equalTo(34d)));
    }

    @Test
    public void mulNegativeNumbers() {
        double resultAdd = mCalculator.mul(-2d, -2d);
        assertThat(resultAdd, is(equalTo(4d)));
    }

    @Test
    public void mulNumbers() {
        double resultAdd = mCalculator.mul(-2d,3d);
        assertThat(resultAdd, is(equalTo(-6d)));
    }

    @Test
    public void mulTwoDifferentNumbers() {
        double resultAdd = mCalculator.mul(-2.1d, 2d);
        assertThat(resultAdd, is(equalTo(-4.2d)));
    }

    @Test
    public void mulTwoSameNumbers() {
        double resultAdd = mCalculator.mul(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(4.41d)));
    }

    @Test
    public void mulNumbers2() {
        double resultAdd = mCalculator.mul(-2.91d, -1.9d);
        assertThat(resultAdd, is(equalTo(5.529d)));
    }

    @Test
    public void mulPossitiveOddNumbers() {
        double resultAdd = mCalculator.mul(2.1d, 1.1d);
        assertThat(resultAdd, is(equalTo(2.31d)));
    }


    @Test
    public void divPossitiveNumbers() {
        double resultAdd = mCalculator.div(17d, 2d);
        assertThat(resultAdd, is(equalTo(8.5d)));
    }

    @Test
    public void divNegativeNumbers() {
        double resultAdd = mCalculator.div(-6d, -2d);
        assertThat(resultAdd, is(equalTo(3d)));
    }

    @Test
    public void divNumbers() {
        double resultAdd = mCalculator.div(-6d,3d);
        assertThat(resultAdd, is(equalTo(-2d)));
    }

    @Test
    public void divTwoDifferentNumbers() {
        double resultAdd = mCalculator.div(-2.2d, 2d);
        assertThat(resultAdd, is(equalTo(-1.1d)));
    }

    @Test
    public void divTwoSameNumbers() {
        double resultAdd = mCalculator.div(-2.1d, -2.1d);
        assertThat(resultAdd, is(equalTo(1d)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divZeroNumber(){
        mCalculator.div(99d,0d);
    }

    @Test
    public void expPossitiveNumbers() {
        double resultAdd = mCalculator.exp(17d, 2d);
        assertThat(resultAdd, is(equalTo(289d)));
    }

    @Test
    public void expNegativeNumbers() {
        double resultAdd = mCalculator.exp(-6d, -2d);
        assertThat(resultAdd, is(equalTo(-1/36d)));
    }

    @Test
    public void expNumbers() {
        double resultAdd = mCalculator.exp(-6d,3d);
        assertThat(resultAdd, is(equalTo(-216d)));
    }

    @Test
    public void expTwoDifferentNumbers() {
        double resultAdd = mCalculator.exp(2d, -2d);
        assertThat(resultAdd, is(equalTo(1/4d)));
    }

    @Test
    public void expTwoSameNumbers() {
        double resultAdd = mCalculator.exp(-2d, -2.5d);
        assertThat(resultAdd, is(equalTo(-0.1767766952966369d)));
    }

    @Test
    public void expTwoDifferentNumbersFail() {
        double resultAdd = mCalculator.exp(-2.2d, 2d);
        assertThat(resultAdd, is(equalTo(-4.84d)));}


    @Test
    public void facPossitiveNumbers() {
        BigInteger resultAdd = mCalculator.fac(5d);
        assertThat(resultAdd, is(equalTo(BigInteger.valueOf(120))));
    }

    @Test(expected = IllegalArgumentException.class)
    public void facNegativeNumber(){
        mCalculator.fac(-6);
    }

    @Test(expected = IllegalArgumentException.class)
    public void facFloatNumber(){
        mCalculator.fac(6.6);
    }


    @Test
    public void facTwoDifferentNumbers() {
        BigInteger resultAdd = mCalculator.fac( 0d);
        assertThat(resultAdd, is(equalTo(BigInteger.valueOf(1))));
    }
    //5. fac result big num
    @Test
    public void facTwoSameNumbers() {
        BigInteger resultAdd = mCalculator.fac( 20d);
        assertThat(resultAdd, is(equalTo(BigInteger.valueOf((long) 2432902008176640000d))));
    }

    @Test
    public void logNormalNumbers() {
        double resultLog = mCalculator.log(8d, 2d);
        assertThat(resultLog, is(equalTo(3d)));
    }

    @Test
    public void logTwoNumberFloat(){
        double resultLog = mCalculator.log(8.1d,1.5d);
        assertThat(resultLog, is(equalTo(5.159171578138246)));
    }

    @Test
    public void log1Real1IntegerNumber(){
        double resultLog = mCalculator.log(3.3d,2d);
        assertThat(resultLog, is(equalTo(1.7224660244710912d)));
    }

    @Test(expected = IllegalArgumentException.class)
    public void logOneNegativeRadix(){
        mCalculator.log(4d,-9d);
    }

    @Test(expected = IllegalArgumentException.class)
    public void logOneRadix(){
        mCalculator.log(2d,1d);
    }
}
