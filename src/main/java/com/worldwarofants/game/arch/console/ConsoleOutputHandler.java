package com.worldwarofants.game.arch.console;

import java.util.concurrent.TimeUnit;
import com.worldwarofants.game.model.Player;

public class ConsoleOutputHandler{

    private static final long SPELL_DELAY = 100;

    //output the provided string in one line, character by character
    public static void spell(String input) {
        for(int i = 0; i < input.length(); i++) {
            System.out.print(input.charAt(i));
            try {
                TimeUnit.MILLISECONDS.sleep(SPELL_DELAY);
            }
            catch(InterruptedException e) {
                //if interrupted, clear the interrupt flag and continue
                Thread.currentThread().interrupt();              
            }
        }
    }
    //output the provided string in one line
    public static void post(String input) {
        System.out.println(input);   
    }
    //output a line break
    public static void lineBreak() {
        System.out.println(); 
    }

    public static void postPlayerAttributes(Player player) {
        String playerAttributes = String.format("[POPULATION: %s][HITPOINTS: %s][FOOD: %s][RESOURCES: %s]", player.population, player.hitPoints, player.food, player.resources);
        System.out.println(playerAttributes); 
    }

}