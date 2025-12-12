package Basic.Exceptions;

import java.io.FileReader;
import java.io.IOException;

public class FinallyBlockExample {
    public static void main(String[] args) {
        
        // 1. Declare the resource OUTSIDE the try block.
        // We do this so the 'finally' block can access the variable 'reader'.
        FileReader reader = null;

        try {
            System.out.println("1. Opening file...");
            // Initialize the resource inside the try block
            // Make sure "test.txt" exists in your project folder, or this throws an error
            reader = new FileReader("111.txt");

            // Read the first character just to prove it works
            int data = reader.read();
            System.out.println("2. File read successfully. First char code: " + data);

        } catch (IOException e) {
            // Handle the error (e.g., File not found)
            System.out.println("2. ERROR: Could not read the file - " + e.getMessage());

        } finally {
            // 3. The Cleanup Phase
            // This block runs strictly after try or catch.
            System.out.println("3. Executing finally block to close resources.");

            try {
                // We must check if reader is null (in case the file never opened)
                if (reader != null) {
                    reader.close();
                    System.out.println("4. File closed successfully.");
                }
            } catch (IOException ex) {
                // Even closing a file can throw an error!
                System.out.println("Error while closing file: " + ex.getMessage());
            }
        }
        
        System.out.println("5. Program continues execution...");
    }
}