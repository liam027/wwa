package com.worldwarofants.game.module.startmenu;

import java.util.Map;

import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;

public class StartMenuCommandHandler extends AbstractCommandHandler<StartMenuController> {
	public static final String COMMAND_SHOW_GAME_SCREEN = "showGameScreen"; 
	public static final String COMMAND_NEW_GAME = "newGame";
	
	public StartMenuCommandHandler(StartMenuController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<StartMenuController>> commands) {
		commands.put(COMMAND_SHOW_GAME_SCREEN, (controller, args) -> controller.showStartMenu());
		commands.put(COMMAND_NEW_GAME, (controller, args) -> controller.navigateToNewGameModule());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		executeCommand(COMMAND_SHOW_GAME_SCREEN);
	}

}
