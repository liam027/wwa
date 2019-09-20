package com.worldwarofants.game.service;

import java.util.HashMap;
import com.worldwarofants.game.model.Player;

/**
 * <p>This is an example Service class.
 * The purpose of it is to be used by the Controllers to access specific info from the world. </p>
 * <p>
 * Services should not be split logically like the rest of the components.
 * They should be split by what they access from the World.
 * Because the Service classes will be reused between Modules.
 * One Controller can have access to many Services, or it can have access to none at all. </p>
 *
 * @see com.worldwarofants.game.arch.AbstractController
 */
public class PlayerService {

    Player player;

    public PlayerService(Player _player) {
        this.player = _player;
    }

    public HashMap<String, Integer> getAttributes() {
        return player.getAttributes();
    }

}
