package com.mx.development.module01.lesson24;

import java.io.*;

public class Polimorfismo {

    public static void main(String[] args) throws IOException {
        Vehiculo v = new Barco("Rojo");
        if(v instanceof Barco){
            Barco b = (Barco)v;
            b.navegarEnElMar();
        }

        InputStream inputStream01 = System.in;
        BufferedInputStream bis1 = new BufferedInputStream(inputStream01);


        /*byte[]byteArray = "SAID".getBytes();
        InputStream inputStream02 = new ByteArrayInputStream(byteArray);
        BufferedInputStream bis2 = new BufferedInputStream(inputStream02);
        */

        String path = "/Users/josesaidolanogarcia/DeleteMe/file01.txt";
        File file = new File(path);
        FileInputStream fileInputStream03 = new FileInputStream(file);
        BufferedInputStream bis23 = new BufferedInputStream(fileInputStream03);
        byte[]allBytes = bis23.readAllBytes();

        String output = new String(allBytes);
        System.out.println(output.toUpperCase());

        System.out.println("Escribe una linea de texto");
        String linea = new BufferedReader(new InputStreamReader(System.in)).readLine();

        System.out.println("->" + linea);
        String archivo = "/Users/josesaidolanogarcia/DeleteMe/salida.tony";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(archivo));
        bos.write(linea.getBytes());
        bos.flush();
        bos.close();
        System.out.println("Adios");
    }

}
