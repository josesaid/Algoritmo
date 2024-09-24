package com.mx.development.lesson17;

import java.util.TreeMap;

//https://codeshare.io/Mky9lR
public class TreeMapExample2 {
    public static void main(String[] args) {
        //NombrePersonaComparator nombrePersonaComparator = new NombrePersonaComparator();
        //TreeMap<Persona, Boolean> personas = new TreeMap<>(nombrePersonaComparator);
        EdadPersonaComparator edadPersonaComparator = new EdadPersonaComparator();
        TreeMap<Persona, Boolean> personas = new TreeMap<>(edadPersonaComparator);


        Persona p1 = new Persona("pedro", "pedro_picapiedra@flistones.com", 51);
        personas.put(p1,  true);

        personas.put(new Persona("vilma", "vilma_picapiedra@flistones.com", 39), false );
        personas.put(new Persona("pablo", "pablo_marmol@flistones.com", 37), true);
        personas.put(new Persona("betty", "betty@flistones.com", 53), false);


        System.out.println(personas);
    }

}
