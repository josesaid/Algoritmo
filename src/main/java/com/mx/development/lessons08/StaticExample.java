package com.mx.development.lessons08;

public class StaticExample {

    public static void main(String[] args) {
        ClaseConMetodoEstatico.setNombreInstructor("Angel");
        ClaseConMetodoEstatico instancia = new ClaseConMetodoEstatico();
        instancia.metodo1(); //Método de instancia (No llevan static - Es decir cada instancia ejecuta el método directamente)
        String instructor = ClaseConMetodoEstatico.getNombreInstructor(); //Método de clase - Porque pertenece a la clase que lo define (static)
        System.out.println(instructor );


        ClaseConMetodoEstatico.setNombreInstructor("Pedro");
        ClaseConMetodoEstatico instancia2 = new ClaseConMetodoEstatico();
        instancia2.metodo1();
        instructor = ClaseConMetodoEstatico.getNombreInstructor(); //Método de clase - Porque pertenece a la clase que lo define (static)
        System.out.println(instructor );


        ClaseConMetodoEstatico.setNombreInstructor("Said");
        ClaseConMetodoEstatico instancia3 = new ClaseConMetodoEstatico();
        instancia3.metodo1();

        instructor = ClaseConMetodoEstatico.getNombreInstructor(); //Método de clase - Porque pertenece a la clase que lo define (static)
        System.out.println(instructor );
    }

}
