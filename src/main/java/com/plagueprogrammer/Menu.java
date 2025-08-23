package com.plagueprogrammer;

import com.googlecode.lanterna.graphics.TextGraphics;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.Button;
import com.googlecode.lanterna.gui2.GridLayout;
import com.googlecode.lanterna.gui2.Label;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Panel;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.WindowBasedTextGUI;
import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.Terminal;
import com.plagueprogrammer.games.Snake;

public class Menu {
    Terminal terminal;
    TextGraphics textGraphics;

    public Menu(Terminal terminal, TextGraphics textGraphics) {
        this.terminal = terminal;
        this.textGraphics = textGraphics;
    }

    public void showMenu() {

        try {

            // UnixTerminal terminal = new UnixTerminal();
            Screen screen = new TerminalScreen(terminal);
            Snake snake = new Snake(screen, textGraphics);

            screen.startScreen();
            final WindowBasedTextGUI textGUI = new MultiWindowTextGUI(screen);
            final Window window = new BasicWindow("Lanterna Games");

            Panel contentPanel = new Panel(new GridLayout(2));

            GridLayout gridLayout = (GridLayout) contentPanel.getLayoutManager();
            gridLayout.setHorizontalSpacing(3);

            Label title = new Label(
                    "Play some of the clasic arcade games from the past! Use the arrow keys to move around, and press \"enter\" to select a game.");
            title.setLayoutData(GridLayout.createLayoutData(
                    GridLayout.Alignment.BEGINNING, // Horizontal alignment in the grid cell if the cell is larger than
                                                    // the component's preferred size
                    GridLayout.Alignment.BEGINNING, // Vertical alignment in the grid cell if the cell is larger than
                    true, // Give the component extra horizontal space if available
                    false, // Give the component extra vertical space if available
                    2, // Horizontal span
                    2)); // Vertical span
            contentPanel.addComponent(title);

            contentPanel.addComponent(new Button("Snake", () -> snake.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Snakes & Ladders",
                    () -> snake.run()).setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Tetris",
                    () -> snake.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("TwentyFortyEight",
                    () -> snake.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Message Dialog",
                    () -> MessageDialog.showMessageDialog(textGUI, "MessageBox", "This is a message box",
                            MessageDialogButton.OK))
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));

            contentPanel.addComponent(
                    new Button("Close", window::close).setLayoutData(
                            GridLayout.createHorizontallyEndAlignedLayoutData(2)));

            window.setComponent(contentPanel);
            textGUI.addWindowAndWait(window);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }
}
