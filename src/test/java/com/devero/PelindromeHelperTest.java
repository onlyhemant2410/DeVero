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
public class PelindromeHelperTest {
    
    public PelindromeHelperTest() {
    }

    /**
     * Test of checkPelindrome method, of class PelindromeHelper.
     */
    @Test
    public void testCheckPelindrome() {
        String testStr = "soniyaayinos";
        //String testStr = "madam";
        
        assertTrue(PelindromeHelper.checkPelindrome(testStr));
    }

    /**
     * Test of main method, of class PelindromeHelper.
     */
    @Test
    public void testMain() {
    }
    
}
