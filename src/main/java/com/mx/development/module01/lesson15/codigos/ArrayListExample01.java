package com.mx.development.module01.lesson15.codigos;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample01 {
    public static void main(String[] args) {
        List lista = new ArrayList();
        Gato g = new Gato();
        lista.add(g);
        Conejo c = new Conejo();
        lista.add(c);
        lista.add(new Jirafa());
        lista.add(new Avion());
        System.out.println(lista);

        System.out.println("------------------------------------");

        List<Avion> avionesLista = new ArrayList<>();

        Avion f18 = new Avion();
        avionesLista.add(f18);
        avionesLista.add(new Avion());
        avionesLista.add(new Avion());

        System.out.println(avionesLista);

    }

}



