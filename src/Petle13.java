import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petle13 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwę pliku: ");
        String filename = keyboard.nextLine();
        File file = new File(filename+".txt");
        String content = "";
        Scanner filescanner = null;
        try {
            filescanner = new Scanner(file);
            for(int i = 0; i < 5; i++){
                if(filescanner.hasNextLine()) {
                    content += filescanner.nextLine() + "\n";
                }
            }
            filescanner.close();
            System.out.println("Zawartość:\n"+content);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
