package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class uses to sort objects store in array using Quicksort method.
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

public class QuickSort {

    /**THIS PART IS USED WHEN USER CHOOSE ASCENDING SORT**/

    /**
     * The Quicksort method to sort all shapes on array, it will use when user choose compared by volume or base area
     * @param <T> a Generic type
     * @param shape the shape array to store all shape data
     * @param comparator the comparator type (volume or base area)
     */
    public static <T extends Comparable<? super T>> void quickSort(T[] shape, Comparator<? super T> comparator) {
        doQuick(shape, comparator, 0, shape.length - 1);
    }
    /**
     * The Quicksort method to sort all shapes on array, it will use when user choose compared by height
     * @param <T> a Generic type
     * @param shape shape the shape array to store all shape data
     */

    public static <T extends Comparable<? super T>> void quickSort(T[] shape) {
        doQuick(shape, 0, shape.length - 1);
    }

    /**
     * The main function that implements Quicksort, only call this method when user sorts by volume or base area of shape
     * @param <T> a Generic type
     * @param shape the shape array store all shape data
     * @param comparator the comparable type
     * @param low the starting index in shape array
     * @param high the ending index in shape array
     */
    public static <T extends Comparable<? super T>> void doQuick(T[] shape, Comparator<? super T> comparator, int low, int high) {
        if (low < high) {
            int pi = partition(shape, comparator, low, high);
            doQuick(shape, comparator, low, pi - 1);
            doQuick(shape, comparator, pi + 1, high);
        }
    }

    /**
     * The main function that implements Quicksort, only call this method when user sorts by height of shape
     * @param <T> a Generic type
     * @param shape the shape array store all shape data
     * @param low the starting index in shape array
     * @param high the ending index in shape array
     */
    public static <T extends Comparable<? super T>> void doQuick(T[] shape, int low, int high) {
        if (low < high) {
            int pi = partition(shape, low, high);
            doQuick(shape, low, pi - 1);
            doQuick(shape, pi + 1, high);
        }
    }
    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     * Only call this method when user sorts by volume or base area
     * @param <T> a Generic type
     * @param shape the shape array to store shapes data
     * @param comparator the comparable type ( volume or base area)
     * @param low the first index in shape array
     * @param high the last index in shape array
     * @return the index of smaller
     */

    private static <T extends Comparable<? super T>> int partition(T[] shape, Comparator<? super T> comparator, int low, int high) {
        // select pivot
        T pivot = shape[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (comparator.compare(shape[j], pivot) < 0) {
                T temp = shape[i];
                shape[i] = shape[j];
                shape[j] = temp;
                i++;
            }
        }
        shape[high] = shape[i];
        shape[i] = pivot;
        return i;

    }
    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     * Only call this method when user sorts by height
     * @param <T> a Generic type
     * @param shape the shape array to store shapes data
     * @param low the first index in shape array
     * @param high the last index in shape array
     * @return the index of smaller element
     */
    private static <T extends Comparable<? super T>> int partition(T[] shape, int low, int high) {
        // select pivot
        T pivot = shape[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (shape[j].compareTo(pivot) < 0) {
                T temp = shape[i];
                shape[i] = shape[j];
                shape[j] = temp;
                i++;
            }
        }
        shape[high] = shape[i];
        shape[i] = pivot;
        return i;
    }

    /**THIS PART IS USED WHEN USER CHOOSE DESCENDING SORT**/

    /**
     * The Quicksort method to sort all shapes on array, it will use when user choose compared by volume or base area
     * @param <T> a Generic type
     * @param shape the shape array to store all shape data
     * @param comparator the comparator type (volume or base area)
     */

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] shape, Comparator<? super T> comparator) {
        doQuickDesc(shape, comparator, 0, shape.length - 1);
    }

    /**
     * The Quicksort method to sort all shapes on array, it will use when user choose compared by height
     * @param <T> a Generic type
     * @param shape shape the shape array to store all shape data
     */

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] shape) {
        doQuickDesc(shape, 0, shape.length - 1);
    }

    /**
     * The main function that implements Quicksort, only call this method when user sorts by volume or base area of shape
     * @param <T> a Generic type
     * @param shape the shape array store all shape data
     * @param comparator the comparable type
     * @param low the starting index in shape array
     * @param high the ending index in shape array
     */

    public static <T extends Comparable<? super T>> void doQuickDesc(T[] shape, Comparator<? super T> comparator, int low, int high) {
        if (low < high) {
            int pi = partitionDesc(shape, comparator, low, high);
            doQuickDesc(shape, comparator, low, pi - 1);
            doQuickDesc(shape, comparator, pi + 1, high);
        }
    }
    /**
     * The main function that implements Quicksort, only call this method when user sorts by height of shape
     * @param <T> a Generic type
     * @param shape the shape array store all shape data
     * @param low the starting index in shape array
     * @param high the ending index in shape array
     */

    public static <T extends Comparable<? super T>> void doQuickDesc(T[] shape, int low, int high) {
        if (low < high) {
            int pi = partitionDesc(shape, low, high);
            doQuickDesc(shape, low, pi - 1);
            doQuickDesc(shape, pi + 1, high);
        }
    }
    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     * Only call this method when user sorts by volume or base area
     * @param <T> a Generic type
     * @param shape the shape array to store shapes data
     * @param comparator the comparable type ( volume or base area)
     * @param low the first index in shape array
     * @param high the last index in shape array
     * @return the index of smaller
     */
    private static <T extends Comparable<? super T>> int partitionDesc(T[] shape, Comparator<? super T> comparator, int low, int high) {
        // select pivot
        T pivot = shape[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (comparator.compare(shape[j], pivot) > 0) {
                T temp = shape[i];
                shape[i] = shape[j];
                shape[j] = temp;
                i++;
            }
        }
        shape[high] = shape[i];
        shape[i] = pivot;
        return i;
    }

    /**
     * This method will pick a last element on array as a pivot, places a pivot on a right position and
     * moves all the smaller elements to a left of a pivot, all the greater elements to right of pivot.
     * Only call this method when user sorts by height
     * @param <T> a Generic type
     * @param shape the shape array to store shapes data
     * @param low the first index in shape array
     * @param high the last index in shape array
     * @return the index of smaller element
     */

    private static <T extends Comparable<? super T>> int partitionDesc(T[] shape, int low, int high) {
        // select pivot
        T pivot = shape[high];
        int i = low;
        for (int j = low; j <= high - 1; j++) {
            // if current element is smaller than pivot, swap between those elements
            if (shape[j].compareTo(pivot) > 0) {
                T temp = shape[i];
                shape[i] = shape[j];
                shape[j] = temp;
                i++;
            }
        }
        shape[high] = shape[i];
        shape[i] = pivot;
        return i;
    }
}