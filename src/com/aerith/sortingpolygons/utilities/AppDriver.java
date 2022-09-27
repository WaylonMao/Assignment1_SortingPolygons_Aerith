package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

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
 * @author Weilong Mao, Hoa Le
 */
public class AppDriver {
    private static String filePath;
    private static char compareType = ' ';
    private static char sortType = ' ';
    private static final char SORT_ORDER = 'd';

    public static void main(String[] args) {
        long start, stop;

        if (!new AppDriver().parseArgs(args)) {
            System.out.println("Start loading a file...\n");
            ShapeManager sm = new ShapeManager();
            start = System.currentTimeMillis();
            sm.fillShapeList(filePath);
            stop = System.currentTimeMillis();
            System.out.println("File loaded.");
            System.out.println("Time is Used: " + (stop - start) + "ms" + "\n");
            Shape[] shapes = sm.getShapes();
            System.out.println("Start sorting a file");
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
            System.out.println("\nTime is Used: " + (stop - start) + "ms");

        }


    }
    // Using to print shape

    private static void printShapes(Shape[] shapes, char type) {
        double value = 0;
        int n = shapes.length;
        for (int i = 0; i < n; i++) {
            if (compareType == 'h') {
                value = shapes[i].getHeight();
            } else if (compareType == 'v') {
                value = shapes[i].getVolume();
            } else if (compareType == 'a') {
                value = shapes[i].getBaseArea();
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
            if (filePath == null || compareType == ' ' || sortType == ' ') {
                System.out.println("Missing arguments...");
                error = true;
                return error;
            }
            System.out.println("This program aborted.");
            error = true;
            return error;
        } else {
            System.out.println("File is used on this sort " + filePath);

        }
        return error;
    }

    private boolean transArgs(String s) {
        boolean error = false;
        if (!s.startsWith("-") || s.length() <3 ){
            System.out.println("Error, your command line should beginning with '-' OR length is not equal 3");
            error = true; // stop the program.
        } else {
            if (s.toLowerCase().charAt(1) == 'f') {
                String path = s.substring(2);
                File file = new File(path);
                if (!file.exists()) {
                    System.out.println("Error: File is not exist.");
                    error = true;
                } else {
                    this.filePath = path;
                }
            }
            if (s.toLowerCase().charAt(1) == 't') {
                switch (s.toLowerCase().charAt(2)) {
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
            if (s.toLowerCase().charAt(1) == 's') {
                switch (s.toLowerCase().charAt(2)) {
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
        return error;
    }

}
