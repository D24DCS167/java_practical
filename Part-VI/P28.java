/**Write an example that counts the number of times a 
  particular character, such as e, appears in a file. The 
  character can be specified at the command line. You can 
  use xanadu.txt as the input file. */

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class P28
{
    public static void main(String[] args)
    {
        int count=0;
        char targetchar = args[0].charAt(0);
        try
        {
            int currentchar;
            FileReader f1 = new FileReader("F2.txt");
            BufferedReader b1 =  new BufferedReader(f1);
            while ((currentchar = b1.read()) != -1) {
                if (currentchar == targetchar) {
                    count++;
                }
            }
            
            System.out.println("\nThe character '" + targetchar + "' appears " + count + " times in the file.\n");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}

