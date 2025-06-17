package com.example.pojos;

import java.util.HashMap;
import java.util.Map;

/**
 * @author josesaidolanogarcia
 */
public class Carrito {
    private Map<String, Integer> items;

    public Carrito() {
        items = new HashMap<>();
    }

    public void agregarItem(String item, int cantidad){
        items.put(item, cantidad);
    }
    public Map<String, Integer> getItems() {
        return items;
    }

}
