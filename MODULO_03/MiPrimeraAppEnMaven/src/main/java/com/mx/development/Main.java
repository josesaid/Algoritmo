package com.mx.development;

import org.apache.commons.io.FilenameUtils;

public class Main {

    public static void main(String[] args) {
        String archivo  = "imagen.jpg";
        String extension = FilenameUtils.getExtension(archivo);
        System.out.println(extension);
    }

}