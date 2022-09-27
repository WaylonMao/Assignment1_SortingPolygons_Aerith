package com.aerith.sortingpolygons.utilities;

import com.aerith.sortingpolygons.sorts.*;

import java.util.Comparator;


/**
 * Class description:
 *
 * @author Weilong Mao
 */
@SuppressWarnings("ALL")
public class Sorter {

    public Sorter() {

    }

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
        System.out.println("Error: Use 'i' for increasing or 'd' for descending.");
    }


}
