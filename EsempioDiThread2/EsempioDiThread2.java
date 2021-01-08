package com.EsempioDiThread2;

public class EsempioDiThread2 implements Runnable
{
    // crea una nuova istanza di EsempioDiThread2
     EsempioDiThread2()
     {
         Thread primoT = Thread.currentThread();
          System.out.println("Primo thread: " + primoT);
           Thread nuovoT = new Thread(this, "Thread figlio");
            System.out.println("\t\tThread figlio: " + nuovoT);
             nuovoT.start();
              try
              {
                  Thread.sleep(2000);
              }
              catch (InterruptedException e)
              {
                  System.out.println("Primo thread: Mi hanno interrotto");
              }
              System.out.println("Primo thread terminato");
     }

     // metodo che il nuovo thread esegue

    public void run()
    {
        try
        {
            for(int i = 1; i < 5; i++)
            {
                System.out.println("\t\t" + i);
                 Thread.sleep(1000);
            }
        }
        catch (InterruptedException e)
        {
            System.out.println("\t\tThread figlio: Mi hanno interrotto");
        }
        System.out.println("\t\tThread figlio terminato");
    }
    
}
