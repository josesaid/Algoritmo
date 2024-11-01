package com.mx.development.lesson25;

import java.io.File;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryStreamExample {
    public static void main(String[] args) throws IOException {

        //Path path = Path.of("/Users/josesaidolanogarcia/");
        Path path = Path.of("C:\\Program Files\\");

        try (DirectoryStream<Path> files = Files.newDirectoryStream(path)) {
            for (Path ruta : files) {
                System.out.println("ruta: " + ruta.getFileName());
                File f = ruta.toAbsolutePath().toFile();
                System.out.println(f.isDirectory()?"directory: "+ f.getName():"File: " + f.getName());
            }
        }
    }

}
