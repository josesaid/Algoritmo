package com.mx.development.lesson19;

public class SingletonConsumer {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.getInstance();
        instance1 = Singleton.getInstance();

        Singleton instance2 = Singleton.getInstance();
        instance2 = Singleton.getInstance();
    }

}
