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
     * @param arrays the arrays use to hold all shapes
     * @param comparator the type of comparator uses to sort
     * @param method the sort method uses to sort
     * @param order the sort order use to sort
     */
    public <T extends Comparable<? super T>> void sort(T[] arrays, Comparator<? super T> comparator, char method, char order) {
        switch (method) {
            case 'i':
                if (order == 'a') InsertionSort.insertionSort(arrays, comparator);
                else if (order == 'd') InsertionSort.insertionSortDesc(arrays, comparator);
                else printOrderError();
                break;
            case 's':
                if (order == 'a') SelectionSort.selectionSort(arrays, comparator);
                else if (order == 'd') SelectionSort.selectionSortDesc(arrays, comparator);
                else printOrderError();
                break;
            case 'b':
                if (order == 'a') BubbleSort.bubbleSort(arrays, comparator);
                else if (order == 'd') BubbleSort.bubbleSortDesc(arrays, comparator);
                else printOrderError();
                break;
            case 'm':
                if (order == 'a') MergeSort.mergeSort(arrays, comparator);
                else if (order == 'd') MergeSort.mergeSortDesc(arrays, comparator);
                else printOrderError();
                break;
            case 'q':
                if (order == 'a') QuickSort.quickSort(arrays, comparator);
                else if (order == 'd') QuickSort.quickSortDesc(arrays, comparator);
                else printOrderError();
            case 'z':
                if (order == 'a') ShellSort.shellSort(arrays, comparator);
                else if (order == 'd') ShellSort.shellSortDesc(arrays, comparator);
                else printOrderError();
        }
    }

    /**
     *
     * Method uses to manage all sort methods and uses compareTo() method of Comparable interface to compare two shapes by their height
     * @param <T> The generic type
     * @param arrays the arrays use to hold all shapes
     * @param method the sort method uses to sort
     * @param order the sort order use to sort
     */
    public <T extends Comparable<? super T>> void sort(T[] arrays, char method, char order) {
        switch (method) {
            case 'i':
                if (order == 'a') InsertionSort.insertionSort(arrays);
                else if (order == 'd') InsertionSort.insertionSortDesc(arrays);
                else printOrderError();
                break;
            case 's':
                if (order == 'a') SelectionSort.selectionSort(arrays);
                else if (order == 'd') SelectionSort.selectionSortDesc(arrays);
                else printOrderError();
                break;
            case 'b':
                if (order == 'a') BubbleSort.bubbleSort(arrays);
                else if (order == 'd') BubbleSort.bubbleSortDesc(arrays);
                else printOrderError();
                break;
            case 'm':
                if (order == 'a') MergeSort.mergeSort(arrays);
                else if (order == 'd') MergeSort.mergeSortDesc(arrays);
                else printOrderError();
                break;
            case 'q':
                if (order == 'a') QuickSort.quickSort(arrays);
                else if (order == 'd') QuickSort.quickSortDesc(arrays);
                else printOrderError();
            case 'z':
                if (order == 'a') ShellSort.shellSort(arrays);
                else if (order == 'd') ShellSort.shellSortDesc(arrays);
                else printOrderError();
        }
    }

    private void printOrderError() {
        System.out.println("Error: Use 'a' for ascending or 'd' for descending.");
    }


}
