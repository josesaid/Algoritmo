package com.mx.development.lesson11;

public class EncapsulationExample {
    public static void main(String[] args) {
        //Esto es lo que SI se debe hacer (Uso de getters y setters)
        Persona p = new Persona() {
            @Override
            public void respirar() {
                System.out.println("Persona respirando");
            }
        };
        p.setNombre("Juanito");
        System.out.println(p.getNombre());

        //Esto es lo que NO se debe hacer
        Personita p1 = new Personita();
        p1.nombre = "Juanote";
        System.out.println(p1.nombre);
    }

}

class Personita{
    String nombre;
}