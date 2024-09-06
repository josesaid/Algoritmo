package com.mx.development.lesson13;

public class ClaseEjemplo {
    static public  String futbolista = "Cristiano Ronaldo";

    public static void main(String[] args) {
        ClaseEjemplo instancia1 = new ClaseEjemplo();
        ClaseEjemplo instancia2 = new ClaseEjemplo();
        System.out.println("valor: "  + instancia1.futbolista);

        //Todas las instancias de la clase "ClaseEjemplo" se ven afectadas por el cambio en el valor de una
        //propiedad estática, es decir una variable de clase.
        ClaseEjemplo.futbolista = "Messi";

        System.out.println("valor: "  + instancia2.futbolista);
        System.out.println("valor: "  + instancia1.futbolista);

        //System.out.println("valor: " + new ClaseEjemplo().futbolista);


    }

}
