package com.mx.development.lesson05;

public class ContinueExample {
    public static void main(String[] args) {
        int x = 10;
        while(x++ < 20){
            if(x==15)
                continue;
            System.out.println(x);
        }
    }
}
