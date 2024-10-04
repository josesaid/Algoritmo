package com.mx.development.lesson20;

import java.io.*;
public class ExceptionExample02 {
    public static void main(String[] args) {
        try{
            leeArchivo("archivo12.txt");
        }catch (Exception e){
            System.err.println("Hubo un error en la app: "+ e.getMessage());
        }finally{
            System.out.println("Bloque finally ejecutado");
            metodoNormal();
        }

    }

    private static void metodoNormal() {

    }

    public static void leeArchivo(String nombreArchivo) throws Exception{
        String linea = null;
        try {
            File f = null;
            f = new File(nombreArchivo);
            System.out.println("--->" + f.getAbsolutePath());
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            linea = br.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = br.readLine();
            }
            System.out.println("End_Of_File");
        } catch (Exception e) {
            if (linea==null)
                throw new Exception("Algo falló en la lectura del archivo:  " + nombreArchivo);
            else
                throw new NullPointerException("Algo falló en la lectura del archivo:  " + nombreArchivo);
        }
    }

}
