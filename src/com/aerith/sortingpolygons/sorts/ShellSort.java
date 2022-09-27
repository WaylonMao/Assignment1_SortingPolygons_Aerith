package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description:
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
