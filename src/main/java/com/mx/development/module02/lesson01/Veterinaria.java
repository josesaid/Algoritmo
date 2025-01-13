package com.codegym.lessons.module02.lesson01;

public class Veterinaria {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.comer();
        Animal p = new Perro("blanco", "firulais", "10kg", "chihuahueño");
        p.comer(); //VMI - Virtual method invocation
        if(p instanceof Perro) {
            Perro p1 = (Perro) p;
            p1.ladrar();
        }
        Animal c= new Colibri("Amarillo", "pajarillo", "500gr", "comun");
        c.comer();
        ICantar cantarInstancia = (ICantar) c;
        cantarInstancia.cantar();

        Animal mutacion = new Perro("Morocho", "Perro_Resident_Evil", "100kg", "mutante");
        ILadrar iLadrarInstancia = (ILadrar)mutacion;
        iLadrarInstancia.ladrar();

        ICantar icantarInstancia2 = (ICantar)iLadrarInstancia;
        icantarInstancia2.cantar();

        if (icantarInstancia2 instanceof Perro){
            System.out.println("---------------------");
            Perro p3 = (Perro)icantarInstancia2;
            p3.comer();
            p3.ladrar();
            p3.cantar();
        }

        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%");
        procesaAnimales(a);
        procesaAnimales(p);
        procesaAnimales(c);
        procesaAnimales(mutacion);
    }


    static void procesaAnimales(Animal animalito){
        System.out.println(animalito.toString());
    }
}
