package arrayprimo;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        Scanner tastiera = new Scanner(System.in);

        int scelta;
         int dimensione;
          int i;
           String nomeatleta;
            String squadraatleta;
             int goalfatti;
              int numerogiocatorisquadra = 0;
               String squadradavisualizzare;

        System.out.println("Inserire il numero degli atleti ..................................................");
         dimensione = tastiera.nextline();

         arrayprimo vettore[];
          vettore = new arrayprimo[dimensione];

          for(i = 0; i < dimensione; i++)
          {
              vettore[i] = new arrayprimo();
               System.out.println("\n");
                System.out.println("Inserire nome dell'atleta" + (i+1) + "...................................");
                 nomeatleta = tastiera.nextLine();
                  vettore[i].setnome(nomeatleta);

                  System.out.println("Inseire la squadra dell'atleta " +(i+) + "..........................");
                   squadraatleta = tastiera.nextline();
                    vettore[i].setsquadra(squadraatleta);

                    System.out.println("Inserire  il numero dei goalfatti" + (i+1) +".......................");
                     goalfatti = tastiera.nextline();
                      vettore[i].setgoalfatti(goalfatti);
          }

          System.out.println("Inserire \nazioni che puoi svolgere: \n1: stampare informazioni di tutti gli attributi \n2: stampare atleti che hanno svolto più di 5 goal \n3: stampare numero atleti della squdra \n4: fine programma");
           do
           {
               System.out.println("\n\n Inserire numero delle azioni svolte ..............................");
           }

           //**scegliere

            case 1......
                for(i = 0; i < dimensione; i++)
                {
                    vettore[i].stampaattributi();
                     System.out.println("\n");
                      break;
                }

                case 2.....
                    System.out.println("\n giocatori che hanno svolto più di 5 goal sono .................");
                     for(i = 0; i < dimensione; i++)
                     {
                         if(vettore[i].getgoalfatti() > 5)
                         {
                             System.out.println(" + " +vettore[i].getnome());
                         }

                     }
                     break;

                 case 3......
                    numerogiocatorisquadra = 0;
                     System.out.println("Le squadre disponibili ...................................");
                      for(i = 0; i < dimensione; i++)
                      {
                          System.out.println(" + " +vettore[i].getsquadra());
                      }
                      System.out.println("Scegliere la squadra di qui vuoi visualizzare gli atleti ............?");
                       squadraatletadavisualizzare = tastiera.nexline();
                        for(i = 0; i < dimensione; i++)
                        {
                            if(squadraatletadavisualizzare.(vettore[i]get.sqaudra()));
                            {
                                numerogiocatorisquadra = numerogiocatorisquadra +1;
                            }

                        }

                        System.out.println("numero giocatori della squadra selezionata..................... ");
                         break;

                         case 4.....
                              System.out.println("\n chiudere programma.......................................................................................................");
                         break;

                         System.out.println("Hai inserito una scelta di casi non esistente nella lista........................");

    }

}
