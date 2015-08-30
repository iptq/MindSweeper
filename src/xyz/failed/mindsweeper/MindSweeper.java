package xyz.failed.mindsweeper;

import xyz.failed.mindsweeper.gui.MFrame;

import javax.swing.*;

/**
 * Created by Michael on 8/29/2015.
 */
public class MindSweeper {
    public static MindSweeper instance;
    public MFrame frame;

    public MindSweeper() {
        frame = new MFrame();
    }

    public static void main(String[] args) {
        instance = new MindSweeper();
    }
}
