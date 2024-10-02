
import java.util.Scanner;

/*Imagine you are developing a budget tracking application. 
You need to calculate the total expenses for the month. Users 
will input their daily expenses, and the program should 
compute the sum of these expenses. Write a Java program to 
calculate the sum of elements in an array representing daily 
expenses*/

public class P4{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of days in Month : ");
        int days = sc.nextInt();

        int daily_expanses[] = new int[days];
        
        //input expanses
        for (int i =0; i < days ; i++) {
            System.out.print("Enter exapnses for day "+(i+1)+" : ");
            daily_expanses[i] =  sc.nextInt(); 
        }
        //calculate
        int total_expanses = 0;
        for(int i=0;i<days;i++){
           total_expanses = total_expanses + daily_expanses[i];
        }
        System.out.print("Total exapanses for month is "+total_expanses+" Rupees\n");
    }
}