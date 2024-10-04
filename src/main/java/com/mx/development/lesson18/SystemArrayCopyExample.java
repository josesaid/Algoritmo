package com.mx.development.lesson18;

public class SystemArrayCopyExample {
    public static void main(String[] args) {

        int [] array1 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        int [] array2 = new int []{ 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        System.arraycopy(array2, 0, array1, 5, 2);

        //array1[7] = array1[7] * 100;
        //array1[8] = array1[8] * 100;
        //array1[9] = array1[9] * 100;
        System.arraycopy(array2, 7, array1, 7, 3);

        for(int i: array1){
            System.out.print(i + " ");
        }
    }

}
