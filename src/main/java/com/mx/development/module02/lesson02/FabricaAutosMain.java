package com.codegym.lessons.module02.lesson02;

public class FabricaAutosMain {
    public static void main(String[] args) {
        Auto a = new FabricaAutosUSA().fabricarAuto("VW");
        a.sonarClaxon();    //Virtual Method Invocation
    }
}
