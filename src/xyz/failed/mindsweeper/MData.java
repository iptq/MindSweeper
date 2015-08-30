package xyz.failed.mindsweeper;

/**
 * Created by Michael on 8/29/2015.
 */
public class MData {
    public static int rows = 10;
    public static int cols = 10;

    public static int mines = 10;
    public static int minesLeft = mines;

    public static boolean started = false;
    public static boolean finished = false;

    public static int currentTime = 0;
    public static int fieldsLeft = rows * cols - minesLeft;
}
