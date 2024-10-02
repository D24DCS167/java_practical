/**Imagine you are developing a currency conversion tool for a 
travel agency. This tool should be able to convert an amount 
in Pounds to Rupees. For simplicity, we assume the 
conversion rate is fixed: 1 Pound = 100 Rupees. The tool 
should be able to take input both from command-line 
arguments and interactively from the user. */

import java.util.Scanner;
public class P12{
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int cmd_Pounds = Integer.parseInt(args[0]);
        int cmd_Rupees = cmd_Pounds*100;
        int user_pound;
        

        System.out.println("\n    TRAVEL AGENCY     ");
        System.out.print("Enter pounds : ");
        user_pound = sc.nextInt();
        int user_rupees = user_pound*100;
        System.out.println("Pounds in rupees(Using Command line argument) : "+cmd_Rupees);
        System.out.println("Pounds in rupees(from user) : "+user_rupees+"\n");

    }
}