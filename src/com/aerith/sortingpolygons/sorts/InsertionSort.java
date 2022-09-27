package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort arrays using insertion sort.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 * When using this class you do not need to create instances, because they are all static methods.
 * And they already include both ascending and descending methods.
 *
 * @author Weilong Mao
 */
public class InsertionSort {

    public InsertionSort() {
    }

    public static <T extends Comparable<? super T>> void insertionSortDesc(T[] arrays, Comparator<? super T> comparator) {
        for (int i = 0; i < arrays.length; i++) {
            T o = arrays[i];
            int j = i;
            while ((j > 0) && (comparator.compare(arrays[j - 1], o) < 0)) {
                arrays[j] = arrays[j - 1];
                j--;
            }
            arrays[j] = o;
        }
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] arrays, Comparator<? super T> comparator) {
        for (int i = 0; i < arrays.length; i++) {
            T o = arrays[i];
            int j = i;
            while ((j > 0) && (comparator.compare(arrays[j - 1], o) > 0)) {
                arrays[j] = arrays[j - 1];
                j--;
            }
            arrays[j] = o;
        }
    }

    public static <T extends Comparable<? super T>> void insertionSortDesc(T[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            T o = arrays[i];
            int j = i;
            while ((j > 0) && (arrays[j - 1].compareTo(o) < 0)) {
                arrays[j] = arrays[j - 1];
                j--;
            }
            arrays[j] = o;
        }
    }

    public static <T extends Comparable<? super T>> void insertionSort(T[] arrays) {
        for (int i = 0; i < arrays.length; i++) {
            T o = arrays[i];
            int j = i;
            while ((j > 0) && (arrays[j - 1].compareTo(o) > 0)) {
                arrays[j] = arrays[j - 1];
                j--;
            }
            arrays[j] = o;
        }
    }
}
