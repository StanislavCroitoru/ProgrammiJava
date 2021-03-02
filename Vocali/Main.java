//**Contare le vocali presenti in una frase (in una stringa)

package Vocali;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {

        //**dichiarazione delle variabili

        String parola = " ";
         int numeroVocali = 0;
          int numerolettere;
           int contatore = 0;

           System.out.println("Inserire la parola .....................................................");
            Scanner scanner = new Scanner(System.in);
             parola = scanner.nextLine();

             numerolettere = parola.length();

             //**inizio del ciclo

        do {
            if((parola.charAt(contatore)=='a')||(parola.charAt(contatore)=='e')||(parola.charAt(contatore)=='i')||
                    (parola.charAt(contatore)=='o')||(parola.charAt(contatore)=='u')||(parola.charAt(contatore)=='A')||
                     ( parola.charAt(contatore)=='E')||(parola.charAt(contatore)=='I')||(parola.charAt(contatore)=='O')||
                      (parola.charAt(contatore)=='U'))

            numeroVocali++;
             contatore++;

        }

        while (contatore > numerolettere);

        System.out.println("Nella parola inserita sono presenti..............."+numeroVocali+"Vocali");

    }

}
