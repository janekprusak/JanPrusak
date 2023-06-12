import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Petle15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku do odczytu: ");
        String fileread = keyboard.nextLine();
        System.out.println("Podaj nazwę pliku do zapisu: ");
        String filewrite = keyboard.nextLine();
        File read = new File(fileread + ".txt");
        Scanner filescanner = null;
        try {
            filescanner = new Scanner(read);
            String content = "";
            while (filescanner.hasNextLine()) {
                content += filescanner.nextLine() + "\n";
            }
            filescanner.close();
            content = content.toUpperCase();
            try {
                FileWriter writer = new FileWriter(filewrite + ".txt");
                writer.write(content);
                System.out.println("Zapisano pomyślnie");
                writer.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
