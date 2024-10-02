    /**Write a java that implements an interface 
AdvancedArithmetic which contains a method signature 
int divisor_sum(int n). You need to write a class 
calledMyCalculator which implements the interface. 
divisorSum function just takes an integer as input and 
return the sum of all its divisors. 
For example, divisors of 6 are 1, 2, 3 and 6, so 
divisor_sum should return 12. The value of n will be at 
most 1000.  */
import java.util.Scanner;
interface AdvancedArithmetic
{
    public int divisor_sum(int n);
}
class MyCalculator implements AdvancedArithmetic
{
    public int divisor_sum(int n)
    {
        int sum=0;
        int i;
        for (i=1;i<=n;i++)
        {
             if (n % i == 0)
             {
                sum=sum+i;
             }
        }
        return sum;
    }
}

public class P22
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("   USING INTERFACE");
        System.out.println("\nEnter number : ");
        int n = sc.nextInt();

        MyCalculator mc = new MyCalculator();
        int result = mc.divisor_sum(n);

        //System.out.println("The sum of divisors of " + n + " is: " + result+"\n");
        System.out.println("The sum of divisors is "+ result+"\n");

        sc.close();
    }
}

Scanner scanner = new Scanner(System.in);
        
        try {
            // Read two integers from input
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            // Perform the division and print the result
            System.out.println(a / b);
        } catch (java.util.InputMismatchException e) {
            System.out.println(e); 
