package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort comparable array by using merge sort.
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
public class MergeSort {

    /**THIS PART IS USED WHEN USER CHOOSE ASCENDING SORT**/
    /**
     * This method is used to sort comparable arrays in ascending order by merge sort method.
     *
     * @param array the array need to be sorted
     * @param <T>   a Generic type
     */
    public static <T extends Comparable<? super T>> void mergeSort(T[] array) {
        doSort(array, 0, array.length - 1);
    }

    /**
     * This method is used to sort comparable arrays in ascending order by merge sort method, it will compare array's
     * elements by comparator. it will compare array's elements by comparator.
     *
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param <T>        a Generic type
     */
    public static <T extends Comparable<? super T>> void mergeSort(T[] array, Comparator<? super T> comparator) {
        doSort(array, 0, array.length - 1, comparator);
    }

    /**
     * The method uses recursion to divide the array to two parts then do sort and merge.
     *
     * @param array the array need to be sorted
     * @param left  the index of the first elements in the array
     * @param right the index of the last elements in the array
     * @param <T>   a Generic type
     */
    private static <T extends Comparable<? super T>> void doSort(T[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            doSort(array, left, mid);
            doSort(array, mid + 1, right);
            doMerge(array, left, mid, right);
        }
    }

    /**
     * The method uses recursion to divide the array to two parts then do sort and merge by using comparator.
     *
     * @param array      the array need to be sorted
     * @param left       the index of the first elements in the array
     * @param right      the index of the last elements in the array
     * @param comparator the comparator used to do the sorting
     * @param <T>        a Generic type
     */
    private static <T extends Comparable<? super T>> void doSort(T[] array, int left, int right, Comparator<? super T> comparator) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            doSort(array, left, mid, comparator);
            doSort(array, mid + 1, right, comparator);
            doMerge(array, left, mid, right, comparator);
        }
    }

    /**
     * This method will divide array to two parts and compare left part to right part one by one. And it will add the
     * smaller one to a new array. When finished, pass the sorted array into the original array.
     *
     * @param array the array need to be sorted
     * @param left  the index of the first elements in the array
     * @param mid   the index of the middle elements in the array
     * @param right the index of the last elements in the array
     * @param <T>   a Generic type
     */
    private static <T extends Comparable<? super T>> void doMerge(T[] array, int left, int mid, int right) {
        T[] newarray = (T[]) new Comparable[right - left + 1];

        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (array[leftIndex].compareTo(array[rightIndex]) < 0) newarray[outIndex++] = array[leftIndex++];
            else newarray[outIndex++] = array[rightIndex++];
        }
        while (leftIndex <= mid) newarray[outIndex++] = array[leftIndex++];
        while (rightIndex <= right) newarray[outIndex++] = array[rightIndex++];
        for (int m = 0; m < newarray.length; m++) {
            array[m + left] = newarray[m];
        }
    }

    /**
     * This method will divide array to two parts and compare left part to right part one by one. And it will add the
     * smaller one to a new array. When finished, pass the sorted array into the original array.
     *
     * @param array      the array need to be sorted
     * @param left       the index of the first elements in the array
     * @param mid        the index of the middle elements in the array
     * @param right      the index of the last elements in the array
     * @param comparator the comparator used to do the sorting
     * @param <T>        a Generic type
     */
    private static <T extends Comparable<? super T>> void doMerge(T[] array, int left, int mid, int right, Comparator<? super T> comparator) {
        T[] newarray = (T[]) new Comparable[right - left + 1];

        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (comparator.compare(array[leftIndex], array[rightIndex]) < 0)
                newarray[outIndex++] = array[leftIndex++];
            else newarray[outIndex++] = array[rightIndex++];
        }
        while (leftIndex <= mid) newarray[outIndex++] = array[leftIndex++];
        while (rightIndex <= right) newarray[outIndex++] = array[rightIndex++];
        for (int m = 0; m < newarray.length; m++) {
            array[m + left] = newarray[m];
        }
    }

    /**THIS PART IS USED WHEN USER CHOOSE DESCENDING SORT**/
    /**
     * This method is used to sort comparable arrays in descending order by merge sort method.
     *
     * @param array the shape array to store all shape data
     * @param <T>   a Generic type
     */
    public static <T extends Comparable<? super T>> void mergeSortDesc(T[] array) {
        doSortDesc(array, 0, array.length - 1);
    }

    /**
     * This method is used to sort comparable arrays in descending order by merge sort method, it will compare array's
     * elements by comparator.
     *
     * @param array      the shape array to store all shape data
     * @param comparator the comparator used to sort
     * @param <T>        a Generic type
     */
    public static <T extends Comparable<? super T>> void mergeSortDesc(T[] array, Comparator<? super T> comparator) {
        doSortDesc(array, 0, array.length - 1, comparator);
    }

    /**
     * The method uses recursion to divide the array to two parts then do sort and merge.
     *
     * @param array the array need to be sorted
     * @param left  the index of the first elements in the array
     * @param right the index of the last elements in the array
     * @param <T>   a Generic type
     */
    private static <T extends Comparable<? super T>> void doSortDesc(T[] array, int left, int right) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            doSortDesc(array, left, mid);
            doSortDesc(array, mid + 1, right);
            doMergeDesc(array, left, mid, right);
        }
    }

    /**
     * The method uses recursion to divide the array to two parts then do sort and merge by using comparator.
     *
     * @param array      the array need to be sorted
     * @param left       the index of the first elements in the array
     * @param right      the index of the last elements in the array
     * @param comparator the comparator used to do the sorting
     * @param <T>        a Generic type
     */
    private static <T extends Comparable<? super T>> void doSortDesc(T[] array, int left, int right, Comparator<? super T> comparator) {
        if (left < right) {
            int mid = (left + right) >>> 1;
            doSortDesc(array, left, mid, comparator);
            doSortDesc(array, mid + 1, right, comparator);
            doMergeDesc(array, left, mid, right, comparator);
        }
    }

    /**
     * This method will divide array to two parts and compare left part to right part one by one. And it will add the
     * greater one to a new array. When finished, pass the sorted array into the original array.
     *
     * @param array the array need to be sorted
     * @param left  the index of the first elements in the array
     * @param mid   the index of the middle elements in the array
     * @param right the index of the last elements in the array
     * @param <T>   a Generic type
     */
    private static <T extends Comparable<? super T>> void doMergeDesc(T[] array, int left, int mid, int right) {
        T[] newarray = (T[]) new Comparable[right - left + 1];

        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (array[leftIndex].compareTo(array[rightIndex]) > 0) newarray[outIndex++] = array[leftIndex++];
            else newarray[outIndex++] = array[rightIndex++];
        }
        while (leftIndex <= mid) newarray[outIndex++] = array[leftIndex++];
        while (rightIndex <= right) newarray[outIndex++] = array[rightIndex++];
        for (int m = 0; m < newarray.length; m++) {
            array[m + left] = newarray[m];
        }
    }

    /**
     * This method will divide array to two parts and compare left part to right part one by one. And it will add the
     * greater one to a new array. When finished, pass the sorted array into the original array.
     *
     * @param array      the array need to be sorted
     * @param left       the index of the first elements in the array
     * @param mid        the index of the middle elements in the array
     * @param right      the index of the last elements in the array
     * @param comparator the comparator used to do the sorting
     * @param <T>        a Generic type
     */
    private static <T extends Comparable<? super T>> void doMergeDesc(T[] array, int left, int mid, int right, Comparator<? super T> comparator) {
        T[] newarray = (T[]) new Comparable[right - left + 1];

        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (comparator.compare(array[leftIndex], array[rightIndex]) > 0)
                newarray[outIndex++] = array[leftIndex++];
            else newarray[outIndex++] = array[rightIndex++];
        }
        while (leftIndex <= mid) newarray[outIndex++] = array[leftIndex++];
        while (rightIndex <= right) newarray[outIndex++] = array[rightIndex++];
        for (int m = 0; m < newarray.length; m++) {
            array[m + left] = newarray[m];
        }
    }
}
