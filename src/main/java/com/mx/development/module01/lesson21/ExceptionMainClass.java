package com.mx.development.module01.lesson21;

public class ExceptionMainClass {
    public static void main(String[] args) /*throws Exception, AutoException*/{
        int minimoEsperado = 12;
        try {
            new ExceptionMainClass().validaVentas(minimoEsperado);
        } catch (AutoException e) {
            System.out.println("Fallo en el hilo principal debido a: ### " + e.getMensaje() + " ###");
        }
    }

    void validaVentas(int numeroVentasPorMes) throws AutoException{
        try{
            if(numeroVentasPorMes < 10)
                throw new AutoException("El minimo esperado de ventas de autos era 10");
            if(numeroVentasPorMes > 10 && numeroVentasPorMes < 15)
                throw new AutoException("Se vendieron +10 autos, pero menos de 15");
        }catch(AutoException e){
            //System.err.println( e.getMessage().toUpperCase());
            //algo mas para gestionar la excepcion..
            throw new AutoException("Said gestionó la excepción aqui, pero la está " +
                    "redirigiendo hacia quien llame al método validaVentas");
        }
    }

}
