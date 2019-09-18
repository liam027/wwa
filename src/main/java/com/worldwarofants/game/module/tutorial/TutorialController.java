package com.worldwarofants.game.module.tutorial;

import java.util.Map;
import java.util.HashMap;
import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.Player;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.service.PlayerService;
public class TutorialController extends AbstractController<TutorialView> {

	protected PlayerService playerService;

	public TutorialController(TutorialView view, IModuleNavigator navigator, PlayerService _playerService) {
		super(view, navigator);
		this.playerService = _playerService;
	}

	public void showTutorialScreenStart() {
		view.renderTutorialScreenStart(playerService);
	}

	public void continueTheFight(){
		view.renderTutorialScreenContinue();
		quit();
	}

	public void fallBack(){
		view.renderTutorialScreenFallBack();
	}

	//return to main menu
	public void quit(){
		String[] args = new String[0];
		moduleNavigator.navigateTo(ModuleName.START_MENU, args);
	}

}
