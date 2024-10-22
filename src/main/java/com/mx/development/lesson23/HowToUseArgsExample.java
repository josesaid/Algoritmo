package com.mx.development.lesson23;

public class HowToUseArgsExample {
    public static void main(String[] saidWasHere) {
        int suma = 0;
        if(saidWasHere.length==0) {
            System.out.println("No hay parámetros de entrada en el método main...");
        }else{
            System.out.println("Se hallaron: " + saidWasHere.length + " argumentos");

            for(int i=0; i<saidWasHere.length; i++){
                System.out.println("ARGUMENTO[" + i + "]: " + saidWasHere[i] );
                suma = suma + Integer.parseInt( saidWasHere[i] );
            }
        }

        System.out.println("el resultado de la sumatoria fue: " + suma );

    }

}
