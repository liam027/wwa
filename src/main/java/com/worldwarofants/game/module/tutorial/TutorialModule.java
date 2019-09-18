package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.service.PlayerService;

public class TutorialModule extends AbstractModule<TutorialCommandHandler> {


	public TutorialModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
		
	}

	@Override
	protected TutorialCommandHandler initDependencies() {
		TutorialViewModel viewModel = new TutorialViewModel();
		TutorialView view = new TutorialView(viewModel);
		PlayerService playerService = new PlayerService(world);
		TutorialController controller = new TutorialController(view, navigator, playerService);
		return new TutorialCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.TUTORIAL;
	}

}
