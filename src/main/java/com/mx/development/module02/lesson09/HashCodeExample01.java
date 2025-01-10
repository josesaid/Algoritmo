package com.mx.development.module02.lesson09;

public class HashCodeExample01 {
    public static void main(String[] args) {
        Casa c1 = new Casa();
        c1.setDireccion("Calle X-Men #123 Col Mexico");
        c1.setNiveles(2);
        c1.setBanios(2.5f);
        System.out.println(c1.hashCode());

        Casa c2 = new Casa();
        c2.setDireccion("Calle X-Men #123 Col Mexico");
        c2.setNiveles(2);
        c2.setBanios(2.5f);
        System.out.println(c2.hashCode());

        System.out.println(new Casa());
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("-------");

        //System.out.println(c1.equals(c1));
        System.out.println(c1.equals(c2));
        System.out.println("$$$$$$$$$$$$$$");

    }
}
