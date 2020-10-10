package com.worldwarofants.game.module.newgame;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.ConsoleUI;

public class NewGameModule extends AbstractModule<NewGameCommandHandler> {

	public NewGameModule(World world, IModuleNavigator navigator, ConsoleUI ui) {
		super(world, navigator, ui);
	}

	@Override
	protected NewGameCommandHandler initDependencies() {
		NewGameViewModel viewModel = new NewGameViewModel();
		NewGameView view = new NewGameView(viewModel, ui);
		NewGameController controller = new NewGameController(view, navigator);
		return new NewGameCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.NEW_GAME;
	}

}
