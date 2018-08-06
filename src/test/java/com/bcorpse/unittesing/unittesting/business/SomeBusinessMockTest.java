package com.bcorpse.unittesing.unittesting.business;

import com.bcorpse.unittesing.unittesting.business.SomeBusinessImpl;
import com.bcorpse.unittesing.unittesting.business.SomeDataService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class SomeBusinessMockTest {
    @InjectMocks
    SomeBusinessImpl business = new SomeBusinessImpl();

    @Mock
    SomeDataService dataServiceMock;

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

