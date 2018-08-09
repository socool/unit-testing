package com.bcorpse.unittesing.spike;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class AssertJTest {
    @Test
    public void learning(){
        List<Integer> numbers = Arrays.asList(12,15,45);
//      assertThat(numbers,hasSize(3));
        assertThat(numbers)
                .hasSize(3)
                .contains(12,45)
                .allMatch(x -> x >10)
                .allMatch(x -> x < 50)
                .noneMatch(x -> x < 0);

        assertThat("").isEmpty();
        assertThat("ABCDE")
                .contains("BCD")
                .startsWith("ABC")
                .endsWith("CDE");
//      assertThat("",isEmptyString());
//      assertThat("ABCDE",containsString("BCD"));
//      assertThat("ABCDE",containsString("ABC"));
//      assertThat("ABCDE",endsWith("CDE"));
    }
}
