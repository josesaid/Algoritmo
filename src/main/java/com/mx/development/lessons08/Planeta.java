package com.mx.development.lessons08;

public class Planeta {

    //Encapsulamiento, Herencia, polimorfismo, sobrecarga, sobreescritura
    public static void main(String[] args) throws Exception {
        Persona karol = new Persona();

        //Este tipo de asignaciones usa correctamente el encapsulamiento
        karol.setNombre("Karol");
        karol.setEdad(20);
        //karol.email = "karol.lozada@codegym.com.uk";
        karol.setEmail("karol.lozada@codegym.com.uk");

        Persona said = new Persona();
        said.setNombre("Said");
        said.setEdad(-10);


        said.setEmail("said.olano@xyz.com.uk");

        String nombreKarol = karol.getNombre();
        System.out.println(nombreKarol.toUpperCase());
        System.out.println("La edad del objeto Karol es: " + karol.getEdad() );
    }

}
