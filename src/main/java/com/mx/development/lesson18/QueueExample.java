package com.mx.development.lesson18;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {

    public static void main(String[] args) {
        //Queue<String> queue = new ArrayDeque<>();
        Queue<String> queue = new PriorityQueue<>();
        //String objeto = null;
        System.out.println("Este elemento se agregó correctamente?: " + queue.add("uno"));
        System.out.println("Este elemento se agregó correctamente?: " + queue.add("dos"));
        System.out.println("Este elemento se agregó correctamente?: " + queue.add("a"));
        System.out.println("Este elemento se agregó correctamente?: " + queue.add("tres"));
        System.out.println("Este elemento se agregó correctamente?: " + queue.add("b"));
        /*try{
            System.out.println("Este elemento se agregó correctamente?: " + queue.add(objeto));
        }catch(Exception exception){
            System.err.println("Ocurrió una excepción: " + exception.getMessage());
        }*/
        System.out.println("Este elemento se agregó correctamente?: " + queue.add("cuatro"));
        //queue.offer("dos");
        System.out.println(queue);

        Queue<Deporte> deportes = new PriorityQueue<>();
        deportes.add(new Deporte("Futbol"));
        deportes.add(new Deporte("Beisbol"));

    }

}
