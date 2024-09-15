/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.junia.lw1;

import java.util.Calendar;

/**
 *
 * @author maisa
 */
public class Exercise7 {
    
    public void printNameAndDate(String[] args)
    {
       // System.out.println("\n"+ args[0] + args[1] + args[2]);
        if(args.length ==3)
        {
            String lastName = args[1].toUpperCase();
            String name = args[0];
            int year = Integer.parseInt(args[2]);
            int cYear = Calendar.getInstance().get(Calendar.YEAR);
            int age = cYear - year;
            
            System.out.println(lastName+" "+name+", "+age+" years old.");
        }
    }
}
