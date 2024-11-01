package com.mx.development.lesson26;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate fecha = LocalDate.now();
        LocalDate fecha2 = LocalDate.now();

        fecha = fecha.plusYears(-1).plusMonths(-1).plusDays(-9);
        System.out.println("fecha: " + fecha);


        fecha2 = fecha2.minusDays(2).minusMonths(3).minusWeeks(4);
        System.out.println(fecha2);
        System.out.println("fecha2: " + fecha2);

        LocalDate christmas = LocalDate.of(2025, 12, 25);
        System.out.println("christmas: "  + christmas);



    }

}
