package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort comparable array by using Shell sort.
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
public class ShellSort {

    /** THESE METHODS ONLY CALL WHEN USER SELECT ASCENDING SORT **/

    /**
     * This method is function to sort comparable array using Shell sort.
     *
     * @param array the array need to be sorted
     * @param <T>   a generic type
     */

    public static <T extends Comparable<? super T>> void shellSort(T[] array) {
        int length = array.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = array[i];
                int j = i - gap;
                while (j >= 0 && array[j].compareTo(t) > 0) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = t;
            }
            gap /= 2;
        }
    }

    /**
     * Method uses to call sort function of Shell sort, it will compare array's elements by comparator.
     *
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param <T>        a generic type
     */
    public static <T extends Comparable<? super T>> void shellSort(T[] array, Comparator<? super T> comparator) {
        int length = array.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = array[i];
                int j = i - gap;
                while (j >= 0 && comparator.compare(array[j], t) > 0) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = t;
            }
            gap /= 2;
        }
    }
    /** THESE METHODS ONLY CALL WHEN USER SELECT DESCENDING SORT **/

    /**
     * Method uses to call sort function of Shell sort, it will compare array's elements by comparator.
     *
     * @param array      the array need to be sorted
     * @param comparator the comparator used to sort
     * @param <T>        a generic type
     */
    public static <T extends Comparable<? super T>> void shellSortDesc(T[] array, Comparator<? super T> comparator) {
        int length = array.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = array[i];
                int j = i - gap;
                while (j >= 0 && comparator.compare(array[j], t) < 0) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = t;
            }
            gap /= 2;
        }
    }

    /**
     * This method is function to sort comparable array using Shell sort.
     *
     * @param array the array need to be sorted
     * @param <T>   a generic type
     */
    public static <T extends Comparable<? super T>> void shellSortDesc(T[] array) {
        int length = array.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = array[i];
                int j = i - gap;
                while (j >= 0 && array[j].compareTo(t) < 0) {
                    array[j + gap] = array[j];
                    j -= gap;
                }
                array[j + gap] = t;
            }
            gap /= 2;
        }

    }
}
