/**Write a Java Program to Search for a given word in a 
File.  */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class P29_a {
    public static void main(String[] args) {
        
        //String filePath = "F1.txt";
        //String wordToSearch = "java";
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter File Name : ");
        String filePath = sc.nextLine();
        System.out.println("\nEnter word to be searched : ");
        String wordToSearch = sc.nextLine();
        
        try {
            boolean found = searchWord(filePath, wordToSearch);
            if (found) {
                System.out.println("\nThe word '" + wordToSearch + "' was found in the file.\n");
            } else {
                System.out.println("\nThe word '" + wordToSearch + "' was not found in the file.\n");
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }

    public static boolean searchWord(String filePath, String wordToSearch) throws FileNotFoundException {
        File file = new File(filePath);
        
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            if (line.contains(wordToSearch)) {
                scanner.close(); 
                return true;     
            }
        }

        scanner.close();
        return false;    
    }
}
