package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class QuickSort {
    public static <T extends Comparable<? super T>> void quickSort(T[] arrays) {
        doQuick(arrays, 0, arrays.length - 1);
    }

    public static <T extends Comparable<? super T>> void quickSort(T[] arrays, Comparator<? super T> comparator) {
        doQuick(arrays, 0, arrays.length - 1, comparator);
    }


    private static <T extends Comparable<? super T>> void doQuick(T[] arrays, int left, int right) {
        if (left >= right) return;
        T pivot = arrays[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arrays[i].compareTo(pivot) <= 0) i++;
            while (i < j && arrays[j].compareTo(pivot) >= 0) j--;
            swap(arrays, i, j);
        }
        arrays[left] = arrays[i];
        arrays[i] = pivot;
        doQuick(arrays, left, j - 1);
        doQuick(arrays, j + 1, right);
    }

    private static <T extends Comparable<? super T>> void doQuick(T[] arrays, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) return;
        T pivot = arrays[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && comparator.compare(arrays[i], pivot) <= 0) i++;
            while (i < j && comparator.compare(arrays[j], pivot) >= 0) j--;
            swap(arrays, i, j);
        }
        arrays[left] = arrays[i];
        arrays[i] = pivot;
        doQuick(arrays, left, j - 1, comparator);
        doQuick(arrays, j + 1, right, comparator);
    }

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] arrays) {
        doQuickDesc(arrays, 0, arrays.length - 1);
    }

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] arrays, Comparator<? super T> comparator) {
        doQuickDesc(arrays, 0, arrays.length - 1, comparator);
    }

    private static <T extends Comparable<? super T>> void doQuickDesc(T[] arrays, int left, int right) {
        if (left >= right) return;
        T pivot = arrays[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && arrays[i].compareTo(pivot) >= 0) i++;
            while (i < j && arrays[j].compareTo(pivot) <= 0) j--;
            swap(arrays, i, j);
        }
        arrays[left] = arrays[i];
        arrays[i] = pivot;
        doQuickDesc(arrays, left, j - 1);
        doQuickDesc(arrays, j + 1, right);
    }

    private static <T extends Comparable<? super T>> void doQuickDesc(T[] arrays, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) return;
        T pivot = arrays[left];
        int i = left;
        int j = right;
        while (i < j) {
            while (i < j && comparator.compare(arrays[i], pivot) >= 0) i++;
            while (i < j && comparator.compare(arrays[j], pivot) <= 0) j--;
            swap(arrays, i, j);
        }
        arrays[left] = arrays[i];
        arrays[i] = pivot;
        doQuickDesc(arrays, left, j - 1,comparator);
        doQuickDesc(arrays, j + 1, right,comparator);
    }


    public static void swap(Object[] o, int a, int b) {
        Object temp = o[a];
        o[a] = o[b];
        o[b] = temp;
    }

}
