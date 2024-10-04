package com.mx.development.lesson16;

import com.mx.development.lesson02.Memoria;
import com.mx.development.lesson15.lista.nomina.empresa.Empleado;
import com.mx.development.lesson08.Calculadora;
import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set elementos = new HashSet();

        Empleado e1 = new Empleado();
        Memoria m1 = new Memoria();

        elementos.add(e1);
        elementos.add(m1);

        System.out.println(elementos.size());

        System.out.println("----------------");

        Set<Calculadora> calculadorasSet = new HashSet<>();
        System.out.println("Pudo insertar una calculadora en la estructura llamada calculadoraSet???: "
                + calculadorasSet.add(new Calculadora()));
        System.out.println("Pudo insertar una calculadora en la estructura llamada calculadoraSet???: "
                + calculadorasSet.add(new Calculadora()));
        System.out.println("Pudo insertar una calculadora en la estructura llamada calculadoraSet???: "
                + calculadorasSet.add(new Calculadora()));

        System.out.println("---------------");

        Set<Integer> numeros = new HashSet<>();
        System.out.println("pudo insertar?: " + numeros.add(Integer.valueOf(10)));
        System.out.println("pudo insertar?: " + numeros.add(Integer.valueOf(10)));
        System.out.println("pudo insertar?: " + numeros.add(Integer.valueOf(10)));

    }

}
