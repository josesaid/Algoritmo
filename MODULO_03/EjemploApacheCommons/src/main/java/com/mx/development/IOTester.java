package com.mx.development;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.commons.io.IOUtils;

/**
 * @author josesaidolanogarcia
 */
public class IOTester {

    private static final String FILE = "/Users/josesaidolanogarcia/REPOSITORIOS/Algoritmo/MODULO_03/EjemploApacheCommons/input.txt";

    public static void main(String[] args) {
        try{
            //Using BufferedReader
            readUsingTraditionalWay();

            System.out.println("-------------");
            //Using IOUtils
            readUsingIOUtils();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }

    //reading a file using buffered reader line by line
    public static void readUsingTraditionalWay() throws IOException{
        try (BufferedReader bufferReader = new BufferedReader(new InputStreamReader(new FileInputStream(FILE) ))) {
            String line;
            while ( ( line = bufferReader.readLine() ) != null ) {
                System.out.println( line );
            }
        }
    }

    //reading a file using IOUtils in one go
    public static void readUsingIOUtils() throws IOException {
        try(InputStream in = new FileInputStream(FILE)){
            System.out.println( IOUtils.toString( in , "UTF-8") );
        }
    }
}