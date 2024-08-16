package com.mx.development.lesson05;

public class BreakExample02 {
    public static void main(String[] args) {
        /*int i=0;
        for(i=0; i<11; i++){
            boolean seis = i<7;
            if(seis)
                System.out.print(i);
        }*/
        boolean seisEncontrado = false;
        for(int i=0;i<11 && !seisEncontrado; i++){
            if(i==6)
                seisEncontrado=true;
            System.out.print(i);
        }

    }

}
