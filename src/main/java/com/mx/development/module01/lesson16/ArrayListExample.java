package com.mx.development.module01.lesson16;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Auto> autos = new ArrayList<>();
        autos.add(new Auto("Ford"));
        autos.add(new Auto("Chevrolet"));
        autos.add(new Auto("BMW"));
        //autos.add(new Auto("AUDI"));
        Auto audi = new Auto("audi");
        autos.add(audi);
        autos.add(new Auto("VW"));

        for (Auto a : autos){
            System.out.println(a.getNombre());
        }

        System.out.println("--------------------------->>>>>>>");
        System.out.println(autos);
        System.out.println("Audi esta en la estructura de datos (Lista)? : " + autos.contains(audi) );
        if(autos.contains(audi)){
            autos.remove(audi);
            System.out.println("El auto Audi, ha sido eliminado de la lista.");
            System.out.println("Ahora la lista tiene: " + autos.size() + " autos.");
        }
        System.out.println(autos);

        System.out.println("Vaciando la lista: " + autos);
        autos.clear();
        System.out.println("Vacia la lista, tenemos: "  + autos);
    }

}

@Data
class Auto{
    private String nombre;
    Auto(String nombre){
        setNombre(nombre);
    }
}