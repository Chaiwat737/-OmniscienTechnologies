package com.test.Omniscien;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SmallestMissingPositive {


    public static int findSmallestMissingPositive(int[] arr) {
        Set<Integer> set = new HashSet<>();

        String result = Arrays.toString(arr);

        System.out.println("int[] arr : "+ result);
        // เก็บค่าจาก array ลงใน set
        for (int num : arr) {
            if (num > 0) {
                set.add(num);
            }
        }

        int smallest = 1;

        // หาเลขบวกที่หายไป
        while (set.contains(smallest)) {
            smallest++;
        }

        return smallest;
    }

    public static void main(String[] args) {
        int[] input = {1, 3, 6, 4, 1, 2};

        int result = findSmallestMissingPositive(input);

        System.out.println("Smallest missing positive number: " + result);
    }
}

