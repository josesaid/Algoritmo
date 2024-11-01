package com.mx.development.lesson21;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try {
            String linea1 = readFirstLineFromFile("//Users//josesaidolanogarcia//REPOSITORIOS//Algoritmllllo//archivo12.txt");
            System.out.println("linea1 :-->>> " + linea1 );
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            e.printStackTrace();
        }

    }

    static String readFirstLineFromFile(String path) throws IOException {
        try (FileReader fr = new FileReader(path);
             BufferedReader br = new BufferedReader(fr)) {
            return br.readLine();
        }catch(IOException ioException){
            System.err.println("Falló : " + ioException.getMessage());
        }
        return "Algo";
    }


}
