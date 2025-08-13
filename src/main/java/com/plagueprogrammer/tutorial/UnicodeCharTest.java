package com.plagueprogrammer.tutorial;

import java.io.IOException;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class UnicodeCharTest {
    public void run() {
        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        /*
         * The DefaultTerminalFactory can be further tweaked, but we'll leave it with
         * default settings in this tutorial.
         */

        Terminal terminal = null;
        try {
            /*
             * Let the factory do its magic and figure out which implementation to use by
             * calling createTerminal()
             */
            terminal = defaultTerminalFactory.createTerminal();

            final TextGraphics tg = terminal.newTextGraphics();
            int x = terminal.getCursorPosition().getRow();
            x += 10;
            int y = terminal.getCursorPosition().getColumn();
            y += 10;

            tg.putString(x + 1, y, "▄██▄");
            tg.putString(x + 1, y + 1, "█▀▀█");
            tg.putString(x + 1, y + 2, "█▓▓█");
            tg.putString(x + 1, y + 3, "█  █");
            tg.putString(x, y + 4, "▄████▄");
            tg.putString(5, 5, " ҉");

            tg.putString(x + 1, y + 10, "  ▀▄   ▄▀  ");
            tg.putString(x + 1, y + 11, " ▄█▀███▀█▄ ");
            tg.putString(x + 1, y + 12, "█▀███████▀█");
            tg.putString(x + 1, y + 13, "█ █▀▀▀▀▀█ █");
            tg.putString(x + 1, y + 14, "   ▀▀ ▀▀   ");
            tg.putString(x + 1, y + 15, "☜ ☙ ☕ ♜♜ ♜♜♜♜ ♜ ♜  ♖     ♖ ♚ ♚ ♚ ♚  ♖ ♖ ♖  ♜ ♜ ♜ ♜  ♚ ♚ ♚ ♜ ♜  🦄 🦄 🦄🦄");
            tg.putString(x + 1, y + 16, "U+1F984   🦆 🦆 ⫹⫹ \n \n\n\n");

            // ▓▓▓
            // ▓ ● ▓
            // ▓▓▓▓▓
            // ░░░
            // █ █
            // █████

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (terminal != null) {
                try {
                    /*
                     * Closing the terminal doesn't always do something, but if you run the Swing or
                     * AWT bundled terminal
                     * emulators for example, it will close the window and allow this application to
                     * terminate. Calling it
                     * on a UnixTerminal will not have any affect.
                     */
                    terminal.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
