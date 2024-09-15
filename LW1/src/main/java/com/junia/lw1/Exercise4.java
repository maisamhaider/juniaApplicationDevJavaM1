/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.junia.lw1;

import java.util.Arrays;

/**
 *
 * @author maisa
 */
public class Exercise4 {
    
    public int[] sort(int[] array, boolean ascending ){
        // 5,5,4,4,3,2,2,2,5,8,8
    
        int aLength = array.length;
        
        int tem;
            for(int i=0; i<aLength-1; i++){
            for(int j=0; j<aLength-i-1; j++){
               if(ascending){
               if(array[j] > array[j+1]){
                    tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
               }
               }else{
               if(array[j] < array[j+1]){
                    tem = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tem;
                        }
                    }            
               }
            }
       
        return array;
    }
    
    public void print(int[] a){     
        System.out.print(Arrays.toString(a));
    }
}
