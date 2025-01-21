package com.mx.development.module02.lesson12.example01.notsync;

public class Table {
    public void printTable(int n){//method not synchronized
        for(int i=1;i<=5;i++){
            System.out.println(n*i);
            try{
                Thread.sleep(500);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        new Table().printTable(1);
    }
}
