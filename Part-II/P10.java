
import java.util.Arrays;
import java.util.Scanner;

/**Perform following functionalities of the string: 
● Find Length of the String 
● Lowercase of the String 
● Uppercase of the String 
● Reverse String  */

public class P10{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter String : ");
        String s1 = sc.nextLine();
        
        System.out.println("Length of String : "+s1.length());
        System.out.println("In Lower Case : "+s1.toLowerCase());
        System.err.println("In Upper Case  : "+s1.toUpperCase());

        String rev_s1 = "";
        for (int i = s1.length()-1; i >= 0; i--) {
            rev_s1 += s1.charAt(i);  
        }
        System.out.println("Reversed String : "+rev_s1);

        char Sort_s1[] = s1.toCharArray();
        Arrays.sort(Sort_s1);
        String sort = new String(Sort_s1);
        System.out.println("Sorted String : "+sort);
        



    }
}