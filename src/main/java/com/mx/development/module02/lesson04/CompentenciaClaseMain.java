package com.codegym.lessons.module02.lesson04;

public class CompentenciaClaseMain {
    public static void main(String[] args) {
        Brincable n = new Niño();
        n.brincar();
        //Comible c2 = (Comible)n;
        //c2.comer();

        //Brincable b2 = (Brincable)((Comible)n);
        //b2.brincar();

        Llorable l2 = (Llorable)(Comible)(Brincable)((Comible)n);
        //Llorable l2 = (Llorable)n;
        l2.llorar();

        Brincable a = new Adulto();
        a.brincar();

        Brincable p = new ProfesionalSalto();
        p.brincar();

        System.out.println("-----------------------------");
        Brincable adolescente = new Adolescente();
        adolescente.brincar();


        //((Comible)adolescente).comer();
        Comible cx1 = ((Comible)adolescente);
        cx1.comer();


        //((Llorable)adolescente).llorar();
        Llorable lx1 = ((Llorable)adolescente);
        lx1.llorar();



        Comible c3 = (Comible) n;
        Comible c4 = (Comible) a;
        Comible c5 = (Comible) p;
        Comible c6 = (Comible) adolescente;
        recibeInstanciasComible(c3, c4, c5, c6);
    }

    static void recibeInstanciasComible(Comible ... instanciasComible){
        System.out.println("Recibió : " + instanciasComible.length + " instancias");
        for (int i=0; i<instanciasComible.length; i++){
            instanciasComible[i].comer();
        }
    }

}
