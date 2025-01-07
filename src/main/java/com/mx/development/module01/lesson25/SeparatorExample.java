package com.mx.development.module01.lesson25;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;

public class SeparatorExample {
    public static void main(String[] args) {
        char fileSeparatorChar = File.separatorChar;

        System.out.println("fileSeparatorChar: " +fileSeparatorChar);
        LocalDate hoy = LocalDate.now();
        Path directorioDinamico = Paths.get(fileSeparatorChar + "Users"+fileSeparatorChar+"josesaidolanogarcia"+fileSeparatorChar+hoy );
        try {
            Files.createDirectories(directorioDinamico);
            System.out.println("Directorio creado en: " + directorioDinamico);
        } catch (IOException e) {
            System.out.println("Hubo problemas...");
        }
        System.out.println("directorio creado");
    }

}
