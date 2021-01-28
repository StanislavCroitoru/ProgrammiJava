package arrayprimo;

//**impostazione classe da tastiera(imput)

import java.util.Scanner;

//**creazione classe arrayprimo


public class arrayprimo
{

    //**dichiarazione degli attributi

    private String nome;
     private String squadra;
      private int goalfatti;

    //**creazione metodo costruttore

    public arrayprimo()
    {
        this.nome = " ";
         this.squadra = " ";
          this.goalfatti = 0;
    }

    //**creazione metodi set e get per ogni attributo

    public void setnome(String nome)
    {
        this.nome = nome;
    }

    public String getnome()
    {
        return this.nome;
    }

    public void setsquadra(String squadra)
    {
        this.squadra = squadra;
    }

    public String getsquadra()
    {
        return this.squadra;
    }

    public void setgoalfatti(int goalfatti)
    {
        this.goalfatti = goalfatti;
    }

    public int getgoalfatti()
    {
        return this.goalfatti;
    }

    //**stampa metodi attributi

    public void stampaattributi()
    {
        System.out.println("Nome del giocatore:\t " + this.nome + "\nsquadra:\t " + this.squadra + "\ngoalfatti:\t " + this.goalfatti);
    }

}
