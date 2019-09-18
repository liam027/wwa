package com.worldwarofants.game.model;

import java.util.Map;
import java.util.HashMap;
/**
 * This si the player class to handle the player's resources.
 */
public class Player {

    public HashMap<String, Integer> attributes = new HashMap<String, Integer>();
    public int number;

    public Player() {
        this.attributes.put("population",350);
        this.attributes.put("hitPoints",10);
        this.attributes.put("food",18);
        this.attributes.put("resources",0);
    }
}
