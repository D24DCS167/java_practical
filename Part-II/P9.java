
import java.util.Scanner;

/**Given a string, return a string where for every char in the 
original, there are two chars. 
double_char('The') → 'TThhee' 
double_char('AAbb') → 'AAAAbbbb' 
double_char('Hi-There') → 'HHii--TThheerree'  */

public class P9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter a string ");
        String a= sc.nextLine();
        System.out.println("String "+twochar(a)+"\n");
    }


    static String twochar(String b)
    { 
        String result ="";
        char[]a=b.toCharArray();
        for (int i = 0; i < b.length(); i++) {
            result = result + a[i]+a[i];            
        }
        return  result;
    }
}

