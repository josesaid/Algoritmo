package com.mx.development.module01.lesson24;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample01 {
    public static void main(String[] args) {

        // Create an array of bytes
        //byte[] array = { 1, 2, 3, 4 , 5, 6};
        byte[] texto = "ABCDEF".getBytes();

        char a = 'A';
        int numero = a;
        System.out.println("-> " +  numero);

            //ByteArrayInputStream input = new ByteArrayInputStream(array);
        ByteArrayInputStream input = new ByteArrayInputStream(texto);

            // Using the skip() method
            input.skip(2);
            System.out.print("Input stream after skipping 2 bytes: ");

            int data = input.read();
            while (data != -1) {
                System.out.print(data + ", ");
                data = input.read();
            }
            // close() method
        try {
            input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
