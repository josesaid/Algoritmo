package com.mx.development.module01.lesson17;

import java.util.Comparator;

public class NombrePersonaComparator implements Comparator  {

    @Override
    public int compare(Object o1, Object o2) {
        Persona p1 = null, p2 = null;
        if(o1 instanceof Persona) {
            p1 = (Persona) o1;
        }
        if(o2 instanceof Persona) {
            p2 = (Persona)o2;
        }
        return p1.getNombre().compareTo(p2.getNombre());
    }

}
