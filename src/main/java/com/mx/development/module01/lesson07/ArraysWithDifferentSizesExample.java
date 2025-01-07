package com.mx.development.module01.lesson07;

public class ArraysWithDifferentSizesExample {
    public static void main(String[] args) {
        int [][] matrix = new int[3][];
        matrix[0] = new int[6];
        matrix[0][0] = 1;   matrix[0][1] = 2;  matrix[0][2] = 3; matrix[0][3] = 4;  matrix[0][4] = 5;  matrix[0][5] = 6;

        //matrix[1] = new int[3];
        matrix[1] = new int[]{1,2,3};

        //matrix[2] = new int[4];
        matrix[2] = new int[] {1, 3, 7, 9};

        for(int []arreglo : matrix){
            for(int valor : arreglo){
                System.out.print(valor+",");
            }
            System.out.println();
        }
    }

}
