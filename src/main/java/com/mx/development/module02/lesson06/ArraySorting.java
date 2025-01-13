package com.codegym.lessons.module02.lesson06;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String... moeTavern) {
        int[] moesPints = new int[] {9, 8, 7, 6, 1};

        Arrays.sort(moesPints);
        Arrays.stream(moesPints).forEach(System.out::print);

        System.out.println();

        Simpson[] simpsons = new Simpson[]{new Simpson("Lisa"), new Simpson("Homer")};
        Arrays.sort(simpsons);
        Arrays.stream(simpsons).map(s -> s.getName()).forEach(System.out::println);
    }
}
