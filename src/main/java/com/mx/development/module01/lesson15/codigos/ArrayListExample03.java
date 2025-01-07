package com.mx.development.module01.lesson15.codigos;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ArrayListExample03 {
    public static void main(String[] args) {
        Map<String, Integer> mapa = new HashMap<>();
        mapa.put("C", 8);
        mapa.put("A", 5);
        mapa.put("E", 10);
        mapa.put("B", 3);
        mapa.put("D", 16);


        Set<Map.Entry<String, Integer>> items = mapa.entrySet();
        for(Map.Entry fila : items){
            System.out.println("Key: " + fila.getKey()+", valor: " + fila.getValue());
        }

    }
}
