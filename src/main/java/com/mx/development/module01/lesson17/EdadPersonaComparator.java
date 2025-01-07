package com.mx.development.module01.lesson17;

import java.util.Comparator;

public class EdadPersonaComparator implements Comparator  {

    @Override
    public int compare(Object o1, Object o2) {
        Persona p1 = null, p2 = null;
        if(o1 instanceof Persona) {
            p1 = (Persona) o1;
        }
        if(o2 instanceof Persona) {
            p2 = (Persona)o2;
        }
        if(p1.getEdad() > p2.getEdad())
            return -1;
        if(p1.getEdad() < p2.getEdad())
            return 1;
        if(p1.getEdad()==p2.getEdad())
            return 0;
        return -100;
    }

}
