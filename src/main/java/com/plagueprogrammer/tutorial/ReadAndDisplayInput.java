package com.plagueprogrammer.tutorial;

import java.nio.charset.Charset;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.SGR;

public class ReadAndDisplayInput {

    public void run() {

        try {
            Terminal terminal = new DefaultTerminalFactory(System.out, System.in, Charset.forName("UTF8"))
                    .createTerminal();

            terminal.enterPrivateMode();

            KeyStroke keyStroke = terminal.readInput();
            /*
             * The KeyStroke class has a couple of different methods for getting details on
             * the particular input that was
             * read. Notice that some keys, like CTRL and ALT, cannot be individually
             * distinguished as the standard input
             * stream doesn't report these as individual keys. Generally special keys are
             * categorized with a special
             * KeyType, while regular alphanumeric and symbol keys are all under
             * KeyType.Character. Notice that tab and
             * enter are not considered KeyType.Character but special types (KeyType.Tab and
             * KeyType.Enter respectively)
             */
            while (keyStroke.getKeyType() != KeyType.Escape) {
                terminal.putString("Last Keystroke: " + keyStroke.toString());
                // terminal.putCharacter(keyStroke.getCharacter());
                terminal.flush();
                keyStroke = terminal.readInput();
            }
            terminal.exitPrivateMode();

            Thread.sleep(1000);
        } catch (Exception e) {

        }
    }

}
