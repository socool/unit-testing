package com.bcorpse.unittesing.unittesting.com.bcorpse.unittesting.business;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;


public class SomeBusinessMockTest {
    SomeBusinessImpl business = new SomeBusinessImpl();
    SomeDataService dataServiceMock = mock(SomeDataService.class);

    @Before
    public void before(){
        business.setSomeDataService(dataServiceMock);
    }

    @Test
    public void calculateSumUsingDataService() {

        //dataServiceMock retreiveAllData
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {1,2,3});
        assertEquals(6,business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataServiceEmpty() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {});
        assertEquals(0,business.calculateSumUsingDataService());
    }

    @Test
    public void calculateSumUsingDataServiceOneValue() {

        when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {5});
        assertEquals(5,business.calculateSumUsingDataService());
    }
}

