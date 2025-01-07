package com.mx.development.module01.lesson25;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;


public class FilesExample {

    public static void main(String[] args) throws IOException {
        createMyOwnFile(Path.of("/users/josesaidolanogarcia/JavaDesdeCeroSaidVersion1.txt"));
        createMyCustomDirectory(Path.of("/users/josesaidolanogarcia/newFolder123456"));
    }

    private static void createMyCustomDirectory(Path directoryPath) {
        System.out.println("Beginning method: createMyCustomDirectory");
        Path directoryCreatedPath = null;
        try {
            directoryCreatedPath = Files.createDirectory(directoryPath);
            System.out.println("directoryCreatedPath: " + directoryCreatedPath);
        } catch (Throwable e) {
            System.err.println("El directorio no se creó está ocasión, porque ya existía...: ");
        }
        System.out.println("Finishing method: createMyCustomDirectory");
    }

    private static void createMyOwnFile(Path path) {
        System.out.println("Beginning method: createMyOwnFile");
        Path createdFilePath = null;
        try {
            if (!path.toAbsolutePath().getFileName().toFile().exists()) {
                createdFilePath = Files.createFile(path);
                System.out.println("File Created at Path : " + createdFilePath);
            } else {
                System.out.println("el archivo ya existe y no se debería crear...");
            }
        } catch (IOException e) {
            System.out.println("el archivo no se creó está ocasión, porque ya existía...: ");
        } catch (Throwable e) {
            System.out.println("Error en: " + e.getMessage());
        }
        System.out.println("Finishing method: createMyOwnFile");
    }

}
