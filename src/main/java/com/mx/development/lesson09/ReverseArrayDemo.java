package com.mx.development.lesson09;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReverseArrayDemo {
    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 4, 9, 16, 25};
        System.out.println("Array before reverse : " + Arrays.toString(array));

        List<Integer> list = new ArrayList<>(Arrays.asList(array));
        reverse(list);
        System.out.println("Array after reverse : " + Arrays.toString(list.toArray()));
    }

    public static void reverse(List<Integer> list) {
        //1,4,9,16,25
        if (list== null || list.size() <= 1) {
            System.out.println("Aquí ya termiinó la recursión - " + list);
            return;
        }
        Integer value = list.remove(0);
        reverse(list);

        // Una vez terminada la recursión... solo hay 1 elemento en la lista(25)
        // +16, +9, +4, +1
        list.add(value);
        System.out.println(list);
    }

}
