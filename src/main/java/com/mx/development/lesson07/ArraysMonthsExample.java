package com.mx.development.lesson07;

public class ArraysMonthsExample {

    public static void main(String[] args) {
        int[][] months = new int[][]{ {31, 28, 31}, {30, 31, 30}, {31, 31, 30}, {31, 30, 31} };
        int numero = 1;
        for(int i =0; i< months.length; i++){
            //System.out.println(months[i]); //imprime la referencia en memoria de cada uno de los 4 sub-arreglos.
            for(int j=0; j <months[i].length; j++){
                System.out.print(months[i][j]+", ");
            }
            System.out.println("Cuarto número: " + numero);
            numero = numero +1;
        }
    }

}
