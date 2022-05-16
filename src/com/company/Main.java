package com.company;

import java.util.*;

public class Main {
    static List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
    static List<String> words = new ArrayList<>(List.of("Умом", "умом", " Россию", " не", " не", " не", " понять!", " Аршином", " общим", " общим", " не", " измерить", " измерить!"));

    public static void main(String[] args) {


        oddNumbers(nums);
        evenNumbers(nums);
        withoutDuplicates();
        numberOfRepetitions();
    }

    public static void oddNumbers(List<Integer> numbers) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                continue;
            } else {
                nums.add(numbers.get(i));
            }
        }
        System.out.println(nums);
    }

    public static void evenNumbers(List<Integer> numbers) {
        Set<Integer> nums = new HashSet<>();
        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 != 0) {
                continue;
            } else {
                nums.add(numbers.get(i));
            }
        }
        Integer[] arr = new Integer[nums.size()];
        arr = nums.toArray(arr);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void withoutDuplicates() {
        Set<String> list = new HashSet<>(words);
        System.out.println(list);
    }

    public static void numberOfRepetitions() {
        Set<String> list = new HashSet<>(words);
        System.out.println("Найдено " + (words.size() - list.size()) * 2 + " одинаковых слов");
    }
}
