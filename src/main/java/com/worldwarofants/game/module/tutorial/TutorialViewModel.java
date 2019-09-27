package com.worldwarofants.game.module.tutorial;

import java.util.Map;
import java.util.HashMap;
import com.worldwarofants.game.arch.IViewModel;

public class TutorialViewModel implements IViewModel {

    //TODO format to be reviewed once attributes have been decided.
    public final static String PLAYER_ATTRIBUTE_FORMAT = "[%s: %s]   ";
    
    /**
     * formats the four 4 core player attributes into a console friendly string
     */
    public String formatPlayerAttributes(HashMap<String, Integer> attributes) {
        String output = "";
        for(Map.Entry<String, Integer> entry : attributes.entrySet()) {
            String attribute = entry.getKey().toUpperCase();
            String value = entry.getValue().toString();
            String formattedAttribute = String.format(PLAYER_ATTRIBUTE_FORMAT, attribute, value);
            output += formattedAttribute;
        }
        return output;  
    }
}
