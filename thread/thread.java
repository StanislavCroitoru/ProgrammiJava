package com.thread;

public class thread
{
    public static void main(String args[])
    {
        thread tic = thread.currentthread();
        tic.setName("Thread in esecuzione");
        System.out.println("Ecco il thread in corso: " + tic);
        try
        {
            for (int i = 3; i > 0; i--)
            {
                System.out.println(i);
                Thread.sleep(1000);
            }

        } catch (InterruptedException e)

        {
            System.out.println("Mi hanno interrotto");
        }
        System.out.println("Fine del lavoro.");
    }
    
}
