package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.IViewModel;
import com.worldwarofants.game.model.World;

public class NewGameViewModel implements IViewModel {

    public World world;

    public NewGameViewModel(World world){
        this.world = world;
    }
}
