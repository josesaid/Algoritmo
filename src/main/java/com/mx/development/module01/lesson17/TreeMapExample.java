package com.mx.development.module01.lesson17;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> mapa = new TreeMap<>();
        mapa.put("D", 4);
        mapa.put("B", 2);
        mapa.put("C", 3);
        mapa.put("A", 1);
        mapa.put("E", 5);
        System.out.println(mapa);

        System.out.println("mapa.size(): " + mapa.size());
    }
}
