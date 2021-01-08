package com.bevanda_array;

public class Main {

    public static void main(String[] args)
    {
        // realizzare un menu con le seguenti opzioni
         //1 stampa del prezzo medio delle bevande
          //2 inserito il nome bevanda da tastiera incrementare il prezzo del 10%
           //3 stampa di tutte le bevande
            //4 stampa delle bevande con gradoalcolico > di 8;
             //5 fine

        while (execute)
        {
            System.out.println("\n-------------------------------\n");
             System.out.println("Scegli una opzione");
              System.out.println("1. Fare Media del prezzo delle bevande" +
                    "\n2 Inserire prezzo e bevanda\n3. Incrementare prezzo del 10%" +
                    "\n4 Determinare grado alcool \n5. Stampare\n6. Esci");
            System.out.print("> ");
             select = scan.nextByte();

            switch (select)
            {
                case 1 -->
                    double media = total / Bevanda_Array.length;
                     System.out.format("The average is: ");
                      System.out.println(media);
                    break;

                case 2 -->
                    System.out.println("\nInserisci Prezzo: ");
                     Bevanda.aggiungi ilPrezzo(scan.nextFloat());
                      break;

                case 3 -->
                    Bevanda.modificaPrezzo();
                     System.out.println("Prezzo incrementato del 10%");
                    break;

                case 4 -->
                    Bevanda.gradoAlcolico();
                    break;

                case 5 -->
                    Bevanda.stampa();
                    break;

                case 6 -->
                    execute = !execute;
                    break;

                default:
                    throw new IllegalStateException("Il tasto digitato non è usufruibile: " + select);
            }
        }
    }

