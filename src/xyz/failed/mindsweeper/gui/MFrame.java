package xyz.failed.mindsweeper.gui;

import javax.swing.*;

public class MFrame extends JFrame {
    public MFrame() {
        JFrame.setDefaultLookAndFeelDecorated(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
    }
}