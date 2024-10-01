package com.mx.development.lesson19;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The enum Tipo pago.
 */
public enum TipoPago {
    /**
     * Pendiente por revisar tipo pago.
     */
    PENDIENTE_POR_REVISAR(0),
    /**
     * Revisado tipo pago.
     */
    REVISADO(1),
    /**
     * Pendiente de pago tipo pago.
     */
    PENDIENTE_DE_PAGO(2),
    /**
     * Pagado tipo pago.
     */
    PAGADO(3),
    /**
     * Cancelado tipo pago.
     */
    CANCELADO(4),
    /**
     * Reservado tipo pago.
     */
    RESERVADO(5);

    /**
     * The Indice.
     */
    int indice;
    TipoPago(int indice){
        this.indice = indice;
    }

    /**
     * Gets indice.
     *
     * @return the indice
     */
    public int getIndice() {
        return indice;
    }

    /**
     * Sets indice.
     *
     * @param indice the indice
     */
    public void setIndice(int indice) {
        this.indice = indice;
    }

    /**
     * This method validates the sequence of the two steps given at the method signature
     *
     * @param valor1 the first step in the sequence
     * @param valor2 the second step in the sequence
     * @return the boolean - This value is the result of the validation of the sequence (internal sequence where the first
     * value must be always less than the second one.
     */
    static public boolean  verificaStatuses(int valor1, int valor2){
        return (valor1 < valor2) ? true : false;
    }

    /**
     * To list list.
     *
     * @return the list
     */
    public static List<TipoPago> toList(){
        List<TipoPago> tiposDePagoList = new ArrayList<>();
        Collections.addAll(tiposDePagoList, TipoPago.values());
        return tiposDePagoList;
    }

}
