package arraY;
import java.util.Random;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        int arrayLenght;
         int summary = 0;
          float average;

        Random rand = new Random();
         Scanner reqInput = new Scanner(System.in);

        arrayLenght = 10;

        int[]array = new int[10];

        System.out.println("\nI " + arrayLenght + " i numeri generati sono........................................: ");
         for(int i = 0; i < arrayLenght ; i++)

        {
            array[i] = rand.nextInt(arrayLenght);
             System.out.println(array[i]);
              summary = summary + array[i];

        }

        int max = 0;

        for(int i = 0; i < arrayLenght; i++)
        {
            if(max < array[i])
            {
                max = array[i];
            }

            System.out.println(max);
        }

    }

}


