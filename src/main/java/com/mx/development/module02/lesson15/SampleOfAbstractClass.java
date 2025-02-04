package com.mx.development.module02.lesson15;

public class SampleOfAbstractClass {
    public static void main(String[] args) {
        //No se puede instanciar a una clase abstracta
        //AbstractClass01 instancia = new AbstractClass01();
        SubClass01 instancia = new SubClass01();
    }
}

abstract class AbstractClass01 {
    abstract void abstractMethod();
}
class SubClass01 extends AbstractClass01 {

    @Override
    void abstractMethod() {
        System.out.println("SubClass01");
    }
}
