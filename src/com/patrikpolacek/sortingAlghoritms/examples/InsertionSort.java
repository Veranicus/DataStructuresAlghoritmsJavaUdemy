package com.patrikpolacek.sortingAlghoritms.examples;

public class InsertionSort {


    public static void main(String[] args) {

        int[] unsortedArray = {4, 2, 2, 6, 814, 14, 2, 3, 1, 87, 356, -5644, 46, 8};

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < unsortedArray.length; firstUnsortedIndex++) {
            int newElement = unsortedArray[firstUnsortedIndex];

            int i;

            for (i = firstUnsortedIndex; i > 0 && unsortedArray[i - 1] > newElement; i--) {

                unsortedArray[i] = unsortedArray[i - 1];
            }
            unsortedArray[i] = newElement;
        }

        for (int i = 0; i < unsortedArray.length; i++) {
            System.out.println(unsortedArray[i]);
        }

    }


}
