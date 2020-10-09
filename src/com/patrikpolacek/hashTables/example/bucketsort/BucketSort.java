package com.patrikpolacek.hashTables.example.bucketsort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BucketSort {

    public static void main(String[] args) {

        int[] intArray = {54, 46, 24, 5, 7, 1, 4564};

        bucketSort(intArray);

        System.out.println(Arrays.toString(intArray));

    }

    public static void bucketSort(int[] input) {
        List<Integer>[] buckets = new List[10];

        for (int i = 0; i < buckets.length; i++) {
            buckets[i] = new ArrayList<>();
        }

        for (int i = 0; i < input.length; i++) {
            buckets[hash(input[i])].add(input[i]);
        }

        for (List bucket: buckets){
            Collections.sort(bucket);
        }

        int j = 0;
        for (int i = 0; i < buckets.length; i++ ){
            for (int value: buckets[i]){
                input[j++] = value;
            }
        }

    }

    private static int hash(int value) {
        return value / (int) 10 % 10;
    }


}
