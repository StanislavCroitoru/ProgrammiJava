package com.LettoreFile;

public class LettoreFile implements Runnable
{
    int recordLetti = 0;
     private Thread leggiRecord;
      private boolean inEsecuzione = true;

       public LettoreFile(int prio)
       {
           leggiRecord = new Thread(this);
            leggiRecord.setPriority(prio);
       }

       public void run()
       {
           while (inEsecuzione)
           {
               // qui viene inserita l'istruzione di lettura di un
                // record dal file
                 recordLetti++;
           }
       }

       public void start()
       {
           leggiRecord.start();
       }

       public void stop()
       {
           inEsecuzione = false;
       }
       
}
