package com.mx.development.module01.lesson15.codigos;

import java.util.ArrayList;
import java.util.List;
public class ArrayListExample02 {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();

        nombres.add("Jecina");
        nombres.add("Osvaldo");
        nombres.add("Andrea");

        nombres.add("Juan");
        nombres.add("Said");
        nombres.add("Jhonatan");
        nombres.add("Laura");

        nombres.set(3, "Matias");
        System.out.println(nombres.size());
        System.out.println(nombres);

        System.out.println("-----------------------------");

        String nombreEliminado = nombres.remove(5);
        System.out.println("nombreEliminado: " + nombreEliminado);

        //String s = nombres.get(nombres.size()-1);
        //System.out.println("s: " + s);
        System.out.println(nombres);
        System.out.println(nombres.size());

        System.out.println("-----------------------------");
        boolean andreaEliminada = nombres.remove("Andrea");
        System.out.println("¿Andrea fue correctamente eliminada de la lista? " + andreaEliminada );
        System.out.println(nombres);
        System.out.println(nombres.size());

        boolean albertPresente = nombres.contains("Albert");
        System.out.println("albertPresente: " + albertPresente);

        boolean matiasPresente = nombres.contains("Matias");
        System.out.println("matiasPresente: " + matiasPresente);

        System.out.println("La lista está vacía? " + nombres.isEmpty());

        System.out.println("--------------------------------");

        nombres.clear();

        System.out.println(nombres);
        System.out.println(nombres.size());


        String[] nombresArray = nombres.toArray(new String[nombres.size()]);
        for(String nombre : nombresArray){
            System.out.println("nombre: " + nombre);
        }
    }

}
