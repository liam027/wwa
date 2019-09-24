package com.worldwarofants.game.model;
/**
 * Player's class contains all information regarding player's resources and status
 */
public class Player {
    //TODO this player class represents the user, but we will
    //need other army teams as enemies. Potentially make a super
    //class "AntTeam" or something that player and opponents can extend
    //from?
    private final static int STARTING_POPULATION = 350;
    private final static int STARTING_HIT_POINTS = 10;
    private final static int STARTING_FOOD = 18;
    private final static int STARTING_RESOURCES = 0;

    private int population;
    private int hitPoints;
    private int food;
    private int resources;

    public Player() {
        //TODO what these properties are and represent TBD by game design. Placeholder
        //properties from Issue #115 used currently. Default values are arbitrary at this time.
        this.population = STARTING_POPULATION;
        this.hitPoints = STARTING_HIT_POINTS;
        this.food = STARTING_FOOD;
        this.resources = STARTING_RESOURCES;
    }

    public int getPopulation(){
        return this.population;
    }
    public int getHitPoints(){
        return this.hitPoints;
    }
    public int getFood(){
        return this.food;
    }
    public int getResources(){
        return this.resources;
    }
}
