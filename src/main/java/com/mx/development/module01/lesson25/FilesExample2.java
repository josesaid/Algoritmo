package com.mx.development.module01.lesson25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class FilesExample2 {
    public static void main(String[] args) throws IOException {

        LocalDateTime diaConFecha = LocalDateTime.of(2030, 05, 05, 3, 33);
        System.out.println("diaConFecha 1: " + diaConFecha);
        diaConFecha = diaConFecha.plusYears(1).plusDays(-2).minusMonths(-1);
        System.out.println("diaConFecha 2: " + diaConFecha);

        //initialize Path object
        LocalDateTime time = LocalDateTime.now();
        System.out.println("year: " + time.getYear());
        System.out.println("month: " + time.getMonth());
        System.out.println("day: " + time.getDayOfMonth());

        LocalDate hoy = LocalDate.now()
                .plusDays(1)
                //.plusMonths(1)
                .plusYears(1);
        //obtener el caracter separador de cada SO. / \

        //C:\HomeReact
        String pathWindows = "C:\\HomeReact\\";
        String pathMac = "/users/josesaidolanogarcia/newFolder1234/";
        String archivo = "said.txt";


        //Path directorioConFechaHoy = Paths.get(pathWindows + hoy );
        //Path directorioConFechaHoy = Paths.get(pathWindows + hoy );
        Path directorioConFechaHoy2 = Path.of(pathWindows + hoy );
        Path directoryPath = Paths.get(pathMac + time.toString());


        //create file
        try {
            Path path1 = Files.createDirectories(directorioConFechaHoy2);
            System.out.println(">>" + path1.getFileName());
            Path createdFilePath = Files.createDirectories(directoryPath);
            System.out.println("created: " + directoryPath.toString());
            System.out.println(directoryPath + " - Is directory? " + Files.isDirectory(createdFilePath));

            //Files.delete(directoryPath);
            //System.out.println("deleted: " + directoryPath.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
