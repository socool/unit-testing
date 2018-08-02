package com.bcorpse.unittesing.unittesting.com.bcorpse.unittesting.business;

import com.sun.org.apache.xpath.internal.Arg;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

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
    public void returnWithGenericParameters(){
        when(mock.get(anyInt())).thenReturn("thing you got");
        assertEquals("thing you got", mock.get(0));
        assertEquals("thing you got", mock.get(1));
    }

    @Test
    public void verificationBasics(){
        //SUT
        String value1 = (String)mock.get(0);
        String value2 = (String)mock.get(1);

        //Verify
        verify(mock).get(0);
        verify(mock,times(2)).get(anyInt());
        verify(mock,atLeast(1)).get(anyInt());
        verify(mock,atMost(2)).get(anyInt());
        verify(mock,never()).get(2);

    }

    @Test
    public void argumentCapture(){
        //SUT
        mock.add("Something");

        //Verify
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock).add(captor.capture());

        assertEquals("Something", captor.getValue());


    }

    @Test
    public void multipleArgumentCapture(){
        //SUT
        mock.add("Something 1");
        mock.add("Something 2");

        //Verify
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        verify(mock,times(2)).add(captor.capture());

        List<String> allValues = captor.getAllValues();

        assertEquals("Something 1", allValues.get(0));
        assertEquals("Something 2", allValues.get(1));


    }
}
