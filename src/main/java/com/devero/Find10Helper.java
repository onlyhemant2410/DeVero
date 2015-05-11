/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.devero;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author hemant
 */
public class Find10Helper {

    public static boolean find10( int[] array ){
        
        if(array ==null){
            return false;
        }
        
        Set<Integer> compliment = new HashSet<>();
        
        for(int number:array){
            if(compliment.contains(10-number)){
                return true;
            }else{
                compliment.add(number);
            }
        }
        
        return false;
    }
    
}
