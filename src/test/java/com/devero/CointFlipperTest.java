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
public class CointFlipperTest {

    public CointFlipperTest() {
    }

    /**
     * Test of goodHeadsOrTails method, of class CointFlipper.
     */
    @Test
    public void testGoodHeadsOrTails() {

        int headsCount = 0, tailsCount = 0;

        for (int i = 0; i < 1000; i++) {
            if (CointFlipper.CoinFace.HEAD == CointFlipper.goodHeadsOrTails()) {
                headsCount++;
            } else {
                tailsCount++;
            }

        }

        System.out.println("testGoodHeadsOrTails");
        System.out.println("Heads Count : " + headsCount);
        System.out.println("Tails Count : " + tailsCount);
        System.out.println();
    }

    @Test
    public void testBadHeadsOrTails() {

        int headsCount = 0, tailsCount = 0;

        for (int i = 0; i < 1000; i++) {
            if (CointFlipper.CoinFace.HEAD == CointFlipper.badHeadsOrTails()) {
                headsCount++;
            } else {
                tailsCount++;
            }

        }

        System.out.println("testBadHeadsOrTails");
        System.out.println("Heads Count : " + headsCount);
        System.out.println("Tails Count : " + tailsCount);
        System.out.println();
    }

}
