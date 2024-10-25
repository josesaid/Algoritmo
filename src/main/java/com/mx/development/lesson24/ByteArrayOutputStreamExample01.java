package com.mx.development.lesson24;

import java.io.*;

public class ByteArrayOutputStreamExample01 {
    public static void main(String[] args) {
        FileOutputStream fout1= null;
        try {
            fout1 = new FileOutputStream("/Users/josesaidolanogarcia/DeleteMe/file01.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        FileOutputStream fout2= null;
        try {
            fout2 = new FileOutputStream("/Users/josesaidolanogarcia/DeleteMe/file02.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        FileInputStream fis = null;
        ByteArrayOutputStream bout =new ByteArrayOutputStream();
        bout.write(65);
        try {
            bout.writeTo(fout1);
            bout.writeTo(fout2);

            bout.flush();
            bout.close();//has no effect
            System.out.println("Success...");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
