/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.junia.lw1;

/**
 *
 * @author maisa
 */
public class Exercise2 {
    public void loweCase(char input){
         char result = input;
         if(result >='A' && result <='Z')
             result = Character.toLowerCase(input);
         else result = input;
         
         System.out.println("Example2  " + result);
    }
}
