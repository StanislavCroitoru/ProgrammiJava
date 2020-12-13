package com.Dipendentee;

public class Dipendentee {
    //creare la Classe Dipendentee con:
//attributi
//Nome
//Cognome
//Mansione
//Stipendio
//il metodo Costruttore
//metodi necessari per gestire il programma.


        public static String nome;
        public static String cognome;
        public static String mansione;
        private static float stipendio;

        public Dipendentee(String nome, String cognome, String mansione, float stipendio)
        {
            this.nome = nome;
            this.cognome = cognome;
            this.mansione = mansione;
        }

        public static float getStipendio()

        {
            return stipendio;
        }

        public static void setStipendio(float stipendio)
        {
            Dipendentee.stipendio = stipendio;
        }

    }
