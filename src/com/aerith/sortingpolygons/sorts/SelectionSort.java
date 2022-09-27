package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort arrays using selection sort.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 * When using this class you do not need to create instances, because they are all static methods.
 * And they already include both ascending and descending methods.
 *
 * @author Weilong Mao
 */
public class SelectionSort {
    public SelectionSort() {
    }

    public static <T extends Comparable<? super T>> void selectionSortDesc(T[] arrays, Comparator<? super T> comparator) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (comparator.compare(arrays[max], arrays[j]) < 0) {
                    max = j;
                }
            }
            if (max != i) {
                swap(arrays, i, max);
            }
        }
    }

    public static <T extends Comparable<? super T>> void selectionSort(T[] arrays, Comparator<? super T> comparator) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (comparator.compare(arrays[min], arrays[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arrays, i, min);
            }
        }
    }

    public static <T extends Comparable<? super T>> void selectionSortDesc(T[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[max].compareTo(arrays[j]) < 0) {
                    max = j;
                }
            }
            if (max != i) {
                swap(arrays, i, max);
            }
        }
    }

    public static <T extends Comparable<? super T>> void selectionSort(T[] arrays) {
        for (int i = 0; i < arrays.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[min].compareTo(arrays[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                swap(arrays, i, min);
            }
        }
    }

    public static <T> void swap(T[] o, int a, int b) {
        T temp = o[a];
        o[a] = o[b];
        o[b] = temp;
    }
}
