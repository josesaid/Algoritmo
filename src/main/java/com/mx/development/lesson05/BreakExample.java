package com.mx.development.lesson05;

public class BreakExample {
    public static void main(String[] args) {
        /*int i = 25;

        for(i=0; i<10; i++){
            System.out.println("for" + i);
        }
        System.out.println(i);*/
        //------------
        // Break:

        for(int i=0;i<11; i++){
            if(i==6)
                break;
            System.out.print(i);
        }


        //System.out.println();
        //System.out.print("\n");
        System.out.println(" Afuera del ciclo for..." /* + i*/);
    }
}
