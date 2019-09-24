package com.worldwarofants.game.module.tutorial;

import java.util.HashMap;
import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.service.PlayerService;

public class TutorialController extends AbstractController<TutorialView> {

	public PlayerService playerService;

	public TutorialController(TutorialView view, IModuleNavigator navigator, PlayerService _playerService) {
		super(view, navigator);
		playerService = _playerService;
	}

	public void showTutorialScreenStart() {
		HashMap<String, Integer> playerAttributes = playerService.getPlayerAttributesHash();
		view.renderTutorialScreenStart(playerAttributes);
	}

	public void fight(){
		view.renderTutorialScreenFight();
		//since this is game-over, return to the start screen
		quit();
	}

	public void retreat(){
		view.renderTutorialScreenRetreat();
	}

	//return to main menu
	public void quit(){
		String[] args = new String[0];
		navigateTo(ModuleName.START_MENU, args);
	}

}
