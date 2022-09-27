package com.aerith.sortingpolygons.sorts;


import java.util.Arrays;
import java.util.Comparator;

/**
 * Class description:
 *
 * @author Weilong Mao
 */
public class MergeSort {

    public static <T extends Comparable<? super T>> void mergeSort(T[] arrays) {
        doSort(arrays, 0, arrays.length - 1);
    }

    public static <T extends Comparable<? super T>> void mergeSort(T[] arrays, Comparator<? super T> comparator) {
        doSort(arrays, 0, arrays.length - 1, comparator);
    }

    private static <T extends Comparable<? super T>> void doSort(T[] arrays, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) >>> 1;
        doSort(arrays, left, mid);
        doSort(arrays, mid + 1, right);
        doMerge(arrays, left, mid, right);
    }

    private static <T extends Comparable<? super T>> void doSort(T[] arrays, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) return;

        int mid = (left + right) >>> 1;
        doSort(arrays, left, mid, comparator);
        doSort(arrays, mid + 1, right, comparator);
        doMerge(arrays, left, mid, right, comparator);
    }

    private static <T extends Comparable<? super T>> void doMerge(T[] arrays, int left, int mid, int right) {
        T[] newArrays = (T[]) new Comparable[right - left + 1];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (arrays[leftIndex].compareTo(arrays[rightIndex]) < 0) newArrays[outIndex++] = arrays[leftIndex++];
            else newArrays[outIndex++] = arrays[rightIndex++];
        }
        while (leftIndex <= mid) newArrays[outIndex++] = arrays[leftIndex++];
        while (rightIndex <= right) newArrays[outIndex++] = arrays[rightIndex++];
        for (int m = 0; m < newArrays.length; m++) {
            arrays[m + left] = newArrays[m];
        }
    }

    private static <T extends Comparable<? super T>> void doMerge(T[] arrays, int left, int mid, int right, Comparator<? super T> comparator) {
        T[] newArrays = (T[]) new Comparable[right - left + 1];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (comparator.compare(arrays[leftIndex], arrays[rightIndex]) < 0)
                newArrays[outIndex++] = arrays[leftIndex++];
            else newArrays[outIndex++] = arrays[rightIndex++];
        }
        while (leftIndex <= mid) newArrays[outIndex++] = arrays[leftIndex++];
        while (rightIndex <= right) newArrays[outIndex++] = arrays[rightIndex++];
        for (int m = 0; m < newArrays.length; m++) {
            arrays[m + left] = newArrays[m];
        }
    }

    public static <T extends Comparable<? super T>> void mergeSortDesc(T[] arrays) {
        doSortDesc(arrays, 0, arrays.length - 1);
    }

    public static <T extends Comparable<? super T>> void mergeSortDesc(T[] arrays, Comparator<? super T> comparator) {
        doSortDesc(arrays, 0, arrays.length - 1, comparator);
    }

    private static <T extends Comparable<? super T>> void doSortDesc(T[] arrays, int left, int right) {
        if (left >= right) return;

        int mid = (left + right) >>> 1;
        doSortDesc(arrays, left, mid);
        doSortDesc(arrays, mid + 1, right);
        doMergeDesc(arrays, left, mid, right);
    }

    private static <T extends Comparable<? super T>> void doSortDesc(T[] arrays, int left, int right, Comparator<? super T> comparator) {
        if (left >= right) return;

        int mid = (left + right) >>> 1;
        doSortDesc(arrays, left, mid, comparator);
        doSortDesc(arrays, mid + 1, right, comparator);
        doMergeDesc(arrays, left, mid, right, comparator);
    }

    private static <T extends Comparable<? super T>> void doMergeDesc(T[] arrays, int left, int mid, int right) {
        T[] newArrays = (T[]) new Comparable[right - left + 1];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (arrays[leftIndex].compareTo(arrays[rightIndex]) > 0) newArrays[outIndex++] = arrays[leftIndex++];
            else newArrays[outIndex++] = arrays[rightIndex++];
        }
        while (leftIndex <= mid) newArrays[outIndex++] = arrays[leftIndex++];
        while (rightIndex <= right) newArrays[outIndex++] = arrays[rightIndex++];
        for (int m = 0; m < newArrays.length; m++) {
            arrays[m + left] = newArrays[m];
        }
    }

    private static <T extends Comparable<? super T>> void doMergeDesc(T[] arrays, int left, int mid, int right, Comparator<? super T> comparator) {
        T[] newArrays = (T[]) new Comparable[right - left + 1];
        int leftIndex = left;
        int rightIndex = mid + 1;
        int outIndex = 0;
        while (leftIndex <= mid && rightIndex <= right) {
            if (comparator.compare(arrays[leftIndex], arrays[rightIndex]) > 0)
                newArrays[outIndex++] = arrays[leftIndex++];
            else newArrays[outIndex++] = arrays[rightIndex++];
        }
        while (leftIndex <= mid) newArrays[outIndex++] = arrays[leftIndex++];
        while (rightIndex <= right) newArrays[outIndex++] = arrays[rightIndex++];
        for (int m = 0; m < newArrays.length; m++) {
            arrays[m + left] = newArrays[m];
        }
    }
}
