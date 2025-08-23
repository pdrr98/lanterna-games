package com.plagueprogrammer;

import com.googlecode.lanterna.terminal.Terminal;

import java.io.IOException;

import com.googlecode.lanterna.graphics.TextGraphics;

public class SplashArt {
    Terminal terminal;
    TextGraphics textGraphics;

    public SplashArt(Terminal terminal, TextGraphics textGraphics) {
        this.terminal = terminal;
        this.textGraphics = textGraphics;
    }

    String plagueLogoBig = """
            +=====================================================================================================================================================+
            |    ██████╗ ██╗      █████╗  ██████╗ ██╗   ██╗███████╗    ██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗███╗   ███╗███████╗██████╗    |
            |    ██╔══██╗██║     ██╔══██╗██╔════╝ ██║   ██║██╔════╝    ██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║████╗ ████║██╔════╝██╔══██╗   |
            |    ██████╔╝██║     ███████║██║  ███╗██║   ██║█████╗      ██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║██╔████╔██║█████╗  ██████╔╝   |
            |    ██╔═══╝ ██║     ██╔══██║██║   ██║██║   ██║██╔══╝      ██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██║╚██╔╝██║██╔══╝  ██╔══██╗   |
            |    ██║     ███████╗██║  ██║╚██████╔╝╚██████╔╝███████╗    ██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║ ╚═╝ ██║███████╗██║  ██║   |
            |    ╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝    ╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝   |
            +=====================================================================================================================================================+
            """;

    String plagueLogoMid = """
            +=========================================================================================+
            |                                                                                         |
            |                     ██████╗ ██╗      █████╗  ██████╗ ██╗   ██╗███████╗                  |
            |                     ██╔══██╗██║     ██╔══██╗██╔════╝ ██║   ██║██╔════╝                  |
            |                     ██████╔╝██║     ███████║██║  ███╗██║   ██║█████╗                    |
            |                     ██╔═══╝ ██║     ██╔══██║██║   ██║██║   ██║██╔══╝                    |
            |                     ██║     ███████╗██║  ██║╚██████╔╝╚██████╔╝███████╗                  |
            |                     ╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝                  |
            |                                                                                         |
            | ██████╗ ██████╗  ██████╗  ██████╗ ██████╗  █████╗ ███╗   ███╗███╗   ███╗███████╗██████╗ |
            | ██╔══██╗██╔══██╗██╔═══██╗██╔════╝ ██╔══██╗██╔══██╗████╗ ████║████╗ ████║██╔════╝██╔══██╗|
            | ██████╔╝██████╔╝██║   ██║██║  ███╗██████╔╝███████║██╔████╔██║██╔████╔██║█████╗  ██████╔╝|
            | ██╔═══╝ ██╔══██╗██║   ██║██║   ██║██╔══██╗██╔══██║██║╚██╔╝██║██║╚██╔╝██║██╔══╝  ██╔══██╗|
            | ██║     ██║  ██║╚██████╔╝╚██████╔╝██║  ██║██║  ██║██║ ╚═╝ ██║██║ ╚═╝ ██║███████╗██║  ██║|
            | ╚═╝     ╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚═╝  ╚═╝╚═╝  ╚═╝╚═╝     ╚═╝╚═╝     ╚═╝╚══════╝╚═╝  ╚═╝|
            +=========================================================================================+
            """;

    String plagueLogoSmall = """
            +======================================================+
            |    ██████╗ ██╗      █████╗  ██████╗ ██╗   ██╗███████╗|
            |    ██╔══██╗██║     ██╔══██╗██╔════╝ ██║   ██║██╔════╝|
            |    ██████╔╝██║     ███████║██║  ███╗██║   ██║█████╗  |
            |    ██╔═══╝ ██║     ██╔══██║██║   ██║██║   ██║██╔══╝  |
            |    ██║     ███████╗██║  ██║╚██████╔╝╚██████╔╝███████╗|
            |    ╚═╝     ╚══════╝╚═╝  ╚═╝ ╚═════╝  ╚═════╝ ╚══════╝|
            |                                                      |
            |██████╗ ██████╗  ██████╗ ██████╗ ███╗   ███╗██████╗   |
            |██╔══██╗██╔══██╗██╔════╝ ██╔══██╗████╗ ████║██╔══██╗  |
            |██████╔╝██████╔╝██║  ███╗██████╔╝██╔████╔██║██████╔╝  |
            |██╔═══╝ ██╔══██╗██║   ██║██╔══██╗██║╚██╔╝██║██╔══██╗  |
            |██║     ██║  ██║╚██████╔╝██║  ██║██║ ╚═╝ ██║██║  ██║  |
            |╚═╝     ╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚═╝  ╚═╝  |
            +======================================================+
            """;

    String appLogo = """
            +========================================================================+
            |  ██╗      █████╗ ███╗   ██╗████████╗███████╗██████╗ ███╗   ██╗ █████╗  |
            |  ██║     ██╔══██╗████╗  ██║╚══██╔══╝██╔════╝██╔══██╗████╗  ██║██╔══██╗ |
            |  ██║     ███████║██╔██╗ ██║   ██║   █████╗  ██████╔╝██╔██╗ ██║███████║ |
            |  ██║     ██╔══██║██║╚██╗██║   ██║   ██╔══╝  ██╔══██╗██║╚██╗██║██╔══██║ |
            |  ███████╗██║  ██║██║ ╚████║   ██║   ███████╗██║  ██║██║ ╚████║██║  ██║ |
            |  ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝   ╚═╝   ╚══════╝╚═╝  ╚═╝╚═╝  ╚═══╝╚═╝  ╚═╝ |
            |                                                                        |
            |               ██████╗  █████╗ ███╗   ███╗███████╗███████╗              |
            |              ██╔════╝ ██╔══██╗████╗ ████║██╔════╝██╔════╝              |
            |              ██║  ███╗███████║██╔████╔██║█████╗  ███████╗              |
            |              ██║   ██║██╔══██║██║╚██╔╝██║██╔══╝  ╚════██║              |
            |              ╚██████╔╝██║  ██║██║ ╚═╝ ██║███████╗███████║              |
            |               ╚═════╝ ╚═╝  ╚═╝╚═╝     ╚═╝╚══════╝╚══════╝              |
            +========================================================================+
            """;

    public void showSplashArt() throws IOException, InterruptedException {
        int terminalWide = terminal.getTerminalSize().getColumns();

        terminal.enterPrivateMode();
        if (terminalWide < 140)
            printOnCenter(terminal, plagueLogoSmall, 0);
        else if (terminalWide < 200)
            printOnCenter(terminal, plagueLogoMid, 0);
        else
            printOnCenter(terminal, plagueLogoBig, 0);
        Thread.sleep(1500);
        terminal.clearScreen();
        printOnCenter(terminal, appLogo, 3);
        Thread.sleep(1500);
        terminal.clearScreen();
        terminal.exitPrivateMode();
    }

    public void printOnCenter(Terminal terminal, String logo, int delay) throws IOException, InterruptedException {
        int terminalColumns = terminal.getTerminalSize().getColumns();
        int terminalRows = terminal.getTerminalSize().getRows();
        terminal.setCursorVisible(false);

        String logoStriped = logo.strip(); // removes white space characters at the start and end of the string

        // Count the number of characters before a '/n' to get number of Columns
        int logoColumns = logoStriped.indexOf('\n');

        // Count the number of '/n' characters to determine number of rows to be used
        int logoRows = logoStriped.length() / logoColumns;

        int horizontalCenter = terminalColumns / 2 - logoColumns / 2;
        int verticalCenter = terminalRows / 2 - logoRows / 2;

        // Print using dimensions
        terminal.setCursorPosition(horizontalCenter, verticalCenter);
        for (int i = 0; i < logo.length(); i++) {
            terminal.putCharacter(logo.charAt(i));
            if (logo.charAt(i) == '\n') {
                terminal.setCursorPosition(horizontalCenter, terminal.getCursorPosition().getRow());
            }
            Thread.sleep(delay);
        }

    }

}
