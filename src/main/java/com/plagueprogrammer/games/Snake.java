package com.plagueprogrammer.games;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.screen.Screen;

import com.googlecode.lanterna.TerminalPosition;
import com.googlecode.lanterna.TextColor;

public class Snake {
    Screen screen;
    TextGraphics tg;

    public Snake(Screen screen, TextGraphics tg) {
        this.screen = screen;
        this.tg = tg;
    }

    public void run() {

        try {
            // TextGraphics tg = screen.newTextGraphics();
            screen.clear();
            screen.refresh();
            Thread.sleep(5000);
            tg.setBackgroundColor(TextColor.ANSI.RED);
            // TerminalPosition tp = new TerminalPosition(0, 0);
            tg.drawRectangle(TerminalPosition.TOP_LEFT_CORNER, tg.getSize(), ' ');
            screen.refresh();
            Thread.sleep(5000);
            tg.setBackgroundColor(TextColor.ANSI.DEFAULT);
            screen.refresh();
            Thread.sleep(5000);

        } catch (Exception e) {

        }
    }
}
