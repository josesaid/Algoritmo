package com.mx.development.module02.lesson15;

import java.io.IOException;
import java.io.InputStream;
import java.util.AbstractList;

public class EjemplosClasesInternasJDK {

    public static void main(String[] args) {
        AbstractList instance = new AbstractList() {
            @Override
            public Object get(int index) {
                return new Object();
            }

            @Override
            public int size() {
                return 0;
            }
        };
        Object o = instance.get(1);

        //-----------

        Integer integer = Integer.valueOf(1);

        //-----------

        InputStream is = new InputStream(){
            @Override
            public int read() throws IOException {
                return 0;
            }
        };

        try {
            int zero = is.read();
            System.out.println("zero = " + zero);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
