//**creare tre vettori..nomeatleta,squadra,golfatti

//**Fare l'inserimento di n elementi, la stampa di tutti, la stampa degli atleti che hanno
//**fatto piu di 10 gol,stampa del numero degli atleti di una squadra inserita da tastiera

package atleta;

public class atleta
{
    String nomeatleta;
     String squadra;
      byte goalfatti;

    public atleta()
    {
        this.goalfatti = goalfatti;
    }

    public void setNomeatleta(String nomeatleta)
    {
        this.nomeatleta = nomeatleta;
    }

    public void setsquadra(String squadra)
    {
        this.squadra = squadra;
    }

    public void setGoalfatti(byte goalfatti)
    {
        this.goalfatti = goalfatti;
    }

    public String getNomeatleta()
    {
        return nomeatleta;
    }

    public String getsquadra()
    {
        return squadra;
    }

    public byte getgolfatti()
    {
        return goalfatti;
    }

}
