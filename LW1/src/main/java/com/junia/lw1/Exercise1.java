/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.junia.lw1;

/**
 *
 * @author maisa
 */
public class Exercise1 {
     /*
    Write a program that evaluates the root of a quadratic equation (ax
2+bx+c)
(for this first exercise we consider the values a, b and c hard-coded)
For example:
 2x
2 –x–6 (a=2, b=-1 and c=-6) has two roots : x1= -1,5 and x2= 2
 9x
2 –6x+1 (a=9, b=-6 and c=1) has a unique root x1= 0,333 (one third)
 x
2 +3x+10 (a=1, b=3 and c=10) has no root
    */   
    public void quadraticEquation()
    {
        int a = 2;
        int b = -1;
        int c = -6;
        int x1 = -1;
        int x2 =  2;
        
       int result = (int) ((a * Math.pow(x1,2)) + (b * x2) + c) ; 
   
     System.out.println("Quadratic Equation " + result);
   
    }
    
   


   
}
