package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class uses to sort objects store in array using Selection sort method.
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
public class SelectionSort {


    /**
     * Method use to sort objects sore in array in descending order, it will call when user sorts by volume or base area
     * @param arrays the shape array store objects to sort
     * @param comparator the comparator is used to sort
     * @param <T>
     */

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
    /**
     * Method use to sort objects sore in array in descending order, it will call when user sorts by height
     * @param arrays the shape array store objects to sort
     * @param <T>
     */
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
    /**
     * Method use to sort objects sore in array in ascending order, it will call when user sorts by volume or base area
     * @param arrays the shape array store objects to sort
     * @param comparator the comparator is used to sort
     * @param <T>
     */
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

    /**
     * Method use to sort objects sore in array in ascending order, it will call when user sorts by height
     * @param arrays the shape array store objects to sort
     * @param <T>
     */

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
    /**
     * This is utilize swap method use to swap element between 2 positions
     * @param o the Generic array store data
     * @param a the first index in shape array
     * @param b the second index in shape array
     * @param <T> a Generic typ
     */
    public static <T> void swap(T[] o, int a, int b) {
        T temp = o[a];
        o[a] = o[b];
        o[b] = temp;
    }
}
