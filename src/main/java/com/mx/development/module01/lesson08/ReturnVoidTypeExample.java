package com.mx.development.lessons08;

public class ReturnVoidTypeExample {
    public static void main(String[] args) {

        imprimeNumeros(1, 20);

    }

    private static void imprimeNumeros(int inicio, int _final) {
        for(int i=inicio; i<= _final; i++){
            if (i==8)
                return ;
            System.out.println(i);
        }
    }

}
