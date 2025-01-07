package com.mx.development.module01.lesson12;

import java.util.ArrayList;
import java.util.List;

public class Constructores {
    public static void main(String[] args) {
        Empleado hugo = new Empleado();
        hugo.setNombre("Hugo Osorio");
        hugo.setEmail("jugo.osorio@codegym.com.co");
        hugo.setSalarioEnDolares(5_001.0f);
        System.out.println("-------");
        //int longitudTexto = hugo.getNombre().length();
        //System.out.println(longitudTexto);

        Empleado yolanda = new Empleado("Yolanda Treviño");
        yolanda.setEmail("yolanda.treviño@codegym.com.mx");
        yolanda.setSalarioEnDolares(5_002.0f);
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");

        Empleado albert = new Empleado("Albert Morales", "albert.morales@codegym.com.mx");
        albert.setSalarioEnDolares(5_003.0f);
        System.out.println("////////////////////////////////////////////");

        Empleado manuel = new Empleado("Manuel Toledo", "manuel.toledo@codegym.com.mx", 5_000.0f);
        System.out.println("......................................");

        Empleado johnSmith = new Empleado("John Smith", "john.smith@codegym.com.us");
        System.out.println("«««««««««««««««««««««««««««««««««««««««««««««««««");

        Empleado[]empleados = new Empleado[5];
        empleados[0] = hugo;
        empleados[1] = yolanda;
        empleados[2] = albert;
        empleados[3] =manuel;
        empleados[4] =johnSmith;

        for(Empleado e : empleados){
            System.out.println("El nombre del empleado(a) es: " + e.getNombre() );
            System.out.println("El email del empleado(a) es: " + e.getEmail() );
            System.out.println("El salario del empleado(a) es: " + e.getSalarioEnDolares() );
            System.out.println("El lider del empleado(a) es: " + e.getLider() );
            System.out.println("--------------------------");
        }


        Empleado sieteMilDolares_empleado01 = new Empleado(5_000.0f);
        Empleado sieteMilDolares_empleado02 = new Empleado(6_000.0f);
        Empleado sieteMilDolares_empleado03 = new Empleado(7_000.0f);
        Empleado sieteMilDolares_empleado04 = new Empleado(8_000.0f);
        Empleado sieteMilDolares_empleado05 = new Empleado(4_000.0f);

        //Java Collections Framework
        List<Empleado> empleadosLista = new ArrayList<>();
        empleadosLista.add(sieteMilDolares_empleado01);
        empleadosLista.add(sieteMilDolares_empleado02);
        empleadosLista.add(sieteMilDolares_empleado03);
        empleadosLista.add(sieteMilDolares_empleado04);
        empleadosLista.add(sieteMilDolares_empleado05);

        for(Empleado empleado : empleadosLista){
            System.out.println(empleado.toString());
        }


        boolean resultado = manuel.equals(johnSmith);
        System.out.println("resultado de la comparación de salarios: " + resultado );

        resultado = johnSmith.equals( new Empleado(6000.0f));
        System.out.println("resultado de la comparación de salarios: " + resultado );

        Empleado e1 = new Empleado("Juan");
        Empleado e2 = new Empleado("Luis");
        Empleado e3 = new Empleado("Omar");

    }

}
