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
public class Exercise8 {
    
    public void sumAndMean(String[] args)
    {
        int length = args.length;
        int sum = 0 ;
        String number="";
        for(String num : args){
          sum +=  Integer.parseInt(num);
          number += num;
        }
        int mean = sum/length ;
     
        System.out.println();
        System.out.print("Number = ");
         for(String num : args){
          sum +=  Integer.parseInt(num);
          number += num;
          System.out.print(num+" ");

        }
        System.out.println("\nSum = "+sum);
        System.out.println("Mean = "+mean);
        
    }
    
}
