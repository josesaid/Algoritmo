package com.mx.development.sample06;

import lombok.Data;

@Data
public class HelloWorld {
    private String message;

    public void inicio(){
        System.out.println("Cargando al bean en el contexto");
    }
    public void fin() {
        System.out.println("Destruyendo al bean en el contexto");
    }
}
