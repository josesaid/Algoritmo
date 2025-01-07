package com.mx.development.module01.lesson11;

class A extends Object{}
class B extends A{}
class C extends B{}
class D extends C{}
public class Polimorfismo {

    //JVM - Java Virtual Methods - Usa el polimorfismo
    public static void main(String[] args) {

        //No funciona porque no sigue las leyes de la herencia de Java
        //A a1 = new A();
        //C c1 = (C)a1;

        //C c1 = new C();
        //A a1 = c1;

        //La linea anterior es exactamente lo mismo que esto:
        C c1 = new D();

        System.out.println("Creo que ya la libramos...");

        /*Instructor said = new Instructor();
        said.setNombre("Jose Said");
        said.saludar();
        said.impartirAsesoria();
         */

        InstructorKinder said = new InstructorKinder();
        said.impartirAsesoria();
        said.hablar();
        said.setNombre("Said Olano");
        said.respirar();
        said.saludar();

        //said es una instancia de la subclase InstructorKinder, pero en la siguiente linea,
        //lo estoy guardando como una instancia de la superclase (polimorfismo).
        Object o = said;

        //Persona jose = said;
        Instructor jose = said;
        jose.saludar();
        jose.hablar();
        jose.setNombre("Jose Said");
        jose.impartirAsesoria();
        jose.respirar();


        System.out.println("--------");

        Participante hugo = new Participante();
        hugo.setNombre("Hugo");
        hugo.recibeAsesoria();
        hugo.saludar();
        hugo.hablar();

        /*
        saludarSoloPersonas(said);
        saludarSoloPersonas(hugo);

        //corregir lo siguiente:
        //SerHumano ser = new SerHumano();
        SerHumano ser = new Participante();
        respirarAireContaminado(ser);
*/
    }

    static void saludarSoloPersonas(Persona persona){
        persona.saludar(); //VMI - Invocacion de metodos virtuales
    }

    static void respirarAireContaminado(SerHumano humano){
        humano.respirar();
    }

}
