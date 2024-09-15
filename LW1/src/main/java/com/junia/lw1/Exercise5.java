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
public class Exercise5 {
    
    Scanner scanner = new Scanner(System.in);
    
    public void runTheCode()
    {
    System.out.println("\nType here: ");
    String input = scanner.nextLine();
        
    int vowels= 0;
    int consonants = 0;
    int spaces= 0;
    
    for(char ch : input.toCharArray()){
         
        if(isVowel(ch))
        {
            vowels++;
        } else if(isConsonants(ch)){
            consonants++;
        } else if(isSpace(ch)){
           spaces++;
        }
    }
        
        System.out.println("vowels = "+vowels);
        System.out.println("consonants = "+consonants);
        System.out.println("spaces = " + spaces);
    }
    public boolean isVowel(char c){
    
        return "aeiouy".indexOf(c)!=-1;
    }
    public boolean isConsonants(char c){
        return Character.isAlphabetic(c) && 
                !Character.isDigit(c) &&
                !isVowel(c);
    }
    public boolean isSpace(char c){
        return Character.isSpaceChar(c);
    }
    
}
