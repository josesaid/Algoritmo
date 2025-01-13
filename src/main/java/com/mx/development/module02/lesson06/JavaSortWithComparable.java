package com.codegym.lessons.module02.lesson06;

import java.util.*;

public class JavaSortWithComparable {
    public static void main(String[] args) {
        List<Simpson> simpsons = new ArrayList<>();
        simpsons.add(new Simpson("Homer "));
        simpsons.add(new Simpson("Marge "));
        simpsons.add(new Simpson("Bart "));
        simpsons.add(new Simpson("Lisa "));

        Collections.sort(simpsons);
        simpsons.stream().map(s -> s.getName()).forEach(System.out::println);

        Collections.reverse(simpsons);
        simpsons.stream().forEach(System.out::println);
        //simpsons.stream().map(s -> s.name).forEach(System.out::println);
    }
}
