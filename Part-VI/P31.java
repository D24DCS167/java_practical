/**Write a program to show use of character and byte stream. 
Also show use of BufferedReader/BufferedWriter to read console input 
and write them into a file.  */

import java.io.*;
import java.util.Scanner;

public class P31
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nChoose Stream Type:");
        System.out.println("1. Character Stream");
        System.out.println("2. Byte Stream");
        System.out.print("\nEnter your choice: ");
        int choice = scanner.nextInt();
        scanner.nextLine();

        if (choice == 1) 
        {
            System.out.print("Enter a message to save into a file: ");
            String message = scanner.nextLine();
            saveUsingCharacterStream(message);
        } 
        else if (choice == 2)
        {
            System.out.print("Enter a message to save into a file: ");
            String message = scanner.nextLine();
            saveUsingByteStream(message);
        } 
        else 
        {
            System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }

    public static void saveUsingCharacterStream(String message) 
    {
        String filePath = "F6.txt";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) 
        {
            writer.write(message);
            System.out.println("\nMessage saved to file using Character Stream: " + filePath);
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void saveUsingByteStream(String message) 
    {
        String filePath = "F7.txt";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) 
        {
            outputStream.write(message.getBytes());
            System.out.println("\nMessage saved to file using Byte Stream: " + filePath);
        } 
        catch (IOException e) 
        {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
