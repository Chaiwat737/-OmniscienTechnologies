package com.test.Omniscien;

import java.util.Map;
import java.util.TreeMap;

public class Question3 {
    public static void countCharacters(String input) {

        input = input.toLowerCase();
        System.out.println("input :: "+input);
        Map<Character, Integer> map = new TreeMap<>();

        for (char c : input.toCharArray()) {
            System.out.println("c :: "+c);
            if (c == ' ') {
                continue;
            }
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
    public static void main(String[] args) {

        String input = "This is a test sentence ";

        countCharacters(input);
    }
}


