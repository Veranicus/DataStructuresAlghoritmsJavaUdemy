package com.patrikpolacek.sortingAlghoritms.examples;

public class ShellSort {


    public static void main(String[] args) {

        int[] intArray = {4, 2, 2, 6, 814, 14, 2, 3, 1, 87, 356, -5644, 46, 8};

        for (int gap = intArray.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < intArray.length; i++) {
                int newElement = intArray[i];

                int j = i;

                while (j >= gap && intArray[j - gap] > newElement) {
                    intArray[j] = intArray[j - gap];
                    j = gap;
                }

                intArray[j] = newElement;
            }
        }

        for (int i = 0; i < intArray.length; i++) {
            System.out.println(intArray[i]);
        }

    }


}
