package com.patrikpolacek.sortingAlghoritms.examples;

public class BubleSort {

    public static void main(String[] args) {

        int[] unsortedArray = {20, 35, -15, 7, -55, 1, 22};
// Mentor implementation
        for (int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            for (int i = 0; i < lastUnsortedIndex; i++) {
                if (unsortedArray[i] > unsortedArray[i + 1]) {
                    swap(unsortedArray, i, i + 1);
                }
            }
        }


        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }

//       for (int i = 0; i < unsortedArray.length; i++){
//           System.out.println(bubbleSortArray(unsortedArray)[i]);
//       }
    }

    //Mentor implementation
    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }


    //MY OWN implementation
    static int[] bubbleSortArray(int[] arrayToSort) {
        int sortedIndex = 0;
        int unsortedIndex = arrayToSort.length;
        int[] sortedArray = new int[arrayToSort.length];


        while (unsortedIndex != 0) {
            for (int i = 1; i < unsortedIndex; i++) {
                for (int j = 0; j < i; j++) {
                    if (arrayToSort[j] > arrayToSort[i]) {
                        int foundBigger = arrayToSort[i];
                        arrayToSort[i] = arrayToSort[j];
                        arrayToSort[j] = foundBigger;
                    }
                }
            }
            unsortedIndex--;
        }

        return arrayToSort;

    }

}
