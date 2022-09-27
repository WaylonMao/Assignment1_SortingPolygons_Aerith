package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort arrays using Shell sort.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 * When using this class you do not need to create instances, because they are all static methods.
 * And they already include both ascending and descending methods.
 *
 * @author Weilong Mao
 */
public class ShellSort {
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
}
