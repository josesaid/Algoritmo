package com.mx.development.module01.lesson12;

//@Data   //Bean, JavaBean, Entity, Pojo
public class Empleado /*extends Object*/{
    private String nombre /*= null*/;
    private String email /*= null*/;
    private float salarioEnDolares ;
    private String lider = "Frank Scott";

    public Empleado(){
        super();
        System.out.println("Un empleado ha sido creado sin nombre y sin email...");
    }

    public Empleado(float salarioEnDolares){
        this.setNombre("Nombre no asignado");
        this.setEmail("Email sin asignar");
        this.setLider("Said Olano");
        this.setSalarioEnDolares(salarioEnDolares);
    }

    protected Empleado(String nombreEmpleado){
        super();
        this.setNombre(nombreEmpleado);
        System.out.println("Un empleado ha sido creado con el constructor que recibe un nombre como parámetro...");
    }

    public Empleado(String nombreEmpleado, String email){
        super();
        this.setNombre(nombreEmpleado);
        this.setEmail(email);
        this.setSalarioEnDolares(6_000.0f);
        System.out.println("Un empleado ha sido creado usando el nombre y el email...");
    }
    public Empleado(String nombreEmpleado, String email, float salario){
        super();
        this.setNombre(nombreEmpleado);
        this.setEmail(email);
        this.setSalarioEnDolares(salario);
        System.out.println("Un empleado ha sido creado usando el nombre, email, salario (USD).");
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return nombre;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    public void setSalarioEnDolares(float salarioEnDolares){
        System.out.println("Seteando/asignando el salario de: " + nombre + " en: USD$"+salarioEnDolares);
        this.salarioEnDolares= salarioEnDolares;
    }
    public float getSalarioEnDolares(){
        return this.salarioEnDolares;
    }


    public void setLider(String lider){
        this.lider = lider;
    }
    public String getLider(){
        return this.lider;
    }

    @Override
    public String toString() {
        return "Empleado: [" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", salarioEnDolares=" + salarioEnDolares +
                ", lider='" + lider + '\'' +
                ']';
    }

    @Override
    public boolean equals(Object object) {
        /*if (object != this) {
            return false;
        }*/
        if(object instanceof Empleado){
            Empleado empleadoTemporal = (Empleado) object;
            if(empleadoTemporal.getSalarioEnDolares() != getSalarioEnDolares())
                return false;
        }
        return true;
    }

    public int hashCode(){
        //int valor = (int) ( (getSalarioEnDolares() * 7) / 5);
        int valor = nombre.length() * 2;
        //int valor = new Random().nextInt()*5;
        return valor;
    }

}
