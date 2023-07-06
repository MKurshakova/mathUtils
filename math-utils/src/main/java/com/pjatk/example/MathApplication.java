package com.pjatk.example;

import com.pjatk.example.mathutils.MathUtils;

public class MathApplication {


    public static void main(String[] args){

        System.out.println("5! to " + MathUtils.factorialRecursive(5)); //powinno być 120

        double[] polynomial = new double[3];
        polynomial[0] = 1;
        polynomial[1] = 0;
        polynomial[2] = -1;
        
        // współczynniki dla -x^2 + 1
        // inaczej: (-1)*x^2 + 0 * x + 1
        System.out.println("pole pod '-x^2 + 1' na przedziale [-1,1] to "
                + MathUtils.integralOfPolynomial(polynomial, -1, 1));// coś około 4/3 (1.33333...)


        System.out.println("5/10 po skróceniu to " + MathUtils.simplifyFractionInString(5,10));// powinno zwrócić 1/2


    }

}
