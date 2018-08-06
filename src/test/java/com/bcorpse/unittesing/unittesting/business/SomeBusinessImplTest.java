package com.bcorpse.unittesing.unittesting.business;

import com.bcorpse.unittesing.unittesting.business.SomeBusinessImpl;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class SomeBusinessImplTest {

    @Test
    public void calculateSum() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {1,2,3});
        int expectedResult = 6;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSumEmpty() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {});
        int expectedResult = 0;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void calculateSumOneValue() {
        SomeBusinessImpl business = new SomeBusinessImpl();
        int actualResult = business.calculateSum(new int[] {1});
        int expectedResult = 1;
        assertEquals(expectedResult,actualResult);
    }
}