package com.pjatk.example.mathutils;

import java.util.Arrays;
import java.util.stream.IntStream;

public class MathUtils {

    /*
        Funkcja oblicza n!
     */
    public static int factorial(int n)  {
        if(n < 0){
            return 0;
        }else if(n == 0) {
            return 1;
        }
       int result=1;
       for(int i=1; i <= n; i++){
           result *= i;
       }
        return result;
    }

    /*
        Funkcja oblicza n! (zastosować rekurencję)
     */
    public static int factorialRecursive(int n){
        if(n < 0){
            return 0;
        }
        if(n == 0){
            return 1;
        }else {
            return factorialRecursive(n - 1) * n;
        }
    }

    /*
        Funkcja oblicza przyblożoną całkę oznaczoną od a do b dla wielomiany o podanych w tabeli współczunnikach
        (całka oznaczona to pole powierzchni pod wykresem wielomianu na przedziale [a,b])
     */
    public static double integralOfPolynomial(double[] coefficients,double a, double b){
        double integral = 0.0;

        for (int i = 0; i < coefficients.length; i++) {
            double power = coefficients.length - i;

            // Obliczanie wartości wielomianu dla danego x
            double x_a = Math.pow(a, power);
            double x_b = Math.pow(b, power);
            double term = coefficients[i] * (x_b - x_a) / power;

            // Dodawanie wartości kolejnych składników
            integral += term;
        }

        return integral;
    }

    public static double integralOfPolynomialStream(double[] coefficients,double a, double b){
        return IntStream.range(0, coefficients.length)
                .mapToDouble(i -> {
                    double power = coefficients.length - i;
                    double x_a = Math.pow(a, power);
                    double x_b = Math.pow(b, power);
                    return coefficients[i] * (x_b - x_a) / power;
                })
                .sum();
    }

    /*
        Funkcja przedstawia nieskracalny ułamek w postaci a/b
        np. dla 9/12 zwróci "3/4"
                15/5 zwróci "3"
     */
    public static String simplifyFractionInString(int meter, int denominator){
        int gcd = greatestCommonDivisor(meter, denominator);
        int simplifiedMeter = meter / gcd;
        int simplifiedDenominator = denominator / gcd;

        return simplifiedDenominator == 1 ?
                String.valueOf(simplifiedMeter) : simplifiedMeter + "/" + simplifiedDenominator;
    }

    public static int greatestCommonDivisor(int a, int b) {
        return b == 0 ? a : greatestCommonDivisor(b, a % b);
    }


}
