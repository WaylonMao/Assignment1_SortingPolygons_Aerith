package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class BubbleSort {
    public BubbleSort() {
    }

    public static <T extends Comparable<? super T>> void bubbleSortDesc(T[] arrays, Comparator<? super T> comparator) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (comparator.compare(arrays[i], arrays[i + 1]) < 0) {
                    swap(arrays, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSort(T[] arrays, Comparator<? super T> comparator) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (comparator.compare(arrays[i], arrays[i + 1]) > 0) {
                    swap(arrays, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSortDesc(T[] arrays) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (arrays[i].compareTo(arrays[i + 1]) < 0) {
                    swap(arrays, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static <T extends Comparable<? super T>> void bubbleSort(T[] arrays) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < arrays.length - 1; i++) {
                if (arrays[i].compareTo(arrays[i + 1]) > 0) {
                    swap(arrays, i, i + 1);
                    swapped = true;
                }
            }
        }
    }

    public static void swap(Object[] o, int a, int b) {
        Object temp = o[a];
        o[a] = o[b];
        o[b] = temp;
    }
}
