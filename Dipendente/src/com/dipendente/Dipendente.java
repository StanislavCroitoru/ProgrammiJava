//Costruire la classe Dipendente con i seguenti attributi:
//Nome
//Cognome
//Reparto
//Qualifica
//Stipendio

//Fare i metodi:
//Costruttore
//Get e Set
//Aumento | aumenta lo stipendio di una percentuale fornita dall’utente
//Bonus | aggiunge allo stipendio un bonus fornito dall’utente

//Inizio programma
package com.dipendente;

public class Dipendente
{
    private String nome;
    private String cognome;
    private String reparto;
    private String qualifica;
    private float stipendio;

    public Dipendente(String nome, String cognome, String reparto, String qualifica, float stipendio)
    {
        this.nome = nome;
        this.cognome = cognome;
        this.reparto = reparto;
        this.qualifica = qualifica;
        this.stipendio = stipendio;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getCognome()
    {
        return cognome;
    }

    public void setCognome(String cognome)
    {
        this.cognome = cognome;
    }

    public String getReparto()
    {
        return reparto;
    }

    public void setReparto(String reparto)
    {
        this.reparto = reparto;
    }

    public String getQualifica()
    {
        return qualifica;
    }

    public void setQualifica(String qualifica)
    {
        this.qualifica = qualifica;
    }

    public float getStipendio()
    {
        return stipendio;
    }

    public void setStipendio(float stipendio)
    {
        this.stipendio = stipendio;
    }

    public void aumento(float inputAumento)
    {
        float currentAumento;
        float finalAumento;
        float percentageAumento;

        percentageAumento = (stipendio / 100) * inputAumento;
        currentAumento = getStipendio();
        finalAumento = currentAumento + percentageAumento;

        setStipendio(finalAumento);
    }

    public void bonus(float inputBonus)
    {
        float currentBonus;
        float finalBonus;

        currentBonus = getStipendio();
        finalBonus = currentBonus + inputBonus;

        setStipendio(finalBonus);
    }

    public void print()
    {
        System.out.println("\n\n-----------------------\n" +
                "Nome: " + getNome() + "\nCognome: " + getCognome() + "\nReparto: " + getReparto() +
                "\nQualifica: " + getQualifica() + "\nStipendio: " + getStipendio());
    }

}
