package com.mx.development.module01.lesson05;

public class BuclesAnidados {
    public static void main(String[] args) {
        int i = 1;
        externo:
        while (i <= 10) {
            interno:
            //labels
            for (int j = 0; j < 11; j++) {
                if (i == 4 && j == 4)
                    break externo;
                if (i == 5 && j == 5)
                    continue;
                System.out.print("[" + i + "," + j + "]");
            }
            System.out.println();
            i++;
        }
        System.out.println("Afuera del while...");
    }

}
