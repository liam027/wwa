package com.worldwarofants.game.model;

import java.util.HashMap;

/**
 * Player's class contains all information regarding player's resources and status
 */
public class Player {

    private int population;
    private int hitPoints;
    private int food;
    private int resources;

    public Player() {
        this.population = 350;
        this.hitPoints = 10;
        this.food = 18;
        this.resources = 0;
    }

    /**
     * return the four core player attributes as a hashmap of <"attribute name", value>
     */
    public HashMap<String, Integer> getPlayerAttributes(){
        HashMap<String, Integer> attributeHashMap = new HashMap<String, Integer>();
        attributeHashMap.put("population", this.population);
        attributeHashMap.put("hitPoints", this.hitPoints);
        attributeHashMap.put("food", this.food);
        attributeHashMap.put("resources", this.resources);
        return attributeHashMap;
    }

}
