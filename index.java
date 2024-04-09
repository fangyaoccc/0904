import java.io.*;
import java.nio.file.*;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        String file = "my_test_file.txt"; 
        try {
            String content = Files.readString(Paths.get(file));
            System.out.println("Already inside! : " + content);
        } catch (IOException str) {
            System.out.println("Error.");
            str.printStackTrace();
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter something to save in the file:");
        String userInput = scanner.nextLine();
        try (FileWriter writer = new FileWriter(file)) {
            writer.write(userInput);
            System.out.println("added.");
        } catch (IOException str) {
            System.out.println("Error.");
            str.printStackTrace();
            scanner.close();
        }
    }
}

