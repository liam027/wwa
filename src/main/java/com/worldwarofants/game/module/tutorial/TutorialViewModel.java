package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.IViewModel;
import com.worldwarofants.game.model.World;

public class TutorialViewModel implements IViewModel {
    
    public World world;

    public TutorialViewModel(World world){
        this.world = world;
    }
}
