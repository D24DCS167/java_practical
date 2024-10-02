
/*
Write a java program which takes two integers x & y as 
input, you have to compute x/y. If x and y are not integers 
or if y is zero, exception will occur and you have to 
report it.  */

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
        catch(ArithmeticException | InputMismatchException E)
        {
            System.out.println("Number can not divided by 0 !   or  You've entered value that is not integer!");
        }
        finally
        {
            System.out.println("\nProgram is terminated !!\n");
        }
    }
}