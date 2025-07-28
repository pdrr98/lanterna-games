package com.plagueprogrammer.games;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Test01 {
    public void run() {

        DefaultTerminalFactory defaultTerminalFactory = new DefaultTerminalFactory();
        try {
            Terminal terminal = defaultTerminalFactory.createTerminal();
            terminal.putCharacter('H');
            Thread.sleep(200);
            terminal.putCharacter('e');
            Thread.sleep(200);
            terminal.putCharacter('l');
            Thread.sleep(200);
            terminal.putCharacter('l');
            Thread.sleep(200);
            terminal.putCharacter('o');
            Thread.sleep(200);
            terminal.putCharacter('\n');
            Thread.sleep(200);
            terminal.flush();

            TerminalPosition startPosition = terminal.getCursorPosition();
            terminal.setCursorPosition(startPosition.withRelativeColumn(3).withRelativeRow(2));
            terminal.flush();
            Thread.sleep(500);

            terminal.setBackgroundColor(TextColor.ANSI.BLUE);
            terminal.setForegroundColor(TextColor.ANSI.YELLOW);

            terminal.putCharacter('Y');
            terminal.putCharacter('e');
            terminal.putCharacter('l');
            terminal.putCharacter('l');
            terminal.putCharacter('o');
            terminal.putCharacter('w');
            terminal.putCharacter(' ');
            terminal.putCharacter('o');
            terminal.putCharacter('n');
            terminal.putCharacter(' ');
            terminal.putCharacter('b');
            terminal.putCharacter('l');
            terminal.putCharacter('u');
            terminal.putCharacter('e');
            terminal.flush();
            Thread.sleep(500);

            terminal.resetColorAndSGR();
            terminal.setCursorPosition(terminal.getCursorPosition().withColumn(0).withRelativeRow(1));
            terminal.putCharacter('D');
            terminal.putCharacter('o');
            terminal.putCharacter('n');
            terminal.putCharacter('e');
            terminal.putCharacter('\n');
            terminal.flush();
            Thread.sleep(1000);

            terminal.enterPrivateMode();
            Thread.sleep(1000);

            final TextGraphics textGraphics = terminal.newTextGraphics();
            KeyStroke keyStroke = terminal.readInput();
            while (keyStroke.getKeyType() != KeyType.Escape) {
                textGraphics.drawLine(5, 4, terminal.getTerminalSize().getColumns() - 1, 4, ' ');
                textGraphics.putString(5, 4, "Last Keystroke: ", SGR.BOLD);
                textGraphics.putString(5 + "Last Keystroke: ".length(), 4, keyStroke.toString());
                terminal.flush();
                keyStroke = terminal.readInput();
            }

            terminal.exitPrivateMode();
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
            terminal.flush();
            Thread.sleep(5000);

        } catch (Exception e) {

        }

        System.out.println("Hello World!");
    }
}
