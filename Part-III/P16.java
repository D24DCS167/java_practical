/**Print the sum, difference and product of two complex 
numbers by creating a class named ‘Complex’ with separate 
methods for each operation whose real and imaginary parts 
are entered by user. */

import java.util.Scanner;

class Complex
{
    int real;
    int imag;

    Complex(int r, int i)
    {
        this.real = r;
        this.imag = i;
    }

    Complex getSum(Complex r1,Complex r2)
    {
        int real = r1.real + r2.real;
        int imag = r1.imag + r2.imag;
        return new Complex(real, imag);
    }

    Complex getDifference(Complex r1,Complex r2)
    {
        int real = r1.real - r2.real;
        int imag = r1.imag - r2.imag;
        return new Complex(real, imag);
    }

    Complex getProduct(Complex r1,Complex r2)
    {
        int real = r1.real * r2.real;
        int imag = r1.imag * r2.imag;
        return new Complex(real, imag);
    }
}

public class P16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the real part of first complex number: ");
        int r1 = sc.nextInt();
        System.out.print("Enter the imaginary part of first complex number: ");
        int i1 = sc.nextInt();
        System.out.print("Enter the real part of second complex number: ");
        int r2 = sc.nextInt();
        System.out.print("Enter the imaginary part of second complex number: ");
        int i2 = sc.nextInt();
        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);
        Complex sum = c1.getSum(c1, c2);
        Complex difference = c1.getDifference(c1, c2);
        Complex product = c1.getProduct(c1, c2);
        System.out.println("\n1st complex number:" + r1 + "+" + i1 + "i");
        System.out.println("2nd complex number:" + r2 + "+" + i2 + "i");
        System.out.println("\nsum of complex number:" + sum.real + "+" + sum.imag + "i");
        System.out.println("difference of complex number:" + difference.real + "+" + difference.imag + "i");
        System.out.println("product of complex number:" + product.real + "+" + product.imag + "i");
    }
}
