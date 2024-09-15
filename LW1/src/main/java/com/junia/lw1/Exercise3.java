/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.junia.lw1;

/**
 *
 * @author maisa
 */
public class Exercise3 {
 
        public void calculateFactorial(int n){
 
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("Exercise3 : Factorial using for loop: " + factorialForLoop(n));
            System.out.println("Exercise3 : Factorial using while loop: " + factorialWhileLoop(n));
            System.out.println("Exercise3 : Factorial using recursion: " + factorialRecursive(n));
      
            }
       }

    public static long factorialForLoop(int n) {
        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    public static long factorialWhileLoop(int n) {
        long factorial = 1;
        int i = 1;
        while (i <= n) {
            factorial *= i;
            i++;
        }
        return factorial;
    }

    public static long factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRecursive(n - 1);
        }
    }

}
