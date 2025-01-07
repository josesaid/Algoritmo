package com.mx.development.module01.lesson26;

import java.time.LocalDate;
import java.time.Period;

public class PeriodExample {
    public static void main(String[] args) {

        LocalDate startDate = LocalDate.of(2015, 2, 20);
        LocalDate endDate = LocalDate.of(2017, 1, 15);

        Period period = Period.between(startDate, endDate);

        System.out.println("period: " + period);
    }

}
