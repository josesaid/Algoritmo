package com.mx.development.lesson17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {
        HashMap<Integer, Persona> mapa = new HashMap();
        mapa.put(1, new Persona("Juan Perez", "juan.perez@algo.com"));
        mapa.put(2, new Persona("Francisco Villa", "francisco.villa@mexico.com"));
        mapa.put(3, new Persona("Lucha Villa", "lucha.villa@mexico.com"));

        System.out.println(mapa);
        System.out.println(mapa.get(3));

        System.out.println("---------------------------");
        System.out.println(mapa.containsKey(1));
        //System.out.println(mapa.containsValue("Juan Perez"));
        System.out.println(mapa.containsValue(new Persona("Juan Perez", "juan.perez@algo.com")));

        System.out.println("????????????????????????????????????");
        System.out.println(mapa.remove(3).getCorreoElectronico());
        System.out.println(mapa.size());
        System.out.println(mapa);
        mapa.clear();
        System.out.println("Debe ser cero: --> " + mapa.size());
        System.out.println("Debe estar vacio: " + mapa);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        for(int i=1; i<=10; i++){
            mapa.put(Integer.valueOf(i), new Persona("Persona_"+i, "persona_"+i+".algo@mexico.com"));
        }
        System.out.println(mapa);
        Set<Integer> llaves = mapa.keySet();
        for(Integer llave : llaves){
            Persona temp = mapa.get(llave);
            System.out.println("<"+temp.getNombre()+", "+temp.getCorreoElectronico()+">");
        }

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
        Collection<Persona> personas = mapa.values();
        for(Persona persona : personas){
            System.out.println(persona.getNombre() + " = " + persona.getCorreoElectronico());
        }

        System.out.println("¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬¬");
        Set< Map.Entry<Integer, Persona> > filas = mapa.entrySet();
        for(Map.Entry<Integer, Persona> registroUnico : filas){
            Integer id = registroUnico.getKey();
            Persona p = registroUnico.getValue();
            System.out.println("--> (" + id + " = [" + p.getNombre()+", "+p.getCorreoElectronico()+"] ) ");
        }
    }

}
