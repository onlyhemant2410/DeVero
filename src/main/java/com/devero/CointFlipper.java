/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devero;

/**
 *
 * @author hemant
 */
public class CointFlipper {

    private static int headsCount = 0;

    //We will change the outcome to TAIL on 6th occurence of HEAD;
    private static final int reverseHeadIndicator = 6;

    public static CoinFace goodHeadsOrTails() {

        if (CoinFace.HEAD == badHeadsOrTails()) {
            if (headsCount == reverseHeadIndicator) {
                headsCount = 0;
                return CoinFace.TAIL;
            }
            headsCount++;
            return CoinFace.HEAD;
        }

        return CoinFace.TAIL;

    }

    public static CoinFace badHeadsOrTails() {
        double flipRatio = 0.6d;

        if (Math.random() <= flipRatio) {
            return CoinFace.HEAD;
        }

        return CoinFace.TAIL;

    }

    enum CoinFace {

        HEAD, TAIL;
    }

}
