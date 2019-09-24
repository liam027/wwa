package com.worldwarofants.game.model;
/**
 * Player's class contains all information regarding player's resources and status
 */
public class Player {
    //TODO this player class represents the user, but we will
    //need other army teams as enemies. Potentially make a super
    //class "AntTeam" or something that player and opponents can extend
    //from?
    private int population;
    private int hitPoints;
    private int food;
    private int resources;

    public Player() {
        //TODO what these properties are and represent TBD by game design. Placeholder
        //properties from Issue #115 used currently. Default values are arbitrary at this time.
        this.population = 350;
        this.hitPoints = 10;
        this.food = 18;
        this.resources = 0;
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
