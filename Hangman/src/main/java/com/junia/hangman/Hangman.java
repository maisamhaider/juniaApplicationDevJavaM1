/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.junia.hangman;

import java.util.Scanner;

/**
 *
 * @author maisa
 */
public class Hangman {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int attempts = 10;
        boolean won = false;
        String foundChars="";
        boolean foundflag =false;

        // heading for the First Player
        println("First Player: ");

        // We show message to enter a word and take input using scanner.
        println("Enter the secret word: ");
        String secretWord = scanner.nextLine().toUpperCase();
        
       // Just printing empty 20 line to move the entered word at top.
        for(int i=0; i<20; i++){
            println(" ");
        }
        
        printFoundCharAndSymbles(secretWord,foundChars);
        println("\nSecond Player: ");
        

       // here we take charactor from user and see if that is in the secred word 
       // or not. decrease attempts on wrong attempt, call printFoundCharAndSymbles
       // for printing the symbols and words but also checking if the word is found or not.
       //
       while(attempts>1 && !won ){
           
           char ch = scanner.next().toUpperCase().charAt(0);
           for(int i=0; i<secretWord.length(); i++){
            if(secretWord.toCharArray()[i]==ch && !foundChars.contains(Character.toString(ch))){
            foundflag=true;
            foundChars+=ch;
            }
        }
           if(!foundflag){
           attempts--;
           if(attempts==0){
            
             println("Good luck next time, Remaining Attempts: "+attempts);

           }else{
               println("Remaining Attempts: "+attempts);
           }
         
           }else if(printFoundCharAndSymbles(secretWord,foundChars)){
            won = true;
            println("Congratulations, :)"); 
          
           }
           foundflag =false;         

       }
        
        
    }
    /*
    this funtion/method print symbols and found charactors and return boolean if all 
    characters are found or not. we use the return value for final message.
    */
    public static boolean printFoundCharAndSymbles(String secretWord,String foundChars ){
        String word = "";
        for(int i=0; i<secretWord.length(); i++){
            boolean print_ = true;
            for(char ch : foundChars.toCharArray()){
                if(secretWord.charAt(i) == ch){
                print_=false;
                print(ch+" ");
                word += ch;
                }
            }
          
            if(print_) {
                print("_ ");
            word += "_ ";       
            }      
        }
        return word.equalsIgnoreCase(secretWord);
    }
   
    public static void println(String text){
        System.out.println(text);
    }
    public static void print(String text){
        System.out.print(text);
    }
}
