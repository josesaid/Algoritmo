package com.mx.development.module01.lesson21;

import lombok.Data;

@Data
public class AutoException extends Exception{
    private String mensaje;
    public AutoException(String mensaje){
        super(mensaje);
        System.out.println("<AutoException>: " + mensaje);
    }

}
