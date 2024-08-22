package com.mx.development.lesson09;

public class StringMethodsExample {
    public static void main(String[] args) {
        String hoy = "Hoy es Lunes 30 de Abril de 2024.";

        int length = hoy.length();
        System.out.println(length);
        System.out.println(hoy.isEmpty());

        System.out.println("".isBlank());
        System.out.println("-----------------------");
        for(int i=0; i<hoy.length(); i++){
            char caracter = hoy.charAt(i);
            System.out.print(caracter+"_");
        }
        System.out.println();
        char[]array = hoy.toCharArray();
        for(char c :array){
            System.out.print(c+",");
        }
        System.out.println();


        byte[]array2 = "Hola Mundo".getBytes();
        System.out.println(array2);
        System.out.println(hoy.getBytes());



        String info = "Juan Pablo,35,Masculino,Gerente,juanpa123@gmail.com";
        String[]columnas = info.split(",");
        for(String columna: columnas){
            System.out.println(columna);
        }
    }

}
