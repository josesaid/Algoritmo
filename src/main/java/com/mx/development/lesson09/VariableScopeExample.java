package com.mx.development.lesson09;

public class VariableScopeExample {
    public int suma = 100;

    public static void main(String[] args) {
        VariableScopeExample instancia = new VariableScopeExample();
        int resultado = instancia.add(10);
        System.out.println("resultado: " + resultado);

        VariableScopeExample said = new VariableScopeExample();
        int resultado2 = said.add(20);
        System.out.println("resultado: " + resultado2);

        instancia = null;
        said = null;
        System.gc();
    }

      public int add(int data){
        int suma = this.suma + data;
        return suma;
    }

}
