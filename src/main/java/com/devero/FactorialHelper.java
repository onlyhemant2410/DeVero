/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devero;

import java.math.BigInteger;

/**
 *
 * @author hemant
 */
public class FactorialHelper {

    public static long calculateFactorialRecursive(int number) throws Exception {

        if (number < 0) {
            throw new Exception("Number must be a positive integer to calculate factorial");
        }

        //Factorial of zero is one
        if (number == 0) {
            return 1;
        }

        return calculateFactorialRecursive(number - 1) * number;

    }

    public static long calculateFactorialIterative(int number) throws Exception {

        if (number < 0) {
            throw new Exception("Number must be a positive integer to calculate factorial");
        }

        long factorial = 1;

        for (; number > 0; number--) {
            factorial = factorial * number;
        }

        return factorial;
    }

}
