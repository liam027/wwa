package com.worldwarofants.game.arch.console;

import java.util.concurrent.TimeUnit;

public class ConsoleOutputHandler{

    private static long spellDelay = 100;

    //output the provided string in one line, character by character
    public static void spell(String input){
        for(int i = 0; i < input.length(); i++){
            System.out.print(input.charAt(i));
            try{
                TimeUnit.MILLISECONDS.sleep(spellDelay);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    //output the provided string in one line
    public static void post(String input){
        System.out.println(input);   
    }
    //output a line break
    public static void line_break(){
        System.out.println(); 
    }
}