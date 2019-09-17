package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class NewGameView extends AbstractView<NewGameViewModel> {

	public NewGameView(NewGameViewModel viewModel) {
		super(viewModel);
	}

	public void renderNewGameScreen() {
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spell("-- GAME SETUP --");
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post("* Start Game - 'startGame'");
		ConsoleOutputHandler.post("* Back - 'back'");
		ConsoleOutputHandler.lineBreak();;
		ConsoleOutputHandler.post("Please enter your command:");
	}
}
