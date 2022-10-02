package com.aerith.sortingpolygons.sorts;

import java.util.Comparator;

/**
 * Class description: This class can sort arrays using quick sort.
 * The arrays should implement Comparable. And you need a comparator instance,
 * if you want to use comparator to do the compare part.
 * When using this class you do not need to create instances, because they are all static methods.
 * And they already include both ascending and descending methods.
 *
 * @author Hoa Le, Weilong Mao
 */
public class QuickSort {
    public static <T extends Comparable<? super T>> void quickSort(T[] shape, Comparator<? super T> comparator) {
        doQuick(shape, comparator, 0, shape.length - 1);
    }


    public static <T extends Comparable<? super T>> void quickSort(T[] shape) {
        doQuick(shape, 0, shape.length - 1);
    }

    public static <T extends Comparable<? super T>> void doQuick(T[] shape, Comparator<? super T> comparator, int low, int high) {
        if (low < high) {
            int pi = partition(shape, comparator, low, high);
            doQuick(shape, comparator, low, pi - 1);
            doQuick(shape, comparator, pi + 1, high);
        }
    }


    public static <T extends Comparable<? super T>> void doQuick(T[] shape, int low, int high) {
        if (low < high) {
            int pi = partition(shape, low, high);
            doQuick(shape, low, pi - 1);
            doQuick(shape, pi + 1, high);
        }
    }

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

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] shape, Comparator<? super T> comparator) {
        doQuickDesc(shape, comparator, 0, shape.length - 1);
    }

    public static <T extends Comparable<? super T>> void quickSortDesc(T[] shape) {
        doQuickDesc(shape, 0, shape.length - 1);
    }

    public static <T extends Comparable<? super T>> void doQuickDesc(T[] shape, Comparator<? super T> comparator, int low, int high) {
        if (low < high) {
            int pi = partitionDesc(shape, comparator, low, high);
            doQuickDesc(shape, comparator, low, pi - 1);
            doQuickDesc(shape, comparator, pi + 1, high);
        }
    }

    public static <T extends Comparable<? super T>> void doQuickDesc(T[] shape, int low, int high) {
        if (low < high) {
            int pi = partitionDesc(shape, low, high);
            doQuickDesc(shape, low, pi - 1);
            doQuickDesc(shape, pi + 1, high);
        }
    }

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