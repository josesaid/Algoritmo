package com.mx.development.module01.lesson13;
public class OuterClass {



    void metodoInstancia(){
        System.out.println("innerMethod");
        InnerStaticClass reference =  new InnerStaticClass();
        reference.innerStaticMethod();
        System.out.println("texto: " + InnerStaticClass.DB);
        InnerStaticClass.metodoEstatico(); //Excepción a la regla.
    }
    class InnerClass{
        void innerMethod(){
            System.out.println("innerMethod");
            InnerStaticClass reference =  new InnerStaticClass();
            reference.innerStaticMethod();
            System.out.println("texto: " + InnerStaticClass.DB);
            InnerStaticClass.metodoEstatico(); //Excepción a la regla.
        }
    }
    static class InnerStaticClass{
        private static String DB = "jdbc:oracle://localhost:8080/saidDB_PROD/abcd";
        void innerStaticMethod(){
            System.out.println("innerStaticMethod");
        }
        static void metodoEstatico(){
            System.out.println("metodoEstatico");
        }
    }
    public static void main(String[] args) {
        InnerClass innerClass = new OuterClass().new InnerClass();
        innerClass.innerMethod();

        //System.out.println("texto: " + InnerStaticClass.DB);

        OuterClass outerInstance = new OuterClass();
        outerInstance.metodoInstancia();

        InnerStaticClass innerInstance = new InnerStaticClass();
        innerInstance.innerStaticMethod();

    }

    //IoC - Principle
    //Dependency Injection - Design pattern
}
