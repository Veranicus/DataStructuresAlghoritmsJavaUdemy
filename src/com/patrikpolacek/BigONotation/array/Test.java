package com.patrikpolacek.BigONotation.array;

public class Test {

    public static void main(String[] args) {
        int[] intArray = new int[7];

        intArray[0] = 20;
        intArray[1] = 35;
        intArray[2] = -15;
        intArray[3] = 7;
        intArray[4] = 55;
        intArray[5] = 1;
        intArray[6] = -22;

        for (int i = 0; i < intArray.length; i++){
//            if we know index
//            O(1)
            System.out.println(intArray[i]);
        }
        for (int i = 0; i < intArray.length; i++){
//            if we don't know index
//            In the worst case we have to search the entire array because
//            the element can be at the last index
//            O(n) if we use brute force method like this
            if (intArray[i] == 7) {
                System.out.println("Found " + intArray[i]
                +" at index " + i);
            }
        }
    }
}
