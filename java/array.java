package array.java;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class array
{
    public static void main(String[] args)
    {
        Scanner reqInput = new Scanner(System.in);
         Random rand = new Random();

        int lenght = 0;
         System.out.println("Quanti numeri si vuole inserire.....................................................?");
          lenght = reqInput.nextInt();
           System.out.println("Inserire la dimensione massima dei numeri generati....................................");
            int maxNum;
             maxNum = reqInput.nextInt();
              int[] array = new int [lenght];

        int randNum;
         int i = 0;

        for (Object number : array)
        {
            randNum = rand.nextInt(maxNum);
             System.out.println(randNum);
              array[i] = randNum;
        }

        array.sort(array);
         System.out.println("Ordiamento array..............................................................:");

        for (Object number : array)
        {
            System.out.println(number);
        }

        int searchVal;
         System.out.println("Cercare nell'array.................................................................: ");
          searchVal = reqInput.nextInt();


        int retVal = array.binarySearch(array,searchVal);

        int finalRetVal;
         finalRetVal = retVal + 1;
          System.out.println("L'elemento selezionato " + searchVal + " si trova nella posizione................................................. " + finalRetVal);
    }

}
