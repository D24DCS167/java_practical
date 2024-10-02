/**Write a program to print the area of a rectangle by creating 
a class named 'Area' taking the values of its length and 
breadth as parameters of its constructor and having a 
method named 'returnArea' which returns the area of the 
rectangle. Length and breadth of rectangle are entered 
through keyboard.  */

import  java.util.Scanner;

class Area {
    int length;
    int breadth;
    
    Area(int length,int breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }

    int returnArea()
    {
        return length * breadth;
    }
}

public class P15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length:");
        int len = sc.nextInt();
        System.out.print("Enter breadth:");
        int br = sc.nextInt();
        Area a = new Area(len,br);
        int area = a.returnArea();
        System.out.println("Area of the reactangle is "+area+"\n");
    }
}
