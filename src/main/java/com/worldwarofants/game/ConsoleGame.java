package com.worldwarofants.game;

import java.io.IOException;
import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.ModuleManager;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.startmenu.StartMenuModule;
import com.worldwarofants.game.module.newgame.NewGameModule;
import com.worldwarofants.game.module.tutorial.TutorialModule;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.ConsoleUI;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;

import java.util.Scanner;

/**
 * The ConsoleGame class is the one that controls the main game loop.
 * It is where console commands come in, and are executed.
 * This is also where you set up the game modules.
 *
 * @author Veradux
 */
public class ConsoleGame extends ModuleManager {

    public static final String COMMAND_SHOW_GAME_TITLE = "showTitle";

    private final ConsoleUI consoleUI;
    private World world;

    ConsoleGame() throws IOException  {
        consoleUI = new ConsoleUI();
    }

    /**
     * This is the main game loop.
     * It keeps track of the current Module.
     * The current Module is the last one to which a Controller has navigated to.
     *
     * @see IModuleNavigator
     * @see AbstractController
     */
    public void run() {
        // execute the starting command in this module
        currentModule.start(null);

        while (world.isGameRunning()) {
            // This is how to let the user execute commands.
            // Nothing else will need to be added here.
            //KeyStroke input = consoleUI.terminal.readInput();
            //if(input.getKeyType() != KeyType.Enter) {
               // consoleUI.terminal.putCharacter(input.getCharacter());
            //}
            //currentModule.executeCommand();
        }
    }

    @Override
    protected AbstractModule defineStartingModule(IModuleNavigator navigator) {
        return new StartMenuModule(world, navigator, consoleUI);
    }

    @Override
    protected void defineModules(IModuleNavigator navigator) {
        addModule(new NewGameModule(world, navigator));
        addModule(new TutorialModule(world, navigator));
    }

    @Override
    protected void initDatabase() {
        world = new World();
    }
}
