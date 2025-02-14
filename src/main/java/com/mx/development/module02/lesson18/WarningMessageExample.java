package com.mx.development.module02.lesson18;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Warning message example.
 * @author Said Olano
 * @deprecated Esta clase ya es deprecated(obsoleta). Deberá migrarse en la siguiente versión.
 */
public class WarningMessageExample extends PersonaY{
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        example1();
        new WarningMessageExample().saludar();
    }

    @Override
    void saludar() {
        System.out.println("SALUDANDO...");
    }

    @SuppressWarnings({"unchecked", "cast"})
    private static void example1() {
        List lista = new ArrayList();
        lista.add("Juan Carlos");
        lista.add(33);
        lista.add(3.1415129f);
        lista.add(new PersonaX());
        System.out.println(lista);
    }
}

/**
 * The type Persona x.
 */
class PersonaX{}
