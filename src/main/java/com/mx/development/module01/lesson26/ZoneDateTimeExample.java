package com.mx.development.module01.lesson26;

import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        //ZoneId zoneId = ZoneId.of("Africa/Cairo");
        //ZoneId zoneId = ZoneId.of("Asia/Hong_Kong");
        ZoneId zoneId = ZoneId.of("America/Bogota");

        ZonedDateTime time = ZonedDateTime.now(zoneId);
        System.out.println("time: " + time);

/*
        Set<String> zonas = ZoneId.getAvailableZoneIds();
        for(String zona : zonas){
            System.out.println("Zona : " + zona);
        }
*/

    }

}
