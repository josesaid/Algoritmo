package com.mx.development.module01.lesson09;

import java.util.regex.Pattern;

public class EqualsIgnoreCase {
    public static void main(String[] args) {
        String cadena1 = "Albert entiende correctamente el uso de las llamadas a los métodos de la clase String";
        String cadena2 = "Albert entiende correctamente el uso de las llamadas a los métodos de la clase String";
        String cadena3 = "Albert entiende correctamente el uso de las llamadas a LOS métodos de la clase string";

        System.out.println(cadena1.equals(cadena2));
        System.out.println(cadena1.equals(cadena2.toUpperCase()));
        System.out.println(cadena1.toUpperCase().equals(cadena2.toUpperCase()));

        System.out.println(cadena1.equalsIgnoreCase(cadena2.toUpperCase()));

        System.out.println(cadena1.indexOf("ing"));
        System.out.println(cadena1.indexOf("de", 40));

        System.out.println(cadena1.lastIndexOf("de"));

        String emailAddress = "username@domain.com";
        String regexPattern = "^[\\w\\.-]+@[a-zA-Z\\d\\.-]+\\.[a-zA-Z]{2,}$";
        boolean result = Pattern.compile(regexPattern).matcher(emailAddress).matches();
        System.out.println("¿El email hace match con la expresión regular dada?: " + result);

        System.out.print(emailAddress.repeat(4));
    }

}
