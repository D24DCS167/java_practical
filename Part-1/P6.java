/*Create a Java program that prompts the user to enter the
number of days (n) for which they want to generate their 
exercise routine. The program should then calculate and 
display the first n terms of the Fibonacci series, representing 
the exercise duration for each day. */
import java.util.Scanner;

public class P6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of days for your exercise routine: ");
        int n = sc.nextInt();
        
        System.out.println("Your exercise routine (in minutes) for the next " + n + " days:");
        for (int i = 0; i < n; i++) {
            System.out.println("Day " + (i + 1) + ": " + fibonacci(i) + " minutes");
        }
    }
    
    public static int fibonacci(int num) {
        if (num == 0) return 0;
        if (num == 1) return 1;
        return fibonacci(num - 1) + fibonacci(num - 2);
    }
}
