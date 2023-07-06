package com.pjatk.example.mathutils.tests;

import com.pjatk.example.mathutils.MathUtils;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class FactorialTest {
    @Test
    public void test_if_utils_properly_counts_factorial(){
        int result = MathUtils.factorial(5);
        assertThat(result, is(120));
        result = MathUtils.factorialRecursive(5);
        assertThat(result, is(120));
        result = MathUtils.factorial(6);
        assertThat(result, is(720));
        result = MathUtils.factorialRecursive(6);
        assertThat(result, is(720));
    }

}
