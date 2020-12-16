

public class dipendente2
{

    //Dichiarazione variabile

    private int n;

    //Dichiarazione metodo Fact

    public Fact(int k)
    {
        n = k; //Assegna K ad N
    }

    public long conv()
     //Dichiara il metodo conv

    {
        //Assegna 1 ad i

        int i = 1;
         long result = 1; //Dichiara la variabile "long" result
        while (i <= n)

        //Ciclo while
        {
            result = result * i; //svolgimento il calcolo result * i e lo assegna a result
             i++; //Incremento i di 1 ogni volta che questa istruzione viene eseguita
        }

        return result;
    }

}

