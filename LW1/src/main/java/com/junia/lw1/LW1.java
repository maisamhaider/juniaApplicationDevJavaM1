/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.junia.lw1;

/**
 *
 * @author maisa
 */
public class LW1 {

    public static void main(String[] args) {
 
        Exercise1 exp1 = new Exercise1();
        Exercise2 exp2 = new Exercise2();
        Exercise3 exp3 = new Exercise3();
        Exercise4 exp4 = new Exercise4();
        Exercise5 exp5 = new Exercise5();
        Exercise6 exp6 = new Exercise6();
        Exercise7 exp7 = new Exercise7();
        Exercise8 exp8 = new Exercise8();
        int[] a = {1,5,2,4,1,35,7,8,4,4,3,2,5};
        // --------------------------Exercise 1---------------------------------
        exp1.quadraticEquation();
        // --------------------------Exercise 2---------------------------------
        exp2.loweCase('a');
        // --------------------------Exercise 3---------------------------------
        exp3.calculateFactorial(4);
        // --------------------------Exercise 4---------------------------------
        System.out.print("Old Array:");
        exp4.print(a);
        System.out.println("");
        System.out.print("Sorted Array:");
        exp4.print(exp4.sort(a,false));
        
        // --------------------------Exercise 5---------------------------------
//        exp5.runTheCode();     
        // --------------------------Exercise 6---------------------------------
        //exp6.drawRectangle();     

        // --------------------------Exercise 7---------------------------------
        //exp7.printNameAndDate(args);
        // --------------------------Exercise 8---------------------------------
        exp8.sumAndMean(args);


    
     
   
    }

    
     

  
   
}
