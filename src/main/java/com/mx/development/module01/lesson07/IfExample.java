package com.mx.development.module01.lesson07;

public class IfExample {

    public static void main(String[] args) {
        int edadAngel = 30;
        String nombre = "Angel";
        String segundoNombre = "Jea PIERRE";

        if(nombre.equals("Angel")){
            System.out.println("Ángel ha sido encontrado");
            if(segundoNombre.equalsIgnoreCase("JEAN PIERRE")){
                System.out.println("Jean Pierre ha sido encontrado");
            }else{
                System.out.println("Jean Pierre NO fue encontrado, sin embargo en el segundo nombre encontramos a: " + segundoNombre );
            }
        }else
            System.out.println("Ángel NO ha sido encontrado, sin embargo hallamos a: " + nombre.toUpperCase() );

        if(edadAngel > 30) {
            System.out.println("La edad no es mayor que 30");
        }else { // edad de angel debe ser < o incluso igual a 30
            System.out.println("La edad es menor o incluso igual a 30");
        }
        System.out.println("El compilador terminó de evaluar el IF statement... Adiós...");
    }


}
