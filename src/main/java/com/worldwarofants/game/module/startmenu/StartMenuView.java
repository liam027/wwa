package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractView;

public class StartMenuView extends AbstractView<StartMenuModel> {

	public StartMenuView(StartMenuModel viewModel) {
		super(viewModel);
	}
	
	public void renderStartMenuScreen() {
		line_break();
		spell("-- WORLD WAR OF ANTS --");
		line_break();
		post("* New Game - 'newGame'");
		post("* Load Game - 'loadGame'");
		post("* Exit - 'exitGame'");
		line_break();
		post("Please enter your command:");
	}
}
