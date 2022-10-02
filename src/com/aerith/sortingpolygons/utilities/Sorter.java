package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.sorts.*;

import java.util.Comparator;


/**
 * Class clarification: This Class is used to manage sort type on this application
 *
 * @author Hoa Le
 * @author Weilong Mao
 * @author Hu Peng
 * @author Chris Wang
 *
 * @version 1.0 October 07, 2022
 */

public class Sorter {
    /**
     * No argument constructor
     */

    public Sorter() {

    }
    /**
     * Method uses to manage all sort methods included Comparator interface to compare two shapes by their base area and height
     * @param <T> The generic type
     * @param array the array use to hold all shapes
     * @param comparator the type of comparator uses to sort
     * @param method the sort method uses to sort
     * @param order the sort order use to sort
     */
    public <T extends Comparable<? super T>> void sort(T[] array, Comparator<? super T> comparator, char method, char order) {
        switch (method) {
            case 'i':
                if (order == 'a') InsertionSort.insertionSort(array, comparator);
                else if (order == 'd') InsertionSort.insertionSortDesc(array, comparator);
                else printOrderError();
                break;
            case 's':
                if (order == 'a') SelectionSort.selectionSort(array, comparator);
                else if (order == 'd') SelectionSort.selectionSortDesc(array, comparator);
                else printOrderError();
                break;
            case 'b':
                if (order == 'a') BubbleSort.bubbleSort(array, comparator);
                else if (order == 'd') BubbleSort.bubbleSortDesc(array, comparator);
                else printOrderError();
                break;
            case 'm':
                if (order == 'a') MergeSort.mergeSort(array, comparator);
                else if (order == 'd') MergeSort.mergeSortDesc(array, comparator);
                else printOrderError();
                break;
            case 'q':
                if (order == 'a') QuickSort.quickSort(array, comparator);
                else if (order == 'd') QuickSort.quickSortDesc(array, comparator);
                else printOrderError();
            case 'z':
                if (order == 'a') ShellSort.shellSort(array, comparator);
                else if (order == 'd') ShellSort.shellSortDesc(array, comparator);
                else printOrderError();
        }
    }

    /**
     *
     * Method uses to manage all sort methods and uses compareTo() method of Comparable interface to compare two shapes by their height
     * @param <T> The generic type
     * @param array the array use to hold all shapes
     * @param method the sort method uses to sort
     * @param order the sort order use to sort
     */
    public <T extends Comparable<? super T>> void sort(T[] array, char method, char order) {
        switch (method) {
            case 'i':
                if (order == 'a') InsertionSort.insertionSort(array);
                else if (order == 'd') InsertionSort.insertionSortDesc(array);
                else printOrderError();
                break;
            case 's':
                if (order == 'a') SelectionSort.selectionSort(array);
                else if (order == 'd') SelectionSort.selectionSortDesc(array);
                else printOrderError();
                break;
            case 'b':
                if (order == 'a') BubbleSort.bubbleSort(array);
                else if (order == 'd') BubbleSort.bubbleSortDesc(array);
                else printOrderError();
                break;
            case 'm':
                if (order == 'a') MergeSort.mergeSort(array);
                else if (order == 'd') MergeSort.mergeSortDesc(array);
                else printOrderError();
                break;
            case 'q':
                if (order == 'a') QuickSort.quickSort(array);
                else if (order == 'd') QuickSort.quickSortDesc(array);
                else printOrderError();
            case 'z':
                if (order == 'a') ShellSort.shellSort(array);
                else if (order == 'd') ShellSort.shellSortDesc(array);
                else printOrderError();
        }
    }

    private void printOrderError() {
        System.out.println("Error: Use 'a' for ascending or 'd' for descending.");
    }


}
