package com.plagueprogrammer;

import com.plagueprogrammer.tutorial.BackAndForeGroundColors;
import com.plagueprogrammer.tutorial.ReadAndDisplayInput;
import com.plagueprogrammer.tutorial.ScreenTest;
import com.plagueprogrammer.tutorial.Tutorial03;

public class App {
    public static void main(String[] args) {
        // Menu m = new Menu();
        BackAndForeGroundColors t1 = new BackAndForeGroundColors();
        // t1.run();
        ReadAndDisplayInput rdi = new ReadAndDisplayInput();
        // rdi.run();
        // m.run();
        Tutorial03 t3 = new Tutorial03();
        // t3.run();
        ScreenTest ms = new ScreenTest();
        try {
            ms.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
