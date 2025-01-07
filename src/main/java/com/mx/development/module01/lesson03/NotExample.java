package com.mx.development.module01.lesson03;

public class NotExample {
    public static void main(String[] args) {
        boolean esMartes = false;

        //if no es martes:
        //if(esMartes == false){
        //if(esMartes != true){
        if(!esMartes){
            System.out.println("Hola, hoy NO es martes");
        }else{
            System.out.println("Hola, el día de hoy SI es martes, ¿cierto? " + esMartes);
        }
    }

}
