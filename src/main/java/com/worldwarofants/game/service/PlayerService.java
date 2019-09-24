package com.worldwarofants.game.service;

import java.util.HashMap;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.model.Player;

/**
* Provides the service to access player data
 */
public class PlayerService {

    private Player player;

    public PlayerService(World world) {
        player = world.getPlayer();
    }

    /**
     * returns the four core player attributes as a hashmap of <"attribute name", value>
     */
    public HashMap<String, Integer> getPlayerAttributesHash() {
        //TODO what stats are included in this TBD
        HashMap<String, Integer> playerAttributes = new HashMap<String, Integer>();
        playerAttributes.put("population", player.getPopulation());
        playerAttributes.put("hitPoints", player.getHitPoints());
        playerAttributes.put("food", player.getFood());
        playerAttributes.put("resources", player.getResources());
        return playerAttributes;
    }
}
