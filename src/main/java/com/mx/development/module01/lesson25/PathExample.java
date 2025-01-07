package com.mx.development.module01.lesson25;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class PathExample {
    static private final String ARCHIVO = "/Users/josesaidolanogarcia/2024-10-28/lunes28.txt";

    public static void main(String[] args) {
        System.out.println("LocalDate.now(): " +  LocalDate.now());

        Path path = Paths.get(ARCHIVO);
        System.out.println(path.getParent());
        System.out.println(path.getFileName());
        System.out.println(path.getRoot());
        System.out.println(path.normalize());
        System.out.println(path.toAbsolutePath());

        Path path1 = Paths.get("/users/DeleteMe/file01/algoMas/x");
        Path path2 = Path.of("/users/DeleteMe/file02");
        Path folder = Path.of("/users/DeleteMe/folder");

        System.out.println("5 >>" + path1.getNameCount());
        try{
            System.out.println("file02 = index[2]: " + path2.getName(3));
        }catch(IllegalArgumentException iae){
            //System.err.println(iae.getMessage());
            System.out.println("Error detectado y correctamente manejado....");
        }
        System.out.println("FOLDER: " + folder.toFile().isDirectory());

        System.out.println(folder.toAbsolutePath());

    }

}
