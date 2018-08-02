package com.bcorpse.unittesing.unittesting.com.bcorpse.unittesting.business;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListMockTest {
    List mock = mock(List.class);
    @Test
    public void sizeCheck(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5);
        assertEquals(5,mock.size());
    }

    @Test
    public void returnDifferentValues(){
        List mock = mock(List.class);
        when(mock.size()).thenReturn(5).thenReturn(1);
        assertEquals(5,mock.size());
        assertEquals(1,mock.size());
    }

    @Test
    public void returnWithParameters(){
        when(mock.get(0)).thenReturn("thing you got");
        assertEquals("thing you got", mock.get(0));
    }
}
