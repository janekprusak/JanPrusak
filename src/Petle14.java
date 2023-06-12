import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petle14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String filename = keyboard.nextLine();
        File file = new File(filename+".txt");
        String content = "";
        int counter = 1;
        Scanner filescanner = null;
        try {
            filescanner = new Scanner(file);
            while(filescanner.hasNextLine()){
                content += counter+". "+filescanner.nextLine() + "\n";
                counter++;
            }
            filescanner.close();
            System.out.println("Zawartość:\n"+content);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
