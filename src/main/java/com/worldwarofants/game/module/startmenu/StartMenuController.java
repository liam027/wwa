package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.ModuleName;

public class StartMenuController extends AbstractController<StartMenuView> {

	public StartMenuController(StartMenuView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showStartMenu() {
		view.renderStartMenuScreen();
	}

	public void navigateToNewGameModule() {
		moduleNavigator.navigateTo(ModuleName.NEW_GAME);
	}
}
