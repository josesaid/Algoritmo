package com.codegym.lessons.module02.lesson07;

public class UpCasting {
    public static void main(String[] args) {
        Parent obj1 = new Child();
        Parent obj2 = new Child();
        obj1.printData();
        obj2.printData();
    }
}
