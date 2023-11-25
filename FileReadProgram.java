package GuviJavaCollections;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReadProgram {
    public static void main(String[] args) {
        try {
            File file = new File("nonexistentfile.txt");
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        }
    }
}

