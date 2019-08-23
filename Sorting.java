package org.guptahiten;

public class Sorting {


    //sorting algos goes here
    //bubble recursive-bubble selection insertion recursive-insertion heap merge quick

    private int[] selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int min_index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_index]) {
                    min_index = j;
                }
            }
            int temp = array[min_index];
            array[min_index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    private int[] insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;

            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }


    // MERGE SORT //

    private void merge(int[] array, int l, int m, int r) {

        //find size of subArrays
        int n1 = m - l + 1;
        int n2 = r - m;

        //Create temp subArrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Copy Data to these subArrays
        for (int i = 0; i < n1; i++) {
            L[i] = array[l + i];
        }
        for (int j = 0; j < n2; j++) {
            R[j] = array[m + 1 + j];
        }


        /* Now MERGE these two subArrays */

        //INITIAL index of temp subArrays (they starts from index 0)
        int i = 0;
        int j = 0;

        //INITIAL index of to-be-merged array
        int k = l;


        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                array[k] = L[i];
                i++;
            } else {
                array[k] = R[j];
                j++;
            }
            k++;
        }

        //Remaining items of subArrays to be put in mergedArray
        while (i < n1) {
            array[k] = L[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = R[j];
            j++;
            k++;
        }
    }


    private void sort(int[] array, int l, int r) {
        if (l < r) {
            int m = (l + r) / 2;

            sort(array, l, m);
            sort(array, m + 1, r);

            merge(array, l, m, r);
        }
    }


    // QUICK SORT //

    private int partition(int[] array, int low, int high) {
        int pivot = array[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (array[j] <= pivot) {
                i++;

                // swap array[i] and array[j]
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        // swap array[i + 1] and array[high] (or pivot)
        int temp = array[i + 1];
        array[i + 1] = array[high];
        array[high] = temp;

        return i + 1;

    }

    private void qsort(int[] array, int low, int high) {
        if (low < high) {
            int pi = partition(array, low, high);
            sort(array, low, pi - 1);
            sort(array, pi + 1, high);
        }


    }

}
