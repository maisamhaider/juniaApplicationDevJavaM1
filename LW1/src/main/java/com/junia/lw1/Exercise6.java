/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.junia.lw1;

import java.util.Scanner;

/**
 *
 * @author maisa
 */
public class Exercise6 {
    
   private int width = 0;
   private  int height = 0;
    Scanner scanner = new Scanner(System.in);
    
    public void drawRectangle(){
    
        System.out.println("\nEnter Width:");
        width  = Math.abs(Integer.parseInt(scanner.nextLine()) );
        System.out.print("Enter Height:");
        height  = Math.abs(Integer.parseInt(scanner.nextLine())) ;
       
        
        printHorizontalLine(width);
        printVerticalLine(width,height);
        printHorizontalLine(width);

        
    }
    public void printVerticalLine(int width, int height){
        for(int i=0; i<=height-3; i++){
            System.out.println("");
            for(int j=0; j<=width; j++){
            rectangleBlocks(j,width,"+"," ");
        } 
        }
        System.out.println("");

    }
    public void printHorizontalLine(int width){
        for(int i=0; i<=width; i++){
       rectangleBlocks(i,width,"+","-");
        }
    }
    public void rectangleBlocks(int index, int width,String firstSign, String secondSign)
    {
         if(index==0 || index==width) System.out.print(firstSign); else System.out.print(secondSign);
            
    }
}
