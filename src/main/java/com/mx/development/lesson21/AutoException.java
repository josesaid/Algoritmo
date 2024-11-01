package com.mx.development.lesson21;

import lombok.Data;

@Data
public class AutoException extends Exception{
    private String mensaje;
    public AutoException(String mensaje){
        super(mensaje);
        System.out.println("<AutoException>: " + mensaje);
    }

}
