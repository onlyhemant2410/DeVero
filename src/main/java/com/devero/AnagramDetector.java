/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devero;

import java.util.Arrays;

/**
 *
 * @author hemant
 */
public class AnagramDetector {

    public static boolean detector(String a, String b) {

        //if strings are null or the length of the string do not match, the are not anagram
        if (a == null || b == null || a.length() != b.length()) {
            return false;
        }

        char[] arrayA = a.toLowerCase().toCharArray();
        char[] arrayB = b.toLowerCase().toCharArray();

        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        //if string are anagram, they should match after sorting.
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayA[i] != arrayB[i]) {
                return false;
            }
        }

        return true;
    }

}
