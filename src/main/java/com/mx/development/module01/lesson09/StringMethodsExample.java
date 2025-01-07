package com.mx.development.module01.lesson09;

public class StringMethodsExample {
    public static void main(String[] args) {
        String hoy = "Hoy es Jueves 22 de Agosto de 2024";

        int length = hoy.length();
        System.out.println(length);
        System.out.println(hoy.isEmpty());

        System.out.println("  ".isBlank()); // ¿espacios en blanco?
        System.out.println("-----------------------");

        for(int i=0; i<hoy.length(); i++){
            char caracter = hoy.charAt(i);
            System.out.print(caracter+",");
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%");
        System.out.println();
        char[]array = hoy.toCharArray();
        for(char item :array){
            System.out.print(item+",");
        }

        System.out.println();
        System.out.println("??????????????????????");


        byte [] array2 = "Hola Mundo".getBytes();
        System.out.println(array2);
        System.out.println(hoy.getBytes());

        System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");

        String info = "Juan Pablo,35,Masculino,Gerente,juanpa123@gmail.com";
        String[]columnas = info.split(",");
        int contador = 1;
        for(String columna : columnas ){
            System.out.println(columna);
            contador++;
        }
        System.out.println("Se encontraron: " + contador + " columnas.");
    }

}
