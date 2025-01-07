package com.mx.development.module01.lesson26;

import java.time.LocalDateTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime fechaHora = LocalDateTime.now();
        System.out.println(fechaHora);

        fechaHora = fechaHora.minusMonths(2).plusDays(3).minusNanos(20).plusSeconds(30).minusHours(2);
        System.out.println("fechaHora : " + fechaHora );

        LocalDateTime inicioMundial = LocalDateTime.of(2026, 07, 15, 12, 00, 05);
        System.out.println("inicioMundial: " + inicioMundial);

    }

}
