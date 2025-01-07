package com.mx.development.lessons08;

public class CamelCaseNotation {
    private String correoElectronicoDeLaPersonaQueRecibiraAtencion;

    public static String miMetodo(String variableQueHaraAlgoInteresante){
        String resultado = variableQueHaraAlgoInteresante.toString().toUpperCase().toLowerCase();
        return resultado;
    }

    private final int NUMERO_DE_LLANTAS = 4;

}
