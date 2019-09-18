package com.worldwarofants.game.model;

/**
 * This si the player class to handle the player's resources.
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

}
