package com.aerith.sortingpolygons.Application;

import com.aerith.sortingpolygons.modules.Shape;
import com.aerith.sortingpolygons.utilities.BaseAreaComparator;
import com.aerith.sortingpolygons.utilities.ShapeManager;
import com.aerith.sortingpolygons.utilities.Sorter;
import com.aerith.sortingpolygons.utilities.VolumeComparator;

import java.io.File;
import java.util.Comparator;

/**
 * Class description: This class is the main class of this project. It is for getting Shapes for a txt file, and sorting
 * them by different types and sorting methods. When running this program, you need provide args.
 * <p>
 * -f or -F : Followed by the file path and file name. e.g. -F"D:/Floder/some.txt"
 * -t or -T : Followed by compare type: Base[A]rea, [H]eight and [V]olume. e.g. -tH means compare by height.
 * -s or -S : Followed by sort method: [B]ubble, [S]election, [I]nsertion, [M]erge, [Q]uick and [Z]Shell Sort.
 * e.g. -Sq means sorting by quick sort method.
 *
 * @author Weilong Mao, Hoa Le, Chris Wang, Hu Peng
 */
public class AppDriver {
    /**
     * This String variable is used to store the file path.
     * @Fields filePath
     */
    private static String filePath;

    /**
     * This char variable is used to store the compare type. Accepted value can be
     * 'h'(height), 'a'(base area) and 'v'(volume). (Ignore case.)
     *
     * @Fields compareType
     */
    private static char compareType = ' ';

    /**
     * This char variable is used to store the sort type. Accepted value can be
     * 'b'(Bubble Sort), 's'(Selection Sort), 'i'(Insertion Sort), 'm'(Merge Sort), 'q'(Quick Sort) and 'z'(Shell Sort).
     * (Ignore case.)
     *
     * @Fields sortType
     */
    private static char sortType = ' ';

    /**
     * This constant only accept two value: 'a' for ascending and 'd' for descending.
     * For this project's requirement, only descending is required. But we added this constant to leave room for future
     * improvements to the code if ascending ordering is required.
     *
     * @Fields SORT_ORDER
     */
    private static final char SORT_ORDER = 'd';

    public static void main(String[] args) {
        long start, stop;

        // If no error during getting arguments, then continue this program.
        if (!new AppDriver().parseArgs(args)) {
            System.out.println("Start loading a file...\n");
            ShapeManager sm = new ShapeManager();
            start = System.currentTimeMillis();

            // Loading Shape objects from this txt file.
            sm.fillShapeList(filePath);
            stop = System.currentTimeMillis();
            System.out.println("File loaded.");
            System.out.println("Total time is used to read a file: " + (stop - start) + "ms" + "\n");

            // Get Shape array from ShapeManager.
            Shape[] shapes = sm.getShapes();
            System.out.println("Start sorting a file.....");
            Sorter sorter = new Sorter();
            Comparator comparator;
            if (compareType == 'h') {
                start = System.currentTimeMillis();
                sorter.sort(shapes, sortType, SORT_ORDER);
                stop = System.currentTimeMillis();
            } else {
                if (compareType == 'a') {
                    comparator = new BaseAreaComparator();
                } else {
                    comparator = new VolumeComparator();
                }
                System.out.println("Running...\n");
                start = System.currentTimeMillis();
                sorter.sort(shapes, comparator, sortType, SORT_ORDER);
                stop = System.currentTimeMillis();
            }
            printShapes(shapes, compareType);
            System.out.println("\nTotal time was taken to sort a file is:  " + (stop - start) + "ms");
        }
    }

    /**
     * This method is used to print out Shapes from array by height, base area or volume.
     *
     * @param shapes        Shape array need to be printed.
     * @param compareType   The type of value need to be printed.
     */
    private static void printShapes(Shape[] shapes, char compareType) {
        double value = 0;
        int n = shapes.length;
        for (int i = 0; i < n; i++) {
            switch (compareType) {
                case 'h':
                    value = shapes[i].getHeight();
                    break;
                case 'v':
                    value = shapes[i].getVolume();
                    break;
                case 'a':
                    value = shapes[i].getBaseArea();
                    break;
            }
            if (i == 0) {
                System.out.println("The first sorted value is " + value);
            } else if (i % 1000 == 999) {
                System.out.println("The " + (i + 1) + "th sorted value is " + value);
            } else if (i == n - 1) {
                System.out.println("The last sorted value is " + value);
            }
        }
    }

    /**
     * This method is for verifying arguments in command line. And it may call transArgs method to verify each part of
     * the arguments.
     *
     * @param args  the string store user input
     * @return      Return true when command line is wrong
     */
    private boolean parseArgs(String[] args) {
        boolean error = false;
        if (args.length < 3) {
            System.out.println("Not enough arguments.");
            System.out.println("Usage: -F File, -T Compare type, -S Sort type");
            error = true;
            return error;
        }
        if (args.length > 3) {
            System.out.println("Too many arguments.");
            System.out.println("Usage: -F File, -T Compare type, -S Sort type");
            error = true;
            return error;
        }
        boolean a1 = transArgs(args[0]);
        boolean a2 = transArgs(args[1]);
        boolean a3 = transArgs(args[2]);
        if (a1 || a2 || a3 || filePath == null || compareType == ' ' || sortType == ' ') {
            System.out.println("Missing arguments...This program aborted.");
            error = true;
            return error;
        } else {
            System.out.println("File is used on this sort " + filePath);
        }
        return error;
    }

    /**
     * This method can transfer arguments to the file path, compare type, and sorting method.
     * And at the same time, it also verifies them and print out the relevant messages.
     *
     * @param arg   the string store user's input
     * @return      Return true when command line is wrong
     */
    private boolean transArgs(String arg) {
        boolean error = false;
        if (!arg.startsWith("-")) {
            System.out.println("Error: You must use '-' at the beginning of the arguments.");
            error = true;
        } else {
            if (arg.toLowerCase().charAt(1) == 'f') {
                String path = arg.substring(2);
                File file = new File(path);
                if (!file.exists()) {
                    System.out.println("Error: File is not exist.");
                    error = true;
                } else {
                    this.filePath = path;
                }
            }
            if (arg.toLowerCase().charAt(1) == 't') {
                if (arg.length() < 3) {
                    error = true;
                    System.out.println("Missing Compare Type...");
                } else {
                    switch (arg.toLowerCase().charAt(2)) {
                        case 'v':
                            compareType = 'v';
                            System.out.println("Compared type is volume");
                            break;
                        case 'h':
                            compareType = 'h';
                            System.out.println("Compared type is height");
                            break;
                        case 'a':
                            compareType = 'a';
                            System.out.println("Compared type is base area");
                            break;
                        default: {
                            error = true;
                            System.out.println("Error: Compare Type only can be Base[A]rea, [H]eight and [V]olume");
                        }
                    }
                }
            }
            if (arg.toLowerCase().charAt(1) == 's') {
                if (arg.length() < 3) {
                    error = true;
                    System.out.println("Missing Sort Type...");
                } else {
                    switch (arg.toLowerCase().charAt(2)) {
                        case 'b':
                            sortType = 'b';
                            System.out.println("Method sort is Bubble");
                            break;
                        case 's':
                            sortType = 's';
                            System.out.println("Method sort is Selection Sort");
                            break;
                        case 'i':
                            sortType = 'i';
                            System.out.println("Method sort is Insertion Sort");
                            break;
                        case 'm':
                            sortType = 'm';
                            System.out.println("Method sort is Merge Sort");
                            break;
                        case 'q':
                            sortType = 'q';
                            System.out.println("Method sort is Quicksort");
                            break;
                        case 'z':
                            sortType = 'z';
                            System.out.println("Method sort is Shell Sort");
                            break;
                        default: {
                            error = true;
                            System.out.println("Error: Sort Type only can be [B]ubble, [S]election, [I]nsertion, [M]erge, [Q]uick and [Z]Shell Sort");
                        }
                    }
                }
            }
        }
        return error;
    }
}
