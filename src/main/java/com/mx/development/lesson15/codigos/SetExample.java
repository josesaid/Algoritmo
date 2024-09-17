package com.mx.development.lesson15.codigos;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {
        Set<String> letras = new TreeSet<>();
        System.out.println(letras.add("C"));
        System.out.println(letras.add("A"));
        System.out.println(letras.add("E"));
        System.out.println(letras.add("B"));
        System.out.println(letras.add("D"));
        System.out.println(letras.add("A"));
        System.out.println(letras);
    }

}
