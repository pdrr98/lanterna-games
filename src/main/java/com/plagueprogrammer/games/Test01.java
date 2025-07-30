package com.plagueprogrammer.games;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.gui2.*;

public class Test01 {
    Test02 test2 = new Test02();
    Tutorial04 t4 = new Tutorial04();
    Tutorial03 t3 = new Tutorial03();
    Tutorial02 t2 = new Tutorial02();
    Tutorial01 t1 = new Tutorial01();

    DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();

    public void run() {

        try {

            Terminal terminal = defaultTerminalFactory.createTerminal();
            terminal.setBackgroundColor(TextColor.ANSI.BLUE);
            terminal.setForegroundColor(TextColor.ANSI.YELLOW);

            Thread.sleep(5000);
            terminal.enterPrivateMode();

            Thread.sleep(5000);
            Screen screen = defaultTerminalFactory.createScreen();
            screen.startScreen();

            Thread.sleep(5000);
            final TextGraphics textGraphics = terminal.newTextGraphics();

            // terminal.exitPrivateMode();
            Thread.sleep(1000);

            terminal.setCursorVisible(false);
            Thread.sleep(1000);
            terminal.setCursorVisible(true);
            Thread.sleep(1000);

            textGraphics.setForegroundColor(TextColor.ANSI.WHITE);

            Thread.sleep(1000);
            textGraphics.setBackgroundColor(TextColor.ANSI.BLACK);
            Thread.sleep(1000);

            textGraphics.putString(terminal.getCursorPosition(), "ASIESASIE");
            textGraphics.putString(2, 1, "Lanterna Tutorial 2 - Press ESC to exit", SGR.BOLD);
            textGraphics.setForegroundColor(TextColor.ANSI.DEFAULT);
            textGraphics.setBackgroundColor(TextColor.ANSI.DEFAULT);
            textGraphics.putString(5, 3, "Terminal Size: ", SGR.BOLD);
            textGraphics.putString(5 + "Terminal Size: ".length(), 3, terminal.getTerminalSize().toString());
            // terminal.flush();
            Thread.sleep(5000);
            terminal.exitPrivateMode();
            Thread.sleep(5000);
            screen.clear();
            Thread.sleep(5000);
            terminal.close();
        } catch (Exception e) {

        }
        // finally {
        // if (terminal != null) {
        // try {
        // /*
        // * Closing the terminal doesn't always do something, but if you run the Swing
        // or
        // * AWT bundled terminal
        // * emulators for example, it will close the window and allow this application
        // to
        // * terminate. Calling it
        // * on a UnixTerminal will not have any affect.
        // */
        // terminal.close();
        // } catch (IOException e) {
        // e.printStackTrace();
        // }
        // }
        // }

    }
}
