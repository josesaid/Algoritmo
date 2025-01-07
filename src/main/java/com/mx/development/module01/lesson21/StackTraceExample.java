package com.mx.development.module01.lesson21;

public class StackTraceExample {
    public static void main(String[] args)   {
        StackTraceExample instancia = new StackTraceExample();
        try {
            instancia.a();
        } catch (Exception e) {
            e.printStackTrace();
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for(StackTraceElement ste : stackTraceElements){
                System.out.println("Linea erronea: " + ste.getLineNumber() );
                System.out.println("Metodo con fallo: " + ste.getMethodName() );
            }
            String errorMessage = e.getMessage();
            if(errorMessage.equalsIgnoreCase("ORA-12345")) {
                System.err.println("Fondos insuficientes");
                //System.exit(-1);
            }else
            if(errorMessage.equalsIgnoreCase("ORA-2468")) {
                System.err.println("Error al conectarse en la BD");
                //System.exit(-2);
            }
        }
    }

    void a() throws Exception {
        System.out.println("A");
        b();
    }
    void b() throws Exception {
        System.out.println("B");
        c();
    }
    void c() throws Exception {
        System.out.println("C");
        d();
    }
    void d() throws Exception {
        System.out.println("D");
        throw new Exception("ORA-12345");
        //throw new Exception("ORA-2468");
    }

}
