/**Write a program to copy data from one file to another file. 
If the destinatio */

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class P30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the path of the source file: ");
        String sourcePath = sc.nextLine();
        
        System.out.print("Enter the path of the destination file: ");
        String destinationPath = sc.nextLine();

        File sourceFile = new File(sourcePath);
        File destinationFile = new File(destinationPath);

        try {
            // Check if the destination file exists, if not create it
            if (!destinationFile.exists()) {
                destinationFile.createNewFile();
                System.out.println("\nDestination file did not exist and has been created.");
            }

            // Perform the file copy operation
            copyFile(sourceFile, destinationFile);
            System.out.println("\nFile copied successfully.\n");
        } catch (IOException e) {
            System.out.println("\nError occurred: " + e.getMessage());
        }

        sc.close();
    }

    public static void copyFile(File source, File destination) throws IOException {
        FileInputStream inputStream = new FileInputStream(source);
        FileOutputStream outputStream = new FileOutputStream(destination);

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, bytesRead);
        }

        inputStream.close();
        outputStream.close();
    }
}
