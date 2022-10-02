package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 *
 * Class description: This class uses to sort objects store in array using bubble sort method.
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
public class BubbleSort {

    /**
     * Method uses to sort objects store in array in descending order, it will call when user sorts by volume or base area
     * @param <T> the generic type
     * @param arrays the array to store objects
     * @param comparator the comparator is used to sort
     */

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
    /**
     * Method uses to sort objects store in array in descending order, and it will call when use sorts by height
     * @param <T> the Generic type
     * @param arrays the  array uses to store objects
     */
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
    /**
     * Method uses to sort objects store in array in ascending order, it will call when user sorts by volume or base area
     * @param <T> the generic type
     * @param arrays the array to store objects
     * @param comparator the comparator is used to store
     */

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

    /**
     * Method uses to sort objects store in array in ascending order, and it will call when use sorts by height
     * @param <T> the Generic type
     * @param arrays the  array uses to store objects
     */
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
