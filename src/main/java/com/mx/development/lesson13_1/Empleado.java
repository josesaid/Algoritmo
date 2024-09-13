package com.mx.development.lesson13_1;

import lombok.Data;

@Data
public class Empleado extends Persona {
    private String idEmpleado;
    private String email;
    private float salario;

    public Empleado(String idEmpleado, String email) {
        this.idEmpleado = idEmpleado;
        this.email = email;
    }
    public Empleado(){}

    public Empleado(String idEmpleado, String email, float salario) {
        this.idEmpleado = idEmpleado;   //setIdEmpleado(idEmpleado);
        setEmail(email);
        setSalario(salario);
    }
    @Override
    public void pensar() {
        System.out.println("Pensando como un empleado L-V, y sábado descanso...");
    }

}
