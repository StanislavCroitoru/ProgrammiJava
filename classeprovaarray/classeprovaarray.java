package classeprovaarray;

public class classeprovaarray
{
    private int[] array;
     public classeprovaarray (int[] a)
     {
         array = new int[a.lenght];
          for (int i = 0; 1 < a.length; i ++)
          {
             array[i] = a[i];
          }

     }

     public int[] somma (int[] a)
     {
         int lunghezza = 0;
         if (array.length<a.length)
         {
             lunghezza = array.length;
         }
         else
         {
             lunghezza = a.length;
         }

         int[] ris = new int[lunghezza];
          for (int i = 0;  i < lunghezza; i++ )
          {
              ris[i] = array[i] + a[i];
          }

          return ris;

     }

}
