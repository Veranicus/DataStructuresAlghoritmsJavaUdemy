package com.patrikpolacek.sortingAlghoritms.examples;

public class SelectionSort {

    public static void main(String[] args) {
        int[] unsortedArray = {42, 25, 1, 47, -98, 60, 56};

        for (int lastUnsortedIndex = unsortedArray.length - 1; lastUnsortedIndex > 0;
             lastUnsortedIndex--) {
            int largestIndex = 0;

            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (unsortedArray[i] > unsortedArray[largestIndex]) {
                    largestIndex = i;
                }
            }
            swap(unsortedArray, largestIndex, lastUnsortedIndex);
        }

        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }

    }

    //Mentor implementation
    public static void swap(int[] array, int i, int j) {
        if (i != j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }


}
