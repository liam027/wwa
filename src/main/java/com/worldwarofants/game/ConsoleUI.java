package com.worldwarofants.game;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.swing.SwingTerminalFrame;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.TerminalSize;



public class ConsoleUI {

    Terminal terminal;
    Screen screen;
    final static int TERMINAL_COLUMNS = 100;
    final static int TERMINAL_ROWS = 45;
 
    public ConsoleUI() throws IOException {
        TerminalSize size = new TerminalSize(TERMINAL_COLUMNS,TERMINAL_ROWS);
        terminal = new DefaultTerminalFactory().setInitialTerminalSize(size).createTerminalEmulator();
        screen = new TerminalScreen(terminal);
        screen.startScreen();

        TextGraphics tg = screen.newTextGraphics();
        screen.refresh();
        screen.readInput();
        screen.stopScreen();
    }

    public void post(String input) {
        TextGraphics message = screen.newTextGraphics();
        message.putString(50, 0, input);
    }
}