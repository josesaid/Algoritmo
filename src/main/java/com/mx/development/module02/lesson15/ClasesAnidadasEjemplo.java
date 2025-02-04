package com.mx.development.module02.lesson15;

import lombok.Data;

public class ClasesAnidadasEjemplo {
    public static void main(String[] args) {
        //Persona daleyma = new Persona();
        //Persona.Datos datosDaleyma = daleyma.new Datos();

        Persona.Datos datosDaleyma = new Persona().new Datos();

        datosDaleyma.setNombre("Daleyma");
        datosDaleyma.setApellidoPaterno("Quispe");
        datosDaleyma.setApellidoMaterno("Calle");
        System.out.println(datosDaleyma);

        Persona.Datos.Direccion daleymaDireccion = datosDaleyma.new Direccion();
        daleymaDireccion.setCalle("Calle abc");
        daleymaDireccion.setNumero("123");
        daleymaDireccion.setColonia("Colonia prados de alguna referencia X");
        System.out.println(daleymaDireccion);

        //------------
        Persona.Familia daleymaFamilia = new Persona.Familia();
        daleymaFamilia.setNombrePapa("David");
        daleymaFamilia.setNombreMama("Leonor");
        System.out.println(daleymaFamilia);
    }
}

class Persona {

    @Data static class Familia{
        String nombrePapa;
        String nombreMama;
    }

    @Data class Datos {
        String nombre;
        String apellidoPaterno;
        String apellidoMaterno;

        @Data class Direccion{
            String calle;
            String numero;
            String colonia;
        }
    }
}