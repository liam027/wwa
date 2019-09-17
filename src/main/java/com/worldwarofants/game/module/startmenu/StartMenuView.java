package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class StartMenuView extends AbstractView<StartMenuModel> {

	public StartMenuView(StartMenuModel viewModel) {
		super(viewModel);
	}
	
	public void renderStartMenuScreen() {
		ConsoleOutputHandler.line_break();
		ConsoleOutputHandler.spell("-- WORLD WAR OF ANTS --");
		ConsoleOutputHandler.line_break();
		ConsoleOutputHandler.post("* New Game - 'newGame'");
		ConsoleOutputHandler.post("* Load Game - 'loadGame'");
		ConsoleOutputHandler.post("* Exit - 'exitGame'");
		ConsoleOutputHandler.line_break();
		ConsoleOutputHandler.post("Please enter your command:");
	}
}
