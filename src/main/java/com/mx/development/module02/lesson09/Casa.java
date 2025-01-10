package com.mx.development.module02.lesson09;

public class Casa extends Object{
    private String direccion;
    private int niveles;
    private float banios;

    @Override
    public boolean equals(Object object) {

        // If the object is compared with itself then return true
        if (object == this) {
            return true;
        }

        /* Check if o is an instance of Complex or not
          "null instanceof [type]" also returns false */
        if (!(object instanceof Casa)) {
            return false;
        }

        // typecast object to Casa so that we can compare data members
        Casa casa2 = (Casa) object;

        boolean esMismaDireccion = this.getDireccion().equals(casa2.getDireccion());
        boolean tieneMismosNiveles = this.getNiveles() == casa2.getNiveles();
        boolean tieneMismosBanios = this.getBanios() == casa2.getBanios();

        // Compare the data members and return accordingly
        return (esMismaDireccion && tieneMismosNiveles && tieneMismosBanios);
    }

    @Override
    public int hashCode(){
        return niveles;
    }


    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNiveles() {
        return niveles;
    }

    public void setNiveles(int niveles) {
        System.out.println("SET NIVELES: "+ niveles);
        this.niveles = niveles;
    }

    public float getBanios() {
        return banios;
    }

    public void setBanios(float banios) {
        this.banios = banios;
    }
}
