package com.plagueprogrammer;

import com.googlecode.lanterna.gui2.*;
import com.googlecode.lanterna.gui2.dialogs.MessageDialog;
import com.googlecode.lanterna.gui2.dialogs.MessageDialogButton;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.plagueprogrammer.games.*;

import java.io.IOException;

public class Menu {

    Test02 test2 = new Test02();
    Tutorial04 t4 = new Tutorial04();
    Tutorial03 t3 = new Tutorial03();
    Tutorial02 t2 = new Tutorial02();
    Tutorial01 t1 = new Tutorial01();

    public void run() {

        DefaultTerminalFactory terminalFactory = new DefaultTerminalFactory();
        Screen screen = null;

        try {
            screen = terminalFactory.createScreen();
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
                                                    // the component's preferred size
                    true, // Give the component extra horizontal space if available
                    false, // Give the component extra vertical space if available
                    2, // Horizontal span
                    2)); // Vertical span
            contentPanel.addComponent(title);

            contentPanel.addComponent(new Button("Snakes",
                    () -> t2.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Tutorial 1",
                    () -> {
                        try {
                            t1.run();
                        } catch (Exception e) {
                            // TODO: handle exception
                        }
                    }).setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Tutorial 2",
                    () -> t2.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Tutorial 3",
                    () -> t3.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Tutorial 4",
                    () -> t4.run())
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Snakes & Ladders",
                    () -> MessageDialog.showMessageDialog(textGUI, "MessageBox", "This is a message box",
                            MessageDialogButton.OK))
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));
            contentPanel.addComponent(new Button("Tetris",
                    () -> MessageDialog.showMessageDialog(textGUI, "MessageBox", "This is a message box",
                            MessageDialogButton.OK))
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));

            contentPanel.addComponent(new Button("TwentyFortyEight",
                    () -> MessageDialog.showMessageDialog(textGUI, "MessageBox", "This is a message box",
                            MessageDialogButton.OK))
                    .setLayoutData(
                            GridLayout.createLayoutData(GridLayout.Alignment.CENTER, GridLayout.Alignment.CENTER)));

            contentPanel.addComponent(
                    new Button("Close", window::close).setLayoutData(
                            GridLayout.createHorizontallyEndAlignedLayoutData(2)));

            window.setComponent(contentPanel);
            textGUI.addWindowAndWait(window);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (screen != null) {
                try {
                    /*
                     * The close() call here will restore the terminal by exiting from private mode
                     * which was done in
                     * the call to startScreen(), and also restore things like echo mode and intr
                     */
                    screen.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
