package HARD_disk;
import java.util.Scanner;

public class HARD_disk
{
    //**dichiaro gli attributi della classe Hard disk

    private float Velocità;
     private float Tempoaccesso;
      private float Memoria;
       private float Punti1;
        private float Punti2;
         private float Punti3;
          private float PuntiTot;

    public HARD_disk(float Velocità, float Tempoaccesso, float Memoria, float Punti1, float Punti2, float Punti3, float PuntiTot)
    {

        //**Specifico i parametri in ingresso

        this.Velocità = Velocità;
         this.Tempoaccesso = Tempoaccesso;
          this.Memoria = Memoria;
           this.Punti1 = Punti1;
           this.Punti2 = Punti2;
            this.Punti3 = Punti3;
             this.PuntiTot = PuntiTot;

    }

          //**metodi get e set per prendere gestire le variabili anche se private

    public float getVelocità()
    {
        return Velocità;
    }

    public void setVelocità(float Velocità)
    {
        this.Velocità = Velocità;
    }

    public float getTempoaccesso()
    {
        return Tempoaccesso;
    }

    public void setTempoaccesso(float Tempoaccesso)
    {
        this.Tempoaccesso = Tempoaccesso;
    }

    public float getMemoria()
    {
        return Memoria;
    }

    public void setMemoria(float Memoria)
    {
        this.Memoria = Memoria;
    }

    public float getPunti1()
    {
        return Punti1;
    }

    public void setPunti1(float Punti1)
    {
        this.Punti1 = Punti1;
    }

    public float getPunti2()
    {
        return Punti2;
    }

    public void setPunti2(float Punti2)
    {
        this.Punti2 = Punti2;
    }

    public float getPunti3()
    {
        return Punti3;
    }

    public void setPunti3(float Punti3)
    {
        this.Punti3 = Punti3;
    }

    public float getPuntiTot()
    {
        return PuntiTot;
    }

    public void setPuntiTot(float PuntiTot)
    {
        this.PuntiTot = PuntiTot;
    }


    //**inizio del main

    public static void main(String[] args)
    {

        //**dichiaro variabili utili per lo svolgimento del programma

        float V1[];           //**dichiaarazione vettore
         int x=0;
          int i=0;
           float Massimo=0;
            float Minimo=0;
             V1=new float[6];            //**settaggio dimenzione vettore

        //**dichiaro i 5 hard disk come istanze

        HARD_disk H1 = new HARD_disk(0, 0, 0, 0, 0, 0, 0);
         HARD_disk H2 = new HARD_disk(0, 0, 0, 0, 0, 0, 0);
          HARD_disk H3 = new HARD_disk(0, 0, 0, 0, 0, 0, 0);
           HARD_disk H4 = new HARD_disk(0, 0, 0, 0, 0, 0, 0);
            HARD_disk H5 = new HARD_disk(0, 0, 0, 0, 0, 0, 0);

        //**comando necessario per poter usare la funzione di nome Scanner che cio permette di prendere un valore da tastiera

        Scanner Scanner = new Scanner(System.in);

        //**Inserisco le velocità da tastiera per tutte le 5 istanze precedentemente create

        System.out.println("Inserisci la velocità di H1");
         float v1 = Scanner.nextFloat();
          H1.setVelocità(v1);

        System.out.println("Inserisci la velocità di H2");
         float v2 = Scanner.nextFloat();
          H2.setVelocità(v2);

        System.out.println("Inserisci la velocità di H3");
         float v3 = Scanner.nextFloat();
          H3.setVelocità(v3);

        System.out.println("Inserisci la velocità di H4");
         float v4 = Scanner.nextFloat();
          H4.setVelocità(v4);

        System.out.println("Inserisci la velocità di H5");
         float v5 = Scanner.nextFloat();
          H5.setVelocità(v5);

        //**Inserisco le memorie da tastiera

        System.out.println("Inserisci la memoria di H1");
         float m1 = Scanner.nextFloat();
          H1.setMemoria(m1);

        System.out.println("Inserisci la memoria di H2");
         float m2 = Scanner.nextFloat();
          H2.setMemoria(m2);

        System.out.println("Inserisci la memoria di H3");
         float m3 = Scanner.nextFloat();
          H3.setMemoria(m3);

        System.out.println("Inserisci la memoria di H4");
         float m4 = Scanner.nextFloat();
          H4.setMemoria(m4);

        System.out.println("Inserisci la memoria di H5");
         float m5 = Scanner.nextFloat();
          H5.setMemoria(m5);

        //**Inserisci il tempo di accesso da tastiera

        System.out.println("Inserisci il tempo di accesso di H1");
         float t1 = Scanner.nextFloat();
          H1.setTempoaccesso(t1);

        System.out.println("Inserisci il tempo di accesso di H2");
         float t2 = Scanner.nextFloat();
          H2.setTempoaccesso(t2);

        System.out.println("Inserisci il tempo di accesso di H3");
         float t3 = Scanner.nextFloat();
          H3.setTempoaccesso(t3);

        System.out.println("Inserisci il tempo di accesso di H4");
         float t4 = Scanner.nextFloat();
          H4.setTempoaccesso(t4);

        System.out.println("Inserisci il tempo di accesso di H5");
         float t5 = Scanner.nextFloat();
          H5.setTempoaccesso(t5);

        //**eseguo  i calcoli per il punteggio di ogni hard disk

        H1.Punti1 = H1.Velocità;
         H2.Punti1 = H2.Velocità;
          H3.Punti1 = H3.Velocità;
           H4.Punti1 = H4.Velocità;
            H5.Punti1 = H5.Velocità;

        H1.Punti2 = H1.Tempoaccesso*200;
         H2.Punti2 = H2.Tempoaccesso*200;
          H3.Punti2 = H3.Tempoaccesso*200;
           H4.Punti2 = H4.Tempoaccesso*200;
            H5.Punti2 = H5.Tempoaccesso*200;

        H1.Punti3 = H1.Memoria*500;
         H2.Punti3 = H2.Memoria*500;
          H3.Punti3 = H3.Memoria*500;
           H4.Punti3 = H4.Memoria*500;
            H5.Punti3 = H5.Memoria*500;

        H1.PuntiTot = H1.Punti1+H1.Punti2+H1.Punti3;
         H2.PuntiTot = H2.Punti1+H2.Punti2+H2.Punti3;
          H3.PuntiTot = H3.Punti1+H3.Punti2+H3.Punti3;
           H4.PuntiTot = H4.Punti1+H4.Punti2+H4.Punti3;
            H5.PuntiTot = H5.Punti1+H5.Punti2+H5.Punti3;

        //**metto il punteggio totale di ogni hard disk in un vettore

        V1[1] = H1.getPuntiTot();
         V1[2] = H2.getPuntiTot();
          V1[3] = H3.getPuntiTot();
           V1[4] = H4.getPuntiTot();
            V1[5] = H5.getPuntiTot();


        //**calcolo quale vettore ha il punteggio maggiore

        Massimo = V1[1];
        for(i=1; i<=5; i++)
        {
            if( V1[i]> Massimo )
            {
                Massimo = V1[i];
            }

        }

                //**calcolo quale vettore ha il punteggio minore

        Minimo = V1[1];
        for(x=1; x<=5; x++)
        {
            if( V1[x]< Minimo )
            {
                Minimo = V1[x];
            }

        }

        //**Un ciclo while che mi permette di crerare un menù a scleta attraverso l'utilizzo di uno switch

        int Fine=1;
         while(Fine>0)
          {
              System.out.println("\nScelga l'opzione");
               System.out.println(  "\t 1-Dati di H1 \n" +
                    "\t 2-Dati di H2 \n" +
                     "\t 3-Dati di H3 \n" +
                      "\t 3-Dati di H4 \n " +
                       "\t 5-Dati di H5 \n " +
                        "\t 6-Maggiore e minore \n " +
                         "\t 7-Fine \n");

            //**prendo da tastiera la scelta tra quelle proposte

            int Selezione = Scanner.nextInt();


            //**switch che sceglie attraverso la variabile "selezione" e i vari casi di scelta

            switch(Selezione)
            {
                case 1:
                    System.out.println("La velocità di H1 è \n" + H1.Velocità);
                     System.out.println("La Memoria di H1 è \n" + H1.Memoria);
                      System.out.println("Ll tempo di accesso di H1 è \n" + H1.Tempoaccesso);
                       System.out.println("I punti totali di H1 sono \n" + V1[1]);
                    break;

                case 2:
                    System.out.println("La velocità di H2 è \n" + H2.Velocità);
                     System.out.println("La Memoria di H2 è \n" + H2.Memoria);
                      System.out.println("Ll tempo di accesso di H2 è \n" + H2.Tempoaccesso);
                       System.out.println("I punti totali di H2 sono \n" + V1[2]);
                    break;

                case 3:
                    System.out.println("La velocità di H3 è \n" + H3.Velocità);
                     System.out.println("La Memoria di H3 è \n" + H3.Memoria);
                      System.out.println("Ll tempo di accesso di H3 è \n" + H3.Tempoaccesso);
                       System.out.println("I punti totali di H3 sono \n" + V1[3]);
                    break;

                case 4 :
                    System.out.println("La velocità di H4 è \n" + H4.Velocità);
                     System.out.println("La Memoria di H4 è \n" + H4.Memoria);
                      System.out.println("Ll tempo di accesso di H4 è\n" + H4.Tempoaccesso);
                       System.out.println("I punti totali di H4 sono \n" + V1[4]);
                    break;

                case 5 :
                    System.out.println("La velocità di H5 è \n" + H5.Velocità);
                     System.out.println("La Memoria di H5 è \n" + H5.Memoria);
                      System.out.println("Ll tempo di accesso di H5 è \n" + H5.Tempoaccesso);
                       System.out.println("I punti totali di H5 sono \n" + V1[5]);
                    break;

                case 6:
                    System.out.print("\n L'hard disk migliore è quello con punteggio \n" + Massimo);
                     System.out.print("\n L'hard disk peggiore è quello con punteggio \n" + Minimo);
                      System.out.println("\n H5: \n" + V1[5]);
                       System.out.println("H4: \n" + V1[4]);
                        System.out.println("H3: \n" + V1[3]);
                         System.out.println("H2: \n" + V1[2]);
                          System.out.println("H1: \n" + V1[1]);

                    break;

                case 7:
                    Fine=Fine-2;
                    break;
            }

        }

    }

}

//**fine programma


