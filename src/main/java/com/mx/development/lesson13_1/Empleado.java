package com.mx.development.lesson13_1;

public class Empleado extends Persona implements Pensable{
    private String idEmpleado;
    private String email;

    public Empleado(String idEmpleado, String email) {
        this.idEmpleado = idEmpleado;
        this.email = email;
    }
    public Empleado(){}

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public void pensar() {
        System.out.println("Pensando como un empleado L-V, y sábado descanso...");
    }

}
