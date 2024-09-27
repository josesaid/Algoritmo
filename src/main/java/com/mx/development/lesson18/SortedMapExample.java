package com.mx.development.lesson18;

import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapExample {
    public static void main(String[] args) {
        SortedMap<String, String> mapaOrdenado = new TreeMap<>();
        mapaOrdenado.put("D", "DDD");
        mapaOrdenado.put("C", "CCC");
        mapaOrdenado.put("B", "BBB");
        mapaOrdenado.put("A", "AAA");

        Set<Map.Entry<String, String>> filas = mapaOrdenado.entrySet();
        for(Map.Entry/*<String, String>*/ fila : filas){
            System.out.println("Key: " + fila.getKey()+", valor: " + fila.getValue());
        }
    }

}
