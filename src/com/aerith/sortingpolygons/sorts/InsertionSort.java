package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class uses to sort objects store in array using insertion sort method.
 * User can choose descending or ascending order
 * When using this class you do not need to create instances, because they are all static methods.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 *
 * @author Weilong Mao
 * @author Hoa Le
 * @author Hu Peng
 * @author Chris Wang
 * @version 1.0 October 07, 2022
 */
public class InsertionSort {
    /**
     * Method uses to sort objects store in array in descending order, it will call when user sorts by volume or base area
     * @param <T> the generic
     * @param arrays the shape array to store objects
     * @param comparator the comparator is used to sort
     */
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

    /**
     * Method uses to sort objects store in array in descending order, and using comparable interface for sorting height
     * @param <T> the Generic
     * @param arrays the shape array uses to store objects
     */
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
    /**
     * Method uses to sort objects store in array in ascending order, it will call when user sorts by volume or base area
     * @param <T> the generic
     * @param arrays the shape array to store objects
     * @param comparator the comparator is used to store
     */
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

    /**
     * Method uses to sort objects store in array in ascending order, and using comparable interface for sorting height
     * @param <T> the Generic
     * @param arrays the shape array uses to store objects
     */
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
