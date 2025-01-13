package com.codegym.lessons.module02.lesson04;

public abstract class Animal {
    abstract void respirar();
    void haceRuido(){}
}

abstract class Perro extends Animal{
    void respirar(){}
    abstract void ladrar();
    //abstract void respirar();
}

abstract class  PerroSalchicha extends Perro{
    //@Override void respirar() {}
    //public abstract void respirar();

}
