package com.mx.development.lesson26;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        time = time.plusHours(1).minusMinutes(31).plusMinutes(1).plusHours(1);
        System.out.println(time.getNano());

        LocalTime reloj = LocalTime.of(23, 25, 01);
        System.out.println(reloj.getNano());
    }

}
