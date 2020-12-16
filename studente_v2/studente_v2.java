//Creare la classe studente_v2 con i seguenti attributi:
//codicealunno
//cognome
//nome
// classe
// voto

//Creare il metodo costruttore per inserire il
//codicealunno
//cognome
//nome
//classe

//mentre il voto deve essere posto a zero
//Creare metodi get & set e stampa
//Creare il metodo aggiungivoto per inserire il voto all'alunno
//Creare il metodo modificaclasse per modificare la classe dell'alunno con la classe nuova inserita da tastiera
//Creare il metodo esito per visualizzare se alunno è promosso(se voto >= a 6), respinto( se voto<di 6)

public class studente_v2
{
    private String codiceAlunno;
     private String cognome;
      private String nome;
       private String classe;
        private float voto = 0;

    //Costruttore

    public studente_v2() {
    }

    //Getter & Setter

    public String getCodiceAlunno()
    {
        return codiceAlunno;
    }

    public void setCodiceAlunno(String codiceAlunno)
    {
        this.codiceAlunno = codiceAlunno;
    }

    public String getCognome()
    {
        return cognome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getClasse()
    {
        return classe;
    }

    public void setClasse(String classe)
    {
        this.classe = classe;
    }

    public float getVoto()
    {
        return voto;
    }

    public void setVoto(float voto)
    {
        this.voto = voto;
    }

    studente_v2(String codiceAlunno, String cognome, String nome, String classe)
    {
        this.codiceAlunno = codiceAlunno;
         this.cognome = cognome;
          this.nome = nome;
           this.classe = classe;
    }

    public void stampa()
    {
        System.out.println("\nCodice Alunno: " + getCodiceAlunno() +
                "\nNome: " + getNome() + " " + getCognome()
                 + "\nClasse: " + getClasse() + "\nVoto: " + getVoto());
    }

    public void aggiungiVoto(float inputVoto)
    {
        voto = inputVoto;
         if (inputVoto > 10 || inputVoto < 0)
         {
            throw new IllegalStateException("[X] INPUT ERROR: Il voto deve essere compreso tra 0 e 10");
        }
    }

    public void esito()
    {
        if (voto >= 5.6)
        {
            System.out.println("\n " + getNome() + " e' promosso");
        }
        else
            {
            System.out.println("\n" + getNome() + " e' bocciato. Unlucky");
        }

    }

    public void modificaClasse(String inputCodiceAlunno, String  inputCognome, String inputNome, String inputClasse, float voto)
    {
        setCodiceAlunno(inputCodiceAlunno);
         setNome(inputCognome);
          setCognome(inputNome);
           setClasse(inputClasse);
            setVoto(voto);
    }

    /**public void modificaClasse_CodiceAlunno (String inputCodiceAlunno)**
     {
        setCodiceAlunno(inputCodiceAlunno);
    }

    public void modificaClasse_Cognome(String inputCognome)
     {
        setCognome(inputCognome);
    }

    public void modificaClasse_Nome(String inputNome)
     {
        setNome(inputNome);
    }

    public void modificaClasse_Classe(String inputClasse)
     {
        setClasse(inputClasse);
    }

    public void modificaClasse_Voto(float inputVoto)
     {
        setVoto(inputVoto);
    } **//

}

