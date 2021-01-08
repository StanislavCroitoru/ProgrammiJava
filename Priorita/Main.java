package com.Priorita;

public class Main
{

    public static void main(String[] args)
    {
	     LettoreFile altaP = new LettoreFile(Thread.NORM_PRIORITY + 2);
	      LettoreFile bassaP = new LettoreFile(Thread.NORM_PRIORITY - 2);
	       bassaP.start();
	        altaP.start();
	        try
            {
                Thread.sleep(3000);
            }
	        catch(Exception e)
            { }
	        bassaP.stop();
	         altaP.stop();
	          System.out.println("Lettore 1 - letti " + bassaP.recordLetti + " record. ");
	           System.out.println("Lettore 2 - letti " + altaP.recordLetti + " record ");
    }

}
