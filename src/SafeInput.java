import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SafeInput {
    public static void main(String[] args) {
        try {
            File inputFile = new File("input.txt");
            Scanner scanner = new Scanner(inputFile);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] parts = line.split(" ");

                String name = parts[0] + " " + parts[1];
                int age = Integer.parseInt(parts[2]);

                System.out.println("Name: " + name + ", Age: " + age);
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }
    }
}
