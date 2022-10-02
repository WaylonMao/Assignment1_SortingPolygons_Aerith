package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort comparable array by using quick sort method.
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

public class QuickSort {

    /**THIS PART IS USED WHEN USER CHOOSE ASCENDING SORT**/

    /**
     * The Quicksort method to sort comparable array, it will compare array's elements by comparator.
     *
     * @param <T>        a Generic type
     * @param array      the array need to be sorted
     * @param comparator the comparator is used to sort
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] array, Comparator<? super T> comparator) {
        doQuick(array, comparator, 0, array.length - 1);
    }

    /**
     * The Quicksort method to sort comparable array.
     *
     * @param <T>   a Generic type
     * @param array the array need to be sorted
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] array) {
        doQuick(array, 0, array.length - 1);
    }

    /**
     * The main function that implements Quicksort, it will compare array's elements by comparator.
     *
     * @param <T>        a Generic type
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param low        the starting index in the array
     * @param high       the ending index in the array
     */
    public static <T extends Comparable<? super T>> void doQuick(T[] array, Comparator<? super T> comparator, int low, int high) {
        if (low < high) {
            int pi = partition(array, comparator, low, high);
            doQuick(array, comparator, low, pi - 1);
            doQuick(array, comparator, pi + 1, high);
        }
    }

    /**
     * The main function that implements Quicksort.
     *
     * @param <T>   a Generic type
     * @param array the array need to be sorted
     * @param low   the starting index in the array
     * @param high  the ending index in the array
     */
    public static <T extends Comparable<? super T>> void doQuick(T[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            doQuick(array, low, pi - 1);
            doQuick(array, pi + 1, high);
        }
    }

    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     * It will compare array's elements by comparator.
     *
     * @param <T>        a Generic type
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param low        the first index in the array
     * @param high       the last index in the array
     * @return the index of smaller
     */
    private static <T extends Comparable<? super T>> int partition(T[] array, Comparator<? super T> comparator, int low, int high) {
        // select pivot
        T pivot = array[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (comparator.compare(array[j], pivot) < 0) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        array[high] = array[i];
        array[i] = pivot;
        return i;
    }

    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     *
     * @param <T>   a Generic type
     * @param array the array need to be sorted
     * @param low   the first index in the array
     * @param high  the last index in the array
     * @return the index of smaller element
     */
    private static <T extends Comparable<? super T>> int partition(T[] array, int low, int high) {
        // select pivot
        T pivot = array[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (array[j].compareTo(pivot) < 0) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        array[high] = array[i];
        array[i] = pivot;
        return i;
    }

    /**THIS PART IS USED WHEN USER CHOOSE DESCENDING SORT**/

    /**
     * The Quicksort method to sort all arrays on array, it will compare array's elements by comparator.
     *
     * @param <T>        a Generic type
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     */
    public static <T extends Comparable<? super T>> void quickSortDesc(T[] array, Comparator<? super T> comparator) {
        doQuickDesc(array, comparator, 0, array.length - 1);
    }

    /**
     * The Quicksort method to sort comparable array.
     *
     * @param <T>   a Generic type
     * @param array the array need to be sorted
     */

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] array) {
        doQuickDesc(array, 0, array.length - 1);
    }

    /**
     * The main function that implements Quicksort, it will compare array's elements by comparator.
     *
     * @param <T>        a Generic type
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param low        the starting index in the array
     * @param high       the ending index in the array
     */
    public static <T extends Comparable<? super T>> void doQuickDesc(T[] array, Comparator<? super T> comparator, int low, int high) {
        if (low < high) {
            int pi = partitionDesc(array, comparator, low, high);
            doQuickDesc(array, comparator, low, pi - 1);
            doQuickDesc(array, comparator, pi + 1, high);
        }
    }

    /**
     * The main function that implements Quicksort.
     *
     * @param <T>   a Generic type
     * @param array the array need to be sorted
     * @param low   the starting index in the array
     * @param high  the ending index in the array
     */
    public static <T extends Comparable<? super T>> void doQuickDesc(T[] array, int low, int high) {
        if (low < high) {
            int pi = partitionDesc(array, low, high);
            doQuickDesc(array, low, pi - 1);
            doQuickDesc(array, pi + 1, high);
        }
    }

    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     * It will compare array's elements by comparator.
     *
     * @param <T>        a Generic type
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param low        the first index in the array
     * @param high       the last index in the array
     * @return           the index of smaller
     */
    private static <T extends Comparable<? super T>> int partitionDesc(T[] array, Comparator<? super T> comparator, int low, int high) {
        // select pivot
        T pivot = array[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (comparator.compare(array[j], pivot) > 0) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        array[high] = array[i];
        array[i] = pivot;
        return i;
    }

    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     *
     * @param <T>   a Generic type
     * @param array the array need to be sorted
     * @param low   the first index in the array
     * @param high  the last index in the array
     * @return      the index of smaller element
     */
    private static <T extends Comparable<? super T>> int partitionDesc(T[] array, int low, int high) {
        // select pivot
        T pivot = array[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (array[j].compareTo(pivot) > 0) {
                T temp = array[i];
                array[i] = array[j];
                array[j] = temp;
                i++;
            }
        }
        array[high] = array[i];
        array[i] = pivot;
        return i;
    }
}