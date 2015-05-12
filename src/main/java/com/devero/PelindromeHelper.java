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
public class PelindromeHelper {
    
    public static boolean checkPelindrome(String input){
        
        if(input==null || input.trim().isEmpty()){
            return false;
        }
        
        char[] strippedStr = input.trim().toLowerCase().toCharArray();
        
        for(int i = (input.length()/2)-1,j=input.length()-(input.length()/2);i>=0;i--,j++){
            if(strippedStr[i] != strippedStr [j]){
                return false;
            }
        }
        
        return true;
    }
    
}
