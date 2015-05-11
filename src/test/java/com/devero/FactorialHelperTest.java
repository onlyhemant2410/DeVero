/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devero;

import java.math.BigInteger;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hemant
 */
public class FactorialHelperTest {

    /**
     * Test of calculateFactorialRecursive method, of class FactorialHelper.
     */
    @Test
    public void testCalculateFactorialRecursive() throws Exception {

        assertEquals(6, FactorialHelper.calculateFactorialRecursive(3));
        assertEquals(1, FactorialHelper.calculateFactorialRecursive(0));

    }

    @Test
    public void testCalculateFactorialIterative() throws Exception {

        assertEquals(24, FactorialHelper.calculateFactorialIterative(4));
        assertEquals(1, FactorialHelper.calculateFactorialIterative(0));

    }

    @Test
    public void testCalculateFactorialRecursiveNegative() {

        try {
            int negativeNumber = -3;
            FactorialHelper.calculateFactorialRecursive(negativeNumber);
            assertTrue("Should not be able to calculate factorial of a negative number : " + negativeNumber, false);
        } catch (Exception ex) {
            assertTrue(true);
        }

    }

    @Test
    public void testCalculateFactorialIterativeNegative() throws Exception {

        try {
            int negativeNumber = -3;
            FactorialHelper.calculateFactorialIterative(negativeNumber);
            assertTrue("Should not be able to calculate factorial of a negative number : " + negativeNumber, false);
        } catch (Exception ex) {
            assertTrue(true);
        }

    }

}
