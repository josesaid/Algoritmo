package com.codegym.lessons.module02.lesson02;


public class FabricaAutos {
    public Auto fabricarAuto(String nombre){
        Auto a = new Auto();
        if(nombre.equals("ford"))
            a = new AutoFord();
        else
            if(nombre.equals("chevrolet"))
                a = new AutoChevrolet();
        return a;
    }
}
class Auto{
    public void sonarClaxon() {
        System.out.println(getClass().getName());
    }
}
class AutoFord extends Auto{
    public void sonarClaxon() {
    System.out.println(getClass().getName());
    }
}
class AutoChevrolet extends Auto{
    public void sonarClaxon() {
        System.out.println(getClass().getName());
    }
}