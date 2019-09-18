package com.worldwarofants.game.module.tutorial;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;

public class TutorialModule extends AbstractModule<TutorialCommandHandler> {

	public TutorialModule(World world, IModuleNavigator navigator) {
		super(world, navigator);
	}

	@Override
	protected TutorialCommandHandler initDependencies(World _world) {
		TutorialViewModel viewModel = new TutorialViewModel(_world);
		TutorialView view = new TutorialView(viewModel);
		TutorialController controller = new TutorialController(view, navigator);
		return new TutorialCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.TUTORIAL;
	}

}
