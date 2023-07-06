package com.pjatk.example.mathutils.tests;

import com.pjatk.example.mathutils.MathUtils;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;

public class IntegralTest {


    @Test
    public void test_integrals(){
        double[] polynomial = new double[3];
        polynomial[0] = 1;
        polynomial[1] = 0;
        polynomial[2] = -1;

        double result = MathUtils.integralOfPolynomial(polynomial, -1,1);
        assertThat(result, lessThan(1.34));
        assertThat(result, greaterThan(1.33));
    }

}
