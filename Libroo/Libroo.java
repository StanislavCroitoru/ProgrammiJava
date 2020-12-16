package com.Libroo;

public class Libroo
{


    //Creare la classe libro con i seguenti attributi:
//Titolo
//Autore
//Prezzo
//Casa editrice

//1)Metodo costruttore
//2)set e get
//3)stampa
//4)aggiorna prezzo inserendo in input il nuovo importo

    private String titolo;
     private String autore;
      private float prezzo;
       private String casaEditrice;

    Libroo(){

    }


    public String getTitolo()
    {
        return titolo;
    }

    public void setTitolo(String titolo)
    {
        this.titolo = titolo;
    }

    public String getAutore()
    {
        return autore;
    }

    public void setAutore(String autore)
    {
        this.autore = autore;
    }

    public float getPrezzo()
    {
        return prezzo;
    }

    public void setPrezzo(float prezzo)
    {
        this.prezzo = prezzo;
    }

    public String getCasaEditrice()
    {
        return casaEditrice;
    }

    public void setCasaEditrice(String casaEditrice)
    {
        this.casaEditrice = casaEditrice;
    }

    public void stampa()
    {
        System.out.println("\n===== DATI LIBRO =====\n" +
                "Titolo " + getTitolo() + "\nAutore: " + getAutore() + "\nPrezzo: €" + getPrezzo() +
                 "\nCasa Editrice: " + getCasaEditrice());
    }

}


