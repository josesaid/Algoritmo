package com.mx.development.module01.lesson11;
public class WideningExample {
    public static void main(String ... args) {
        byte b = 10;
        byte s = 20;

        // es exactamente lo mismo (todas las operaciones entre byte, short e int, por defecto el resultado
        // será int.
        //int c =(int) (b + s);
        int c = (b + s);


        double dd = 10.3d;
        byte  z  = (byte)(c + dd);
        System.out.println("z: " + z);

        //int l = b * b;
        byte cien = (byte)(b * b);
        System.out.println("cien: " + cien);


        float i = (float)(b + s);
        System.out.println( i );

        //widening
        short s2 = b;
        System.out.println(s2);

        b = 120;
        metodoQueRecibeSoloLongs(b); //widening
        metodoQueRecibeSoloLongs(s2); //widening
        metodoBoxing(b); //Autoboxing <- Boxing  -> unboxing
        multipleArguments(1,2, 3); //Var-args

        //Wrapper:
        //  byte -> Byte

        Byte b2 = 1; //Autoboxing
        byte b3 = b2.byteValue();  //Unboxing

        //Boxing
        //AutoBoxing|Unboxing
    }

    static void metodoQueRecibeSoloLongs(long l){
        System.out.println("metodoQueRecibeSoloLongs: " + l);
    }

    //Wrappers Classes
    static void metodoBoxing(Byte myByte){
        float f = myByte.floatValue();
        System.out.println("F: " + f);
        byte b = myByte.byteValue();
        System.out.println("b: " + myByte); //unboxing
    }




    static void multipleArguments(int ...x){
        for(int i : x){
            System.out.print("i: " + i);
        }
    }
}
