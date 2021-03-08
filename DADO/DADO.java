//** Realizzare una classe Dado (che permetta di lanciare un Dado per ottenere un numero tra 1 e 6)

//** Realizzare un programma di test che faccia 20 lanci, e dia la percentuale di uscita del numero 1, del numero 2,
//** del numero 3 ..... del numero 6

//** Trovare, infine, qual è il numero che è uscito di più e qual è il numero che è uscito di meno

package DADO;

import java.util.Random;

public class DADO {
    private int numeroFacce;
     private Random gen;

     //**costruttore che crea un dado standard a 6 facce

    public DADO() {
        numeroFacce = 6;

        //**si inizializza l'oggetto gen della classe Random

        gen = new Random();
    }

    //**costruttore che crea un dado con il numero di facce rischiesto

    public DADO(int numeroFacce) {
        numeroFacce = numeroFacce;

        //**si inizializza l'oggetto gen della classe Random
         gen = new Random();
    }

    //**costruttore che crea un dado con il numero di facce richiesto

    public DADO(int numeroFacce){
        numeroFacce = numeroFacce;
    }

}
