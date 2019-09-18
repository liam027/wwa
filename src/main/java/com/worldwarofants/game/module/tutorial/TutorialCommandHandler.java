package com.worldwarofants.game.module.tutorial;

import java.util.Map;
import com.worldwarofants.game.arch.console.command.AbstractCommandHandler;
import com.worldwarofants.game.arch.console.command.ICommand;
import com.worldwarofants.game.module.ModuleName;

public class TutorialCommandHandler extends AbstractCommandHandler<TutorialController> {
	
	// public static final String COMMAND_SHOW_NEW_GAME_SCREEN = "showNewGameScreen";
	// public static final String COMMAND_START_NEW_GAME = "start";
	// public static final String COMMAND_BACK = "back";

	public TutorialCommandHandler(TutorialController controller) {
		super(controller);
	}

	@Override
	protected void defineCommands(Map<String, ICommand<TutorialController>> commands) {
		// commands.put(COMMAND_SHOW_NEW_GAME_SCREEN, (controller, args) -> controller.showNewGameScreen());
		// commands.put(COMMAND_START_NEW_GAME, (controller, args) -> controller.startNewGame());
		// commands.put(COMMAND_BACK, (controller, args) -> controller.back());
	}

	@Override
	public void executeStartingCommand(String[] arguments) {
		// executeCommand(COMMAND_SHOW_NEW_GAME_SCREEN);
	}
}
