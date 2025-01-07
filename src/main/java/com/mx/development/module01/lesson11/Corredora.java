package com.mx.development.module01.lesson11;

public class Corredora implements PuedeCorrer{
    private String nombre;
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    @Override
    public void correr() {
        System.out.println("corriendo como corredora");
    }

    public static void main(String[] args) {
        //Object anaGuevara = new Corredora();
        //((Corredora)anaGuevara).correr();
        PuedeCorrer anaGuevara = new Corredora();
        anaGuevara.setNombre("Ana Guevara"); //VMI - Virtual method invocation
        anaGuevara.correr();
        new FabricaNike().patrocinarCorredora(anaGuevara);

        PuedeCorrer usainBolt = new CorredorMaraton();
        usainBolt.setNombre("Usain Bolt");
        usainBolt.correr();
        new FabricaNike().patrocinarCorredora(usainBolt);

        //Futbolista messi = new Futbolista();
        PuedeCorrer messi = new Futbolista();
        messi.setNombre("Lionel Messi");
        messi.correr();
        ((PuedePatearBalon)messi).patearBalon(); //polimorficamente complejo...
        new FabricaNike().patrocinarCorredora(messi);
    }
}
class CorredorMaraton extends Corredora{
}

class Futbolista implements PuedeCorrer, PuedePatearBalon{
    private String nombre;
    @Override
    public void patearBalon() {
        System.out.println("patear balon");
    }

    @Override
    public void correr() {
        System.out.println("corriendo como futbolista");
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
interface PuedePatearBalon{
    void patearBalon();
    String getNombre();
}
interface PuedeCorrer{
    void correr();
    String getNombre();
    void setNombre(String nombre);
}

class FabricaNike{
    void patrocinarCorredora(PuedeCorrer corredora){
        System.out.println(corredora.getNombre()+" ha recibido sus zapatillas gratis por su buen performance");
    }
    void patrocinarFutbolista(PuedePatearBalon futbolista){
        System.out.println(futbolista.getNombre()+" ha sido patrocinado");
    }
}