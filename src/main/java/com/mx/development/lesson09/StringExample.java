package com.mx.development.lesson09;

public class StringExample {
    public static void main(String[] args) {
        String a = "El carro de mi amigo es muy comodo.";
        String b = "El carro de mi amigo es muy comodo.";

        if(a.equals(b)){
            System.out.println("cadenas iguales");
        }else{
            System.out.println("cadenas diferentes");
        }

        System.out.println(a.equalsIgnoreCase(b)?"mismo contenido":"diferente contenido");

    }

}
