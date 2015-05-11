/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devero;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author hemant
 */
public class Find10HelperTest {

    public Find10HelperTest() {
    }

    /**
     * Test of find10 method, of class Find10Helper.
     */
    @Test
    public void testFind10() {
        int[] testArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        assertTrue("Array Should pass find10 test : " + testArray, Find10Helper.find10(testArray));

        int[] testArray1 = {1, 1, 1, 9};

        assertTrue("Array Should pass find10 test : " + testArray1, Find10Helper.find10(testArray1));

        int[] testArray2 = {-3, 13, 3, 4, 5};

        assertTrue("Array Should pass find10 test : " + testArray2, Find10Helper.find10(testArray2));

    }

    /**
     * Test of find10 method, of class Find10Helper.
     */
    @Test
    public void testFind10Fail() {
        int[] testArray = {};

        assertFalse("Array Should not pass find10 test : " + testArray, Find10Helper.find10(testArray));

        int[] testArray1 = {1, 1, 1, 8};

        assertFalse("Array Should not pass find10 test : " + testArray1, Find10Helper.find10(testArray1));

        int[] testArray2 = {-3, -13, 3, 4, 5};

        assertFalse("Array Should pass find10 test : " + testArray2, Find10Helper.find10(testArray2));

        int[] testArray3 = null;

        assertFalse("Array Should pass find10 test : " + testArray3, Find10Helper.find10(testArray3));
    }

}
