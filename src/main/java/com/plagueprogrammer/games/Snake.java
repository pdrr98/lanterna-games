package com.plagueprogrammer.games;

import java.io.IOException;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.screen.Screen;

public class Snake {
    Screen screen;

    public Snake(Screen screen) {
        this.screen = screen;
    }

    public void run() {

        try {
            while (true) {
                startGame();
                loop();
            }
        } catch (Exception e) {

        }
    }

    public void startGame() throws IOException {
        screen.clear();
        screen.refresh();
    }

    public void loop() throws IOException, InterruptedException {
        input();
        System.out.print("Input");
        Thread.sleep(500);
        logic();
        System.out.print("Logic");
        Thread.sleep(500);
        render();
        System.out.print("Render");
        Thread.sleep(500);
        audio();
        System.out.print("Audio");
        Thread.sleep(500);
    }

    public KeyStroke input() throws IOException {
        return screen.readInput();
    }

    public void logic() {

    }

    public void render() throws IOException {
        TextGraphics tg = screen.newTextGraphics();
        screen.refresh();
    }

    public void audio() {

    }
}
