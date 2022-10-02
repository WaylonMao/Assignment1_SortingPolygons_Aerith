package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class uses to sort objects store in array using Shell sort method.
 * User can choose descending or ascending order
 * When using this class you do not need to create instances, because they are all static methods.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 *
 * @author Weilong Mao
 * @author Hoa Le
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 */
public class ShellSort {

    /** THESE METHODS ONLY CALL WHEN USER SELECT ASCENDING SORT **/

    /**
     * This method is function to sort shape array using Shell sort
     * @param arrays the shape array store all shapes
     * @param <T> a Generic type
     */

    public static <T extends Comparable<? super T>> void shellSort(T[] arrays) {
        int length = arrays.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = arrays[i];
                int j = i - gap;
                while (j >= 0 && arrays[j].compareTo(t) > 0) {
                    arrays[j + gap] = arrays[j];
                    j -= gap;
                }
                arrays[j + gap] = t;
            }
            gap /= 2;
        }
    }
    /**
     * use to call sort function of Shell sort, it will call only when user sorts by volume and base area
     * @param arrays the shape array store objects data
     * @param comparator  the type comparator use to sort ( volume or base area)
     * @param <T> a Generic type
     */
    public static <T extends Comparable<? super T>> void shellSort(T[] arrays, Comparator<? super T> comparator) {
        int length = arrays.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = arrays[i];
                int j = i - gap;
                while (j >= 0 && comparator.compare(arrays[j], t) > 0) {
                    arrays[j + gap] = arrays[j];
                    j -= gap;
                }
                arrays[j + gap] = t;
            }
            gap /= 2;
        }
    }
    /** THESE METHODS ONLY CALL WHEN USER SELECT DESCENDING SORT **/

    /**
     * use to call sort function of Shell sort, it will call only when user sorts by volume and base area
     * @param arrays the shape array store objects data
     * @param comparator  the type comparator use to sort ( volume or base area)
     * @param <T> a Generic type
     */
    public static <T extends Comparable<? super T>> void shellSortDesc(T[] arrays, Comparator<? super T> comparator) {
        int length = arrays.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = arrays[i];
                int j = i - gap;
                while (j >= 0 && comparator.compare(arrays[j], t) < 0) {
                    arrays[j + gap] = arrays[j];
                    j -= gap;
                }
                arrays[j + gap] = t;
            }
            gap /= 2;
        }
    }

    /**
     * This method is function to sort shape array using Shell sort
     * @param arrays the shape array store all shapes
     * @param <T> a Generic type
     */
    public static <T extends Comparable<? super T>> void shellSortDesc(T[] arrays) {
        int length = arrays.length;
        T t;
        int gap = length / 2;
        while (gap > 0) {
            for (int i = gap; i < length; i++) {
                t = arrays[i];
                int j = i - gap;
                while (j >= 0 && arrays[j].compareTo(t) < 0) {
                    arrays[j + gap] = arrays[j];
                    j -= gap;
                }
                arrays[j + gap] = t;
            }
            gap /= 2;
        }

    }
}
