package com.worldwarofants.game.arch;

import com.worldwarofants.game.ConsoleUI;

/**
 * Views are the classes responsible for interacting with the console.
 * They mainly print and read.
 * Views should preferably be used only in the Controller classes.
 * If possible, separate views by "screens"/stages of the game.
 * For example, HomeScreenView, CombatScreenView, ScoutingScreenView.
 *
 * @see AbstractController
 * @author Veradux
 */
public abstract class AbstractView<VM extends IViewModel> {

    private VM viewModel;
    public ConsoleUI ui;

    public AbstractView(VM viewModel, ConsoleUI ui) {
        this.viewModel = viewModel;
        this.ui = ui;
    }

    public VM getViewModel() {
        return viewModel;
    }
}
