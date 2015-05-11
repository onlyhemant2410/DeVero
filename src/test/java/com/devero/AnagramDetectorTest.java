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
public class AnagramDetectorTest {

    @Test
    public void testDetector() {
        String a = "Hemant";
        String b = "temanh";

        assertTrue("String " + a + " and " + b + " are not anagram.", AnagramDetector.detector(a, b));

    }

    @Test
    public void testDetectorNullString() {

        String a = null;
        String b = null;

        assertFalse("String " + a + " and " + b + " are anagram.", AnagramDetector.detector(a, b));

    }

    @Test
    public void testDetectorNotAnagram() {

        String a = "Hemant";
        String b = "Patel";

        assertFalse("String " + a + " and " + b + " are anagram.", AnagramDetector.detector(a, b));

    }

    @Test
    public void testDetectorSameString() {

        String a = "Hemant";
        String b = "hemant";

        assertTrue("String " + a + " and " + b + " are not anagram.", AnagramDetector.detector(a, b));

    }

}
