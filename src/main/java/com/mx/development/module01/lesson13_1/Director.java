package com.mx.development.module01.lesson13_1;

import lombok.Data;
@Data
public class Director extends Gerente{

    private String beneficios;
    private String datosAuto;

    private Gerente[]gerentes;

}
