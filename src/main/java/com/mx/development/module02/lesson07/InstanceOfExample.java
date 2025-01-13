package com.codegym.lessons.module02.lesson07;

public class InstanceOfExample {
    public static void main(String[] args) {
        Object o = new Auto();
        if(o instanceof Auto){
            Auto a = (Auto)o;
            a.avanzarAdelante();
            a.avanzarAtras();
        }
        if(o instanceof Acelerable){
            Acelerable a = (Acelerable)o;
            a.avanzarAdelante();
            a.avanzarAtras();

            ((MotorEncendible)a).encenderMotor();   //"a" puede ser convertida a una interface "hermana" (MotorEncendible)
            // que también sea implementada por la clase base (Auto)

            ((MotorEncendible)o).encenderMotor();
            ((Pedaleable)o).pedalear(); //No se puede hacer "casting" porque o (es una instancia de Auto) no tiene
            //relación alguna con la clase bicicleta, ni mucho menos con la interface Pedaleable.
        }
        if(o instanceof MotorEncendible){
            System.out.println("o si es instancia de motor encendible");
            Auto a = (Auto)o;
        }



        //Bicicleta bicicleta = (Bicicleta)o;
        //bicicleta.pedalear();
    }

}
