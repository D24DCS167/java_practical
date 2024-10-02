/*Given a string and a non-negative int n, we'll say that the 
front of the string is the first 3 chars, or whatever is there if 
the string is less than length 3. Return n copies of the front; 
front_times('Chocolate', 2) → 'ChoCho' 
front_times('Chocolate', 3) → 'ChoChoCho' 
front_times('Abc', 3) → 'AbcAbcAbc'*/
public class P7
{
    public static void main(String[] args) {
         String s1 = "Chocolate";
         String copies = front(s1,3);
         System.out.println("\nYour String is "+s1);
         System.out.println("3 copy of 3 character in String : "+copies+"\n");

        
    }

    static String front (String s , int n){
       String result = "";

       for (int i = 0; i < n ; i++) 
       {
        String s2= s.substring(0,3);
        result = result + s2;   
       }
       return result;
    }
}

