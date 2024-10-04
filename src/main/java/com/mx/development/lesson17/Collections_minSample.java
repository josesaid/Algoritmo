package com.mx.development.lesson17;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Collections_minSample {
    public static void main(String[] args) {
        // create link list object
        List<Integer> list = new LinkedList<Integer>();

        // populate the list
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);

        // printing the List
        System.out.println("List: " + list);

        // getting minimum value
        // using min() method
        int min = Collections.min(list);
        int max  = Collections.max(list);

        // printing the min value
        System.out.println("Minimum value is: " + min);

        System.out.println("Max value is: " + max);

        Collections.reverse(list);
        System.out.println(list);

        Collections.reverse(list);

        System.out.println("--> " + list);
        Collections.rotate(list, -1);
        System.out.println("r: " + list);
    }

}
