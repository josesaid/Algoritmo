package com.mx.development.lesson26;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterExample {
    public static void main(String[] args) {
        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss:n -w =W");

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MMMM-dd-yyyy");
        LocalDate date = LocalDate.parse("October-31-2024", dateTimeFormatter);
        System.out.println(date);

        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("MMM-dd-yyyy");
        LocalDate date2 = LocalDate.parse("Oct-31-2024", dateTimeFormatter2);
        System.out.println(date2);

    }

}
