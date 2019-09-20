package com.worldwarofants.game.service;

import java.util.HashMap;
import com.worldwarofants.game.model.World;

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

    public PlayerService(Player player) {

    }

    /**
     * return the four core player attributes as a hashmap of <"attribute name", value>
     */
    public HashMap<String, Integer> getPlayerAttributes() {
        HashMap<String, Integer> attributeHashMap = new HashMap<String, Integer>();
        attributeHashMap.put("population", this.population);
        attributeHashMap.put("hitPoints", this.hitPoints);
        attributeHashMap.put("food", this.food);
        attributeHashMap.put("resources", this.resources);
        return attributeHashMap;
    }
}
