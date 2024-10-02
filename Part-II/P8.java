/** Given an array of ints, return the number of 9's in the 
array. array_count9([1, 2, 9]) → 1 
array_count9([1, 9, 9]) → 2 
array_count9([1, 9, 9, 3, 9]) → 3 **/
import java.util.Scanner;
public class P8{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a[] ={0,9,9,8,9};
        int i;
        int count = array_count9(a);

        System.out.println("\nYour array is {0,9,9,8,9} : ");

        System.out.println("Number of '9' present in array is "+count+"\n");
    }
    static  int array_count9(int[] arr)
    {
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==9)
            {
                count++;
            }
            
        }
        return count;
    }
}