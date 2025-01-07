package com.mx.development.module01.lesson23;

import java.io.FileWriter;
import java.io.IOException;

public class WriterExample {
    public static void main(String[] args) {
        String filename = "output.txt";
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(filename) ;
            fileWriter.write("1 - Hoy es Lunes 21 de Octubre del 2024.\n");
            fileWriter.write("2 - Hoy es Lunes 21 de Octubre del 2024.\n");
            fileWriter.write("3 - Hoy es Lunes 21 de Octubre del 2024.\n");
            fileWriter.write("4 - Hoy es Lunes 21 de Octubre del 2024.");
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Adiós...");
    }

}
