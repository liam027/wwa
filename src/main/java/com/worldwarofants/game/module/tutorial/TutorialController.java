package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.AbstractController;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.module.ModuleName;

public class TutorialController extends AbstractController<TutorialView> {

	public TutorialController(TutorialView view, IModuleNavigator navigator) {
		super(view, navigator);
	}

	public void showTutorialScreenStart() {
		view.renderTutorialScreenStart();
	}

	public void continueTheFight(){

	}

	public void fallBack(){

	}

	//quit back to main menu
	public void quit(){
		
	}

}
