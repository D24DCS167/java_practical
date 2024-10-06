import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class file {
    public static void main(String[] args) {
        String filePath = "Example.txt"; // Ensure this path is correct

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("\nContents of the file:");
            while ((line = br.readLine()) != null) {
                System.out.println(line+"\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file:");
            e.printStackTrace();
        }
    }
}
