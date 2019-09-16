package com.worldwarofants.game.arch;

import java.util.concurrent.TimeUnit;

/**
 * Views are the classes responsible for interacting with the console.
 * They mainly print and read.
 * Views should preferably be used only in the Controller classes.
 * If possible, separate views by "screens"/stages of the game.
 * For example, HomeScreenView, CombatScreenView, ScoutingScreenView.
 *
 * @see AbstractController
 * @author Veradux
 */
public abstract class AbstractView<VM extends IViewModel> {

    private VM viewModel;
    private static long spellDelay = 100;

    public AbstractView(VM viewModel) {
        this.viewModel = viewModel;
    }

    public VM getViewModel() {
        return viewModel;
    }

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
