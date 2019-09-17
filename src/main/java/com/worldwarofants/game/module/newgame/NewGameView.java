package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class NewGameView extends AbstractView<NewGameViewModel> {

	public NewGameView(NewGameViewModel viewModel) {
		super(viewModel);
	}

	public void renderNewGameScreen() {
		ConsoleOutputHandler.line_break();
		ConsoleOutputHandler.spell("-- GAME SETUP --");
		ConsoleOutputHandler.line_break();
		ConsoleOutputHandler.post("* Start Game - 'startGame'");
		ConsoleOutputHandler.post("* Species Selection - 'Not Available'");
		ConsoleOutputHandler.post("* Back - 'back'");
		ConsoleOutputHandler.line_break();;
		ConsoleOutputHandler.post("Please enter your command:");
	}
}
