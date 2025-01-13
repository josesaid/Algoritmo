package com.codegym.lessons.module02.lesson06;

import java.util.*;

public class GoodExampleOfComparator {
    public static void main(String... args) {
        List<Simpson> characters = new ArrayList<>();

        Simpson homer = new Simpson("Homer");
        Simpson moe = new Simpson("Moe");

        characters.add(homer);
        characters.add(moe);

        Collections.sort(characters, (Comparator
                    .<Simpson>comparingInt(character1 -> character1.getName().length())
                    .<Simpson>thenComparingInt(character2 -> character2.getName().length())
        ));

        System.out.println(characters);
    }
}
