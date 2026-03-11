package com.test.Omniscien;

public class Question2 {
    public static void countOddEven(int start, int end) {

        int oddCount = 0;
        int evenCount = 0;

        System.out.println("Even numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                evenCount++;
            }
        }
        System.out.println("\n");
        System.out.println("Odd numbers:");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                oddCount++;
            }
        }
        System.out.println("\n");
        System.out.println("Even numbers count: " + evenCount);
        System.out.println("Odd numbers count: " + oddCount);
    }

    public static void main(String[] args) {

        int start = 1;
        int end = 10;

        countOddEven(start, end);
    }
}
