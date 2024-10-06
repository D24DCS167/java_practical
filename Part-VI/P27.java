/**Write a program that will count the number of lines in 
each file that is specified on the command line. Assume 
that the files are text files. Note that multiple files can be 
specified, as in "java Line Counts file1.txt file2.txt 
file3.txt". Write each file name, along with the number of 
lines in that file, to standard output. If an error occurs 
while trying to read from one of the files, you should print 
an error message for that file, but you should still 
process all the remaining files. */

import java.io.File;
import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;

public class P27
{
    public static void main(String[] args)
    {
        int count=0,i;

        /*try
        {
            File f1 = new File("F1.txt");
            Scanner sc = new Scanner(f1);
            while(sc.hasNextLine())
            {
                count++;
                sc.nextLine();
            }
            System.out.println("\nThere are "+count+" lines occured in file by using Scanner class. \n");
        }*/

       /*try
       {
            FileReader f1 = new FileReader("F1.txt");
            BufferedReader b1 =  new BufferedReader(f1);
            while((b1.readLine())!=null)
            {
                count++;
            }
            System.out.println("\nThere are "+count+" occured in file by using BufferedReader class. \n");
       }*/

       /* try
        {
            String filename = args[0];
            filename = filename+".txt";
            FileReader f1 = new FileReader(filename);
            BufferedReader b1 =  new BufferedReader(f1);
            while((b1.readLine())!=null)
            {
                count++;
            }
            System.out.println("\nThere are "+count+" occured in file by passing file name at command line. \n");
        }*/ 
       
        if(args.length == 0)
        {
            System.out.println("No file specified !");
        }
        String fname[] = new String[args.length];
        for(i=0;i<args.length;i++)
        {
            fname[i] = args[i];
            fname[i] = fname[i]+".txt";
        }
        for(String filename : fname)
        {
            count=0;
            try
            {
                FileReader f1 = new FileReader(filename);
                BufferedReader b1 =  new BufferedReader(f1);
                while((b1.readLine())!=null)
                {
                    count++;
                }
                System.out.println("\nThere are "+count+" line occured in "+filename+" by passing multiple file name at command line. \n");
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }
    }
}
