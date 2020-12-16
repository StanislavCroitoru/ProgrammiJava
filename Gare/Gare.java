//Classe Gare
//Creare una classe gare con i seguenti attributi:
//1)nome gara (String) ---> (esempio: maratona di New York)
//2)tipo sport (String) ---> (esempio: corsa)
//3)premio in denaro (double) ---> (esempio: 5000€)
//4)nome vincitore (String) ---> (esempio: Mario Rossi)

//Creare il metodo csotruttore (ovviamente nel metodo costruttore il nome del vinciore non sarà messo)
//Metodi get e set

public class Gare
{
    private String nomeGara;
     private String tipoSport;
      private double premioInDenaro;
       private String nomeVincitore;

    public Gare()
    {
        setPremioInDenaro(0);
         setNomeVincitore("");
    }

    public String getNomeGara()
    {
        return nomeGara;
    }

    public void setNomeGara(String nomeGara)
    {
        this.nomeGara = nomeGara;
    }

    public String getTipoSport()
    {
        return tipoSport;
    }

    public void setTipoSport(String tipoSport)
    {
        this.tipoSport = tipoSport;
    }

    public double getPremioInDenaro()
    {
        return premioInDenaro;
    }

    public void setPremioInDenaro(double premioInDenaro)
    {
        this.premioInDenaro = premioInDenaro;
    }

    public String getNomeVincitore()
    {
        return nomeVincitore;
    }

    public void setNomeVincitore(String nomeVincitore)
    {
        this.nomeVincitore = nomeVincitore;
    }

}
