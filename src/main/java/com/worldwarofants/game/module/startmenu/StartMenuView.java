package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class StartMenuView extends AbstractView<StartMenuViewModel> {

	public StartMenuView(StartMenuViewModel viewModel) {
		super(viewModel);
	}
	
	public void renderStartMenuScreen() {
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spell("-- WORLD WAR OF ANTS --");
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post("* New Game - 'new'");
		ConsoleOutputHandler.post("* Exit - 'exit'");
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post("Please enter your command:");
	}
}
