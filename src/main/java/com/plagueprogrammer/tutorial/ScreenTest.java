package com.plagueprogrammer.tutorial;

import java.io.IOException;
import java.nio.charset.Charset;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.TerminalPosition;

/**
 * Test that demonstrates switching between two different screens
 * 
 * @author martin
 */
public class ScreenTest {
    public void run() throws IOException, InterruptedException {
        Terminal terminal = new DefaultTerminalFactory(System.out, System.in, Charset.forName("UTF8"))
                .createTerminal();
        terminal.putString("Terminal Started\n");
        Thread.sleep(1000);
        Thread.sleep(1000);
        /*
         * The only way a Screen can know what is visible in the real terminal window is
         * by remembering what the buffer looked like before the last refresh. When you
         * modify the underlying terminal directly, this buffer-memory will get out of
         * sync and the refresh() is likely to not properly update the content. So if
         * you use Screen, a general rule of thumb is to avoid operating on the Terminal
         * you passed in when creating the Screen.
         */

        TerminalScreen mainScreen = new TerminalScreen(terminal);
        TerminalScreen secondScreen = new TerminalScreen(terminal);

        /*
         * When you use a screen avoid interacting with the terminal layer directly, use
         * the screen, and textgraphics abstraction layer methods
         */
        TextGraphics mainTG = mainScreen.newTextGraphics();
        TextGraphics secondTG = secondScreen.newTextGraphics();
        TerminalPosition termPosition = mainScreen.getCursorPosition();
        mainTG.putString(termPosition, "ASIES");
        terminal.putString("Creating main Screens\n");
        Thread.sleep(1000);
        mainScreen.startScreen();
        mainTG.putString(10, 4, "Main Screen started");
        mainTG.putString(10, 5, "Hello Lanterna!");
        mainTG.putString(10, 6, "Hello Lanterna!");
        mainScreen.refresh(); // need to call refresh to reflect changes from textGraphics
        Thread.sleep(2000);
        mainTG.putString(10, 7, "tg message: Closing main Screen");
        Thread.sleep(1000);
        mainScreen.close();
        terminal.putString("Main Screen closed\n");
        Thread.sleep(1000);
        terminal.putString("Opening Main Screen again\n");
        Thread.sleep(1000);
        mainScreen.startScreen();
        Thread.sleep(2000);
        mainTG.putString(10, 8, "tg message: Calling Stop Screen");
        mainScreen.refresh();
        Thread.sleep(2000);
        mainScreen.stopScreen();
        Thread.sleep(2000);
        terminal.putString("Screen Stoped\n");
        Thread.sleep(2000);
        terminal.putString("stopScreen.\n");
        Thread.sleep(2000);
        terminal.putString("Starting screen after using stopScreen.\n");
        Thread.sleep(2000);
        mainScreen.startScreen();
        Thread.sleep(2000);
        mainScreen.refresh();
        Thread.sleep(2000);
        mainScreen.close();
        Thread.sleep(2000);

        terminal.putString("Starting secondary Screen");
        secondScreen.startScreen();
        Thread.sleep(2000);
        secondTG.putString(termPosition, "Inside Second Screen");
        secondScreen.refresh();
        Thread.sleep(2000);
        secondScreen.close();
        Thread.sleep(2000);

        mainScreen.startScreen();
        Thread.sleep(2000);
        mainScreen.refresh();
        Thread.sleep(2000);
        mainScreen.close();
        Thread.sleep(2000);

        secondScreen.startScreen();
        Thread.sleep(2000);
        secondScreen.refresh();
        Thread.sleep(2000);
        secondScreen.close();

        terminal.close();
    }
}
