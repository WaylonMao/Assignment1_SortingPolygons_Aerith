package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort arrays using bubble sort.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 * When using this class you do not need to create instances, because they are all static methods.
 * And they already include both ascending and descending methods.
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

    public static <T> void swap(T[] o, int a, int b) {
        T temp = o[a];
        o[a] = o[b];
        o[b] = temp;
    }
}
