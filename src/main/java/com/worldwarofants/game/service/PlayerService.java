package com.worldwarofants.game.service;

import com.worldwarofants.game.model.World;
import com.worldwarofants.game.model.Player;

/**
* Provides service for accessing player data
 */
public class PlayerService {

    private Player player;

    public PlayerService(World world) {
        player = world.getPlayer();
    }
}
