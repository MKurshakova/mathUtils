package com.pjatk.example.mathutils.tests;

import com.pjatk.example.mathutils.MathUtils;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class MathUtilsTest {

    @Test
    public void test_fractions(){
        String result = MathUtils.simplifyFractionInString(1,2);
        assertThat(result, equalTo("1/2"));
        result = MathUtils.simplifyFractionInString(15,20);
        assertThat(result, equalTo("3/4"));
        result = MathUtils.simplifyFractionInString(120,5);
        assertThat(result,equalTo("24"));
        result = MathUtils.simplifyFractionInString(6,4);
        assertThat(result, equalTo("3/2"));

    }

}
