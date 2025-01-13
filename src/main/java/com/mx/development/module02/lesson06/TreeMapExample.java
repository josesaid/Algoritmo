package com.codegym.lessons.module02.lesson06;

import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Stream;

public class TreeMapExample {
    public static void main(String... barney) {
        Map<Simpson, String> simpsonsCharacters = new TreeMap<>();
        simpsonsCharacters.put(new Simpson("Moe"), "shotgun");
        simpsonsCharacters.put(new Simpson("Lenny"), "Carl");
        simpsonsCharacters.put(new Simpson("Homer"), "television");
        simpsonsCharacters.put(new Simpson("Barney"), "beer");

        //System.out.println(simpsonsCharacters);

        Stream.of(simpsonsCharacters).forEach(System.out::println);

    }

}
