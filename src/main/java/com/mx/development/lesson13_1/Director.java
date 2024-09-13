package com.mx.development.lesson13_1;

import lombok.Data;
@Data
public class Director extends Gerente{

    private String beneficios;
    private String datosAuto;

    private Gerente[]gerentes;

}
