package com.mx.development.lesson19;

import java.util.List;

public class EnumExample {
    public static void main(String[] args) {
        List<TipoPago> tiposDePagos = TipoPago.toList();
        for(TipoPago item : tiposDePagos){
            System.out.println("-> " + item);
        }

        //TipoPago pendientePorRevisar = TipoPago.PENDIENTE_POR_REVISAR;
        //TipoPago pagado = TipoPago.PAGADO;
        //boolean operacionCorrecta = TipoPago.verificaStatuses(pendientePorRevisar.ordinal(), pagado.ordinal());

        TipoPago cancelado = TipoPago.CANCELADO;
        TipoPago revisado = TipoPago.REVISADO;

        boolean operacionCorrecta = TipoPago.verificaStatuses(cancelado.ordinal(), revisado.ordinal());
        if(operacionCorrecta)
            System.out.println("Operación es correcta");
        else
            System.out.println("El orden de los pasos no es el correcto/esperado...");

    }

}
