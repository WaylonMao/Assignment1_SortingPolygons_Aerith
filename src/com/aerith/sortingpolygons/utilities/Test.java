package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.modules.Shape;

import java.io.File;
import java.util.Comparator;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class Test {
    private static String filePath;
    private static char compareType = ' ';
    private static char sortType = ' ';
    private static final char SORT_ORDER = 'd';

    public static void main(String[] args) {
        long start, stop;

        if (!new Test().parseArgs(args)) {
            System.out.println("Start...\n");
            ShapeManager sm = new ShapeManager();
            start = System.currentTimeMillis();
            sm.fillShapeList(filePath);
            stop = System.currentTimeMillis();
            System.out.println("File loaded.");
            System.out.println("Used: " + (stop - start) + "ms" + "\n");
            Shape[] shapes = sm.getShapes();
            System.out.println("Start to sort...\n");
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
//            for (Shape s : shapes
//            ) {
//                System.out.println(s.getVolume());
//            }
            System.out.println("Used: " + (stop - start) + "ms");

        }


    }

    private static void printShapes(Shape[] shapes, char type) {
        boolean lastPrinted = false;
        switch (type) {
            case 'h': {
                for (int i = 0; i < shapes.length; i += 10000) {
                    if (i == shapes.length - 1) lastPrinted = true;
                    System.out.println(shapes[i].getHeight());
                }
                if (!lastPrinted) System.out.println(shapes[shapes.length - 1].getHeight());
            }
            break;
            case 'a': {
                for (int i = 0; i < shapes.length; i += 10000) {
                    if (i == shapes.length - 1) lastPrinted = true;
                    System.out.println(shapes[i].getBaseArea());
                }
                if (!lastPrinted) System.out.println(shapes[shapes.length - 1].getBaseArea());
            }
            break;
            case 'v': {
                for (int i = 0; i < shapes.length; i += 10000) {
                    if (i == shapes.length - 1) lastPrinted = true;
                    System.out.println(shapes[i].getVolume());
                }
                if (!lastPrinted) System.out.println(shapes[shapes.length - 1].getVolume());
            }
            break;
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
            System.out.println(filePath);
            System.out.println(compareType);
            System.out.println(sortType);
        }
        return error;
    }

    private boolean transArgs(String s) {
        boolean error = false;
        if (s.charAt(0) != '-') {
            System.out.println("Error: You must use '-' at the beginning or the arguments.");
            error = true;
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
                        break;
                    case 'h':
                        compareType = 'h';
                        break;
                    case 'a':
                        compareType = 'a';
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
                        break;
                    case 's':
                        sortType = 's';
                        break;
                    case 'i':
                        sortType = 'i';
                        break;
                    case 'm':
                        sortType = 'm';
                        break;
                    case 'q':
                        sortType = 'q';
                        break;
                    case 'z':
                        sortType = 'z';
                        break;
                    default: {
                        error = true;
                        System.out.println("Error: Sort Type only can be [B]ubble, [S]election, [I]nsertion, [M]erge, [Q]uick and [Z]");
                    }

                }
            }
        }
        return error;
    }

}
