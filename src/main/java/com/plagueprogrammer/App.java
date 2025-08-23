package com.plagueprogrammer;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;

public class App {
    DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();

    public void runApp() {

        try {
            Terminal terminal = defaultTerminalFactory.createTerminal();
            TextGraphics textGraphics = terminal.newTextGraphics();
            SplashArt splashArt = new SplashArt(terminal, textGraphics);
            Menu menu = new Menu(terminal, textGraphics);

            splashArt.showSplashArt();
            menu.showMenu();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
