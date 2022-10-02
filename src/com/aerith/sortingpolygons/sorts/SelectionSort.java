package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort comparable array by using selection sort.
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
public class SelectionSort {

    /**
     * Method uses to sort objects sore in comparable array in descending order, it will compare array's elements by comparator.
     *
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param <T>        a generic type
     */
    public static <T extends Comparable<? super T>> void selectionSortDesc(T[] array, Comparator<? super T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[max], array[j]) < 0) {
                    max = j;
                }
            }
            if (max != i) {
                T temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
        }
    }

    /**
     * Method uses to sort objects sore in comparable array in descending order.
     *
     * @param array the array need to be sorted
     * @param <T>   a generic type
     */
    public static <T extends Comparable<? super T>> void selectionSortDesc(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int max = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[max].compareTo(array[j]) < 0) {
                    max = j;
                }
            }
            if (max != i) {
                T temp = array[i];
                array[i] = array[max];
                array[max] = temp;
            }
        }
    }

    /**
     * Method uses to sort objects sore in comparable array in ascending order, it will compare array's elements by comparator.
     *
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param <T>        a generic type
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] array, Comparator<? super T> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (comparator.compare(array[min], array[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                T temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }

    /**
     * Method uses to sort objects sore in comparable array in ascending order.
     *
     * @param array the array need to be sorted
     * @param <T>   a generic type
     */
    public static <T extends Comparable<? super T>> void selectionSort(T[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[min].compareTo(array[j]) > 0) {
                    min = j;
                }
            }
            if (min != i) {
                T temp = array[i];
                array[i] = array[min];
                array[min] = temp;
            }
        }
    }
}
