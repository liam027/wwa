package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.AbstractView;
import com.worldwarofants.game.arch.console.ConsoleOutputHandler;

public class TutorialView extends AbstractView<TutorialViewModel> {

	public TutorialView(TutorialViewModel viewModel) {
		super(viewModel);
	}

	public void renderTutorialScreenStart() {
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.spell("Your colony is under attack! You are on the brink of defeat and you must fall back in order to avoid complete annihilation! ...");
		ConsoleOutputHandler.lineBreak();
		ConsoleOutputHandler.post("* Continue the fight! - 'fight'");
		ConsoleOutputHandler.post("* Fall back! - 'fallBack'");
		ConsoleOutputHandler.post("* Quit - 'quit'");
		ConsoleOutputHandler.lineBreak();;
		ConsoleOutputHandler.post("Please enter your command:");
	}

	public void renderTutorialScreenContinue() {

	}
}
