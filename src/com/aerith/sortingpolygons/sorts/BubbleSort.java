package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort comparable array by using bubble sort.
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
public class BubbleSort {

    /**
     * Method uses to sort objects store in comparable array in descending order, it will compare array's elements by comparator.
     *
     * @param <T>        the generic type
     * @param array      the array to store objects
     * @param comparator the comparator is used to sort
     */
    public static <T extends Comparable<? super T>> void bubbleSortDesc(T[] array, Comparator<? super T> comparator) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.compare(array[i], array[i + 1]) < 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    /**
     * Method uses to sort objects store in comparable array in descending order.
     *
     * @param <T>   the generic type
     * @param array the array uses to store objects
     */
    public static <T extends Comparable<? super T>> void bubbleSortDesc(T[] array) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) < 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    /**
     * Method uses to sort objects store in comparable array in ascending order, it will compare array's elements by comparator.
     *
     * @param <T>        the generic type
     * @param array      the array to store objects
     * @param comparator the comparator is used to store
     */

    public static <T extends Comparable<? super T>> void bubbleSort(T[] array, Comparator<? super T> comparator) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (comparator.compare(array[i], array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }

    /**
     * Method uses to sort objects store in comparable array in ascending order.
     *
     * @param <T>   the generic type
     * @param array the array uses to store objects
     */
    public static <T extends Comparable<? super T>> void bubbleSort(T[] array) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i].compareTo(array[i + 1]) > 0) {
                    T temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    swapped = true;
                }
            }
        }
    }
}
