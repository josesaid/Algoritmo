package com.mx.development.lesson15.lista.nomina.empresa;

import java.util.List;

public class Tools {

    public static void imprimeInformacionEmpleado(Empleado empleado){
        System.out.println(empleado.toString());
    }

    public static float calculaNomina(Director director){
        float totalNominas = 0.0f;
        for(Gerente gerente : director.getGerentes()){
            for(LiderProyecto liderProyecto : gerente.getLideresProyecto()){
                for(Empleado empleado : liderProyecto.getIntegrantes()){
                    float salario = empleado.getSalario();
                    if(empleado.getNombre() ==null){
                        System.out.println("leyendo el salario de: " + empleado.getEmail() +", salario: " + salario);
                    }else{
                        System.out.println("leyendo el salario de: " + empleado.getNombre()+", salario: " + salario);
                    }
                    totalNominas = totalNominas + salario;
                }
            }
        }
        totalNominas = totalNominas + director.getSalario();
        System.out.println("Nómina antes de impuestos: " + totalNominas);
        return totalNominas;
    }

}
