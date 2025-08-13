package com.plagueprogrammer.tutorial;

import java.nio.charset.Charset;

import com.googlecode.lanterna.SGR;
import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class BackAndForeGroundColors {

    public void run() {

        try {
            Terminal terminal = new DefaultTerminalFactory(System.out, System.in, Charset.forName("UTF8"))
                    .createTerminal();

            String loremIpsum = "\tSed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt. Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum qui dolorem eum fugiat quo voluptas nulla pariatur? \n";
            String explanation01 = "\nAs you can see changing the color does not change the old text, just the new one.";
            terminal.putCharacter('\n');
            terminal.putString(terminal.getCursorPosition().toString());
            terminal.putCharacter('\n');
            Thread.sleep(1000);

            terminal.putString("\nTerminal started");
            Thread.sleep(1000);
            terminal.putCharacter('\n');
            terminal.putString(loremIpsum);
            terminal.putString(loremIpsum);
            /*
             * Background and foreground colors changes only applies to new text, old one
             * stay the same.
             * If you enter private mode or use terminal.clearScreen() background changes
             * will inmediatly reflect, cleaning the old text.
             */
            terminal.putString("\nChanging color");
            Thread.sleep(1000);
            terminal.setBackgroundColor(TextColor.ANSI.BLUE);
            terminal.setForegroundColor(TextColor.ANSI.BLACK);
            terminal.putString("\nColor changed");
            Thread.sleep(1000);
            terminal.putString("\nTerminal flush");
            terminal.flush();
            Thread.sleep(1000);

            terminal.putCharacter('\n');
            terminal.putString(loremIpsum);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.enableSGR(SGR.FRAKTUR);

            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            for (int i = 0; i < explanation01.length(); i++) {
                terminal.putCharacter(explanation01.charAt(i));
                Thread.sleep(100);
            }
            Thread.sleep(1000);
            Thread.sleep(1000);
            /*
             * clearScreen() method. This will (probably) remove all characters on the
             * screen and replace them with the empty character (' ').
             * applyng the background color, but this method does not reset the cursor
             * position.
             * It is more loke a scroll down leaving the old text behind.
             */
            terminal.putString("\nCleaning Screen");
            Thread.sleep(1000);
            terminal.putString("\nScreen clear");
            terminal.clearScreen();
            Thread.sleep(1000);
            terminal.putCharacter('\n');
            terminal.putString(terminal.getCursorPosition().toString());
            terminal.putCharacter('\n');
            Thread.sleep(1000);

            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            Thread.sleep(1000);
            terminal.putString("\nEntering private mod");
            Thread.sleep(1000);
            terminal.enterPrivateMode();
            terminal.putString("\nInside private mod");
            Thread.sleep(1000);

            terminal.putString(loremIpsum);
            terminal.putString(loremIpsum);
            terminal.putString(loremIpsum);
            terminal.putString(loremIpsum);
            terminal.putString(loremIpsum);

            terminal.putCharacter('\n');
            terminal.putString(terminal.getCursorPosition().toString());
            terminal.putCharacter('\n');
            Thread.sleep(1000);

            terminal.putString("\nChanging color");
            Thread.sleep(1000);
            terminal.setBackgroundColor(TextColor.ANSI.RED);
            terminal.setForegroundColor(TextColor.ANSI.WHITE);
            terminal.putString("\nColor changed");
            Thread.sleep(1000);
            terminal.putString("\nTerminal flush");
            terminal.flush();
            Thread.sleep(1000);
            terminal.putString("\nClosing private mode");
            Thread.sleep(1000);
            terminal.putString("\nExit private mode.");
            terminal.exitPrivateMode();
            Thread.sleep(1000);
            terminal.putString("\nrandom thingsfdsjafksadljf flush");
            terminal.putString("\nsome random text dkfjaklsjfkldsaerminal flush");
            Thread.sleep(1000);
            terminal.putString("\nTerminal flush");
            terminal.flush();
            Thread.sleep(1000);
            terminal.putCharacter('\n');

            terminal.putString("\nChanging color");
            Thread.sleep(1000);
            terminal.setBackgroundColor(TextColor.ANSI.RED);
            terminal.setForegroundColor(TextColor.ANSI.WHITE);
            terminal.putString("\nColor changed");
            Thread.sleep(1000);
            terminal.putString("\nTerminal flush");
            terminal.flush();

            terminal.putString("\nEntering private mod");
            Thread.sleep(1000);
            terminal.enterPrivateMode();
            terminal.putString("\nInside private mod");
            Thread.sleep(1000);

            terminal.putCharacter('\n');
            terminal.putString(terminal.getCursorPosition().toString());
            terminal.putCharacter('\n');
            Thread.sleep(1000);

            terminal.putString("\nTerminal flush");
            terminal.flush();
            Thread.sleep(1000);
            terminal.putString("\nClosing private mode");
            Thread.sleep(1000);
            terminal.putString("\nExit private mode.");
            terminal.exitPrivateMode();
            Thread.sleep(1000);
            terminal.putString("\nCleaning Screen");
            terminal.clearScreen();
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            Thread.sleep(1000);

            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            terminal.putString(loremIpsum);
            Thread.sleep(1000);
            Thread.sleep(1000);

            terminal.putCharacter('\n');

            // Setting to default and closing terminal
            terminal.setBackgroundColor(TextColor.ANSI.DEFAULT);
            terminal.setForegroundColor(TextColor.ANSI.DEFAULT);

            terminal.clearScreen();

            terminal.putCharacter('\n');
            terminal.putString(terminal.getCursorPosition().toString());

            terminal.putCharacter('\n');
            terminal.putString(terminal.getTerminalSize().toString());

            terminal.putCharacter('\n');

            Thread.sleep(9000);
            terminal.close();
        } catch (Exception e) {

        }
    }
}
