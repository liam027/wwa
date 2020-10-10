package com.worldwarofants.game.module.startmenu;

import com.worldwarofants.game.arch.module.AbstractModule;
import com.worldwarofants.game.arch.module.IModuleNavigator;
import com.worldwarofants.game.model.World;
import com.worldwarofants.game.module.ModuleName;
import com.worldwarofants.game.ConsoleUI;

public class StartMenuModule extends AbstractModule<StartMenuCommandHandler> {

	public StartMenuModule(World world, IModuleNavigator navigator, ConsoleUI ui) {
		super(world, navigator, ui);
	}

	@Override
	protected StartMenuCommandHandler initDependencies() {
		StartMenuViewModel viewModel = new StartMenuViewModel();
		StartMenuView view = new StartMenuView(viewModel, ui);
		StartMenuController controller = new StartMenuController(view, navigator);
		return new StartMenuCommandHandler(controller);
	}

	@Override
	public ModuleName getModuleName() {
		return ModuleName.START_MENU;
	}
}
