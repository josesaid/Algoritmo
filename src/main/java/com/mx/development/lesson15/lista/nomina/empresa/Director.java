package com.mx.development.lesson15.lista.nomina.empresa;

import lombok.Data;

import java.util.List;

@Data
public class Director extends Gerente {

    private String beneficios;
    private String datosAuto;
    private List<Gerente> gerentes;

}
