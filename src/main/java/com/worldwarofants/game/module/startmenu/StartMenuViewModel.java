package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.IViewModel;
import com.worldwarofants.game.model.World;
public class StartMenuViewModel implements IViewModel {
   
    public World world;

    public StartMenuViewModel(World _world){
        world = _world;
    }
}
