package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort comparable array by using insertion sort.
 * The array should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 * When using this class you do not need to create instances, because they are all static methods.
 * And this class already include both ascending and descending methods.
 *
 * @author Weilong Mao
 * @author Hoa Le
 * @author Hu Peng
 * @author Chris Wang
 * @version 1.0 October 07, 2022
 */
public class InsertionSort {

    /**THIS PART IS USED WHEN USER CHOOSE DESCENDING SORT**/

    /**
     * Method uses to sort objects store in comparable array in descending order, it will compare array's elements by comparator.
     *
     * @param <T>        the generic
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     */
    public static <T extends Comparable<? super T>> void insertionSortDesc(T[] array, Comparator<? super T> comparator) {
        for (int i = 0; i < array.length; i++) {
            T o = array[i];
            int j = i;
            while ((j > 0) && (comparator.compare(array[j - 1], o) < 0)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = o;
        }
    }

    /**
     * Method uses to sort objects store in comparable array in descending order.
     *
     * @param <T>   the generic
     * @param array the array need to be sorted
     */
    public static <T extends Comparable<? super T>> void insertionSortDesc(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T o = array[i];
            int j = i;
            while ((j > 0) && (array[j - 1].compareTo(o) < 0)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = o;
        }
    }
    /**THIS PART IS USED WHEN USER CHOOSE ASCENDING SORT**/

    /**
     * Method uses to sort objects store in comparable array in ascending order, it will compare array's elements by comparator.
     *
     * @param <T>        the generic
     * @param array      the array need to be sorted
     * @param comparator the comparator is used to store
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] array, Comparator<? super T> comparator) {
        for (int i = 0; i < array.length; i++) {
            T o = array[i];
            int j = i;
            while ((j > 0) && (comparator.compare(array[j - 1], o) > 0)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = o;
        }
    }

    /**
     * Method uses to sort objects store in comparable array in ascending order.
     *
     * @param <T>   the generic
     * @param array the array need to be sorted
     */
    public static <T extends Comparable<? super T>> void insertionSort(T[] array) {
        for (int i = 0; i < array.length; i++) {
            T o = array[i];
            int j = i;
            while ((j > 0) && (array[j - 1].compareTo(o) > 0)) {
                array[j] = array[j - 1];
                j--;
            }
            array[j] = o;
        }
    }
}
