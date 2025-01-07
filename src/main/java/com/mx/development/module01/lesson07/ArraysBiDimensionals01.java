package com.mx.development.module01.lesson07;

public class ArraysBiDimensionals01 {
    public static void main(String[] args) {
        int x = 5;  // filas
        int y = 1;  // columnas
        int [][] array = new int[x][y];
        /*
        x0 = 1,2,3,4,5                  x0 = arreglo[0][0] = 1   arreglo[0][1] = 2   arreglo[0][2] = 3  ...4 ..5
        x1 = 6,7,8,9,10                 x1 = arreglo[1][0] = 6   arreglo[1][1] = 7    8    ...9   ...10
        x2 = 11, 12, 13, 14, 15         x2 = arreglo[2][0] = 11   12   ...13  ...14  ...15
        x3 = 16, 17, 18, 19, 20         x3 = arreglo[3][0] = 16   17  ...18  ....19 ...20
        x4 = 21, 22, 23, 24, 25         x4 = arreglo[4][0] = 21  22    ...23  ...24   ...25
         */
        int contador = 1;
        for(int i=0; i<array.length; i++){  //Filas  6
            for(int j=0; j < array[i].length; j++){ //Columnas 5
                array[i][j] = contador++;
                //contador = contador + 1;
            }
        }
        System.out.println("--->");
        for(int[] arreglo : array){   //filas
            for(int numero : arreglo){  //columnas
                System.out.print(numero+",");
            }
            System.out.println();
        }
    }

}
