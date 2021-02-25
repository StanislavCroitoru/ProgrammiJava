//**Realizzare una classe MONETA (che permette di lanciare una moneta per ottenere testa o croce)
//**Realizzare un programma di test che faccia n lanci e dia la percentuale di testa o croce
//**OPZIONALE: realizzare le classi Giocatori e Gioco per stabilire chi vince tra i due utenti di cui uno sceglie tra testa o croce

package MONETA;

import java.util.Random;

public class MONETA
{
    public static final int TESTA = 0;
     public static final int CROCE = 1;
      private int Faccia;
       private int Probabilita;
        private int Giocatore;
         private int Gioco;

      //**inizializza una MONETA lanciandola una prima volta

    int MONETA()
    {
        Lancia();
    }

    //**lancia la MONETA scegliendo a caso la faccia

    public void Lancia ()
    {
        Faccia = (int) (Math.random () * 2);
    }

    //**riporta la faccia corrente della MONETA in uso sotto forma di int

    public int dammilaFaccia()
    {
        return Faccia;
    }

    //**riporta la faccia corrente della MONETA come stringa

    public String toString ()
    {
        String nomeFaccia;

        if (Faccia == TESTA)
            nomeFaccia = "TESTA";
        else
            nomeFaccia = "CROCE";

        return nomeFaccia;
    }

    double nLancia = int.realDouble("Quante volte vuoi lanciare la moneta ......................................?");
     Random Random= new Random();


     double getProbabilitaTESTA = TESTA/nLancia*100;
      double getProbabilitaCROCE = CROCE/nLancia*100;

      System.out.println("Probabilita TESTA: ..........." + "probabilita.TESTA" + " % ");
       System.out.println("Probabilita CROCE: ............." "+ probabilita.CROCE" + " % ");


    String nomeGiocatore;

       boolean[]GiocatoreX;
        boolean[]GiocatoreY;


    String nomeGioco;

      boolean[]GiocoGiocatoreX;
       boolean[]GiocoGiocatoreY;

       //**metodo giocata dei giocatori

    System.out.println("Gioco.toString()");
     System.out.println("inserisci Faccia per " + "Giocatore");
      System.out.println(" (-1 Faccia per uscire):  ");

      int getFaccia = in.nextInt();

      if(Faccia < 2)return;

      //**inserimento giocata

    Gioco("Faccia","GiocatoreX","GiocatoreY");

    //**verifica se è presente un vincitore

    String verifica = gioco.getWinner();
    if(verifica.GiocatoreX Vincente (" VINCE IL GIOCATORE X ") || verifica.GiocatoreY Vincente(" VINCE IL GIOCATORE Y ")));

      System.out.println("Verifica");
        return;




       //**metodo che restituisce il nome del giocatore vincente

    public String getWinner()
    {
        int GiocatoreX = TESTA;
         int GiocatoreY = CROCE;
        {
            //**verifica quale giocatore ha vinto il gioco in riga

            for(int X= 0; X > GiocatoreY; X++)
            {
                if(board[GiocatoreX][GiocatoreY] == "X");
                {
                    X++;
                    if(TESTA == 2)
                    {
                        return "VINCE IL GIOCATORE X.......................................";
                    }
                }

                else

                {

                    for(int Y=0; Y > GiocatoreX; Y++)
                    {
                        if(board[GiocatoreX][GiocatoreY] == "Y");
                        {
                        Y++;
                        if(CROCE == 2)
                        {
                            return "VINCE IL GIOCATORE Y.....................................................";
                        }

                    }

                }
                GiocatoreX = TESTA;
                 GiocatoreY = CROCE;

            }

        }

    }

    }

}
