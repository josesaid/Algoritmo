package com.mx.development.module01.lesson17;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsExample {
    public static void main(String[] args) {

            // creating object of List<String>
            List<String> arrlist = new ArrayList<String>();

            // Adding element to arrlist
            arrlist.add("A");
            arrlist.add("B");
            arrlist.add("C");
            arrlist.add("Tajmahal");

            // printing the arrlist before operation
            System.out.println("arrlist before operation : " + arrlist);

            // add the specified element to specified Collections
            // using addAll() method
            boolean b = Collections.addAll(arrlist, "1", "2", "3", "said");

            // printing the arrlist after operation
            System.out.println("result : " + b);

            // printing the arrlist after operation
            System.out.println("arrlist after operation : " + arrlist);

            Collections.fill(arrlist, "gato");
            System.out.println("resultado: " + arrlist);

        }

}
