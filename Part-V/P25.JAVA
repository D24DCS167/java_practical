
/*
Write a Java program that throws an exception and catch 
it using a try-catch block.  */

import java.util.Scanner;
import java.util.InputMismatchException;
public class P25{

    public static void main(String args[])
    {
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter Value of X and Y:");
        try
        {
            int x= sc.nextInt();
            int y= sc.nextInt();
            int result = x/y;
            System.out.println("Division of x & y is "+result);
        }
        catch(InputMismatchException E)
        {
            System.out.println(" You've entered value that is not integer!");
        }
        catch(IArithmeticException E)
        {
            System.out.println("Number can not divided by 0 !");
        }
        finally
        {
            System.out.println("\nProgram is terminated !!\n");
        }
    }
}