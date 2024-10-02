/**Perform following Functionalities of the string: 
“CHARUSAT UNIVERSITY” 
● Find length 
● Replace ‘H’ by ‘FIRST LATTER OF YOUR NAME’ 
● Convert all character in lowercase  */

public class P11{
    public static void main(String[] args) {

        String s1 = "CHARUSAT UNIVERSITY";
        System.out.println("\nYour String is "+s1);
        System.out.println("Length of String : "+s1.length());
        System.out.println("After Replacing first letter :"+s1.replace('H', 'Y'));
        System.out.println("In Lower Case : "+s1.toLowerCase()+"\n");
    }
}
