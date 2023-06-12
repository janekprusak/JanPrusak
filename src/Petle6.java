import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Petle6 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        File file = new File("petle6.txt");
        String line = "";
        try {
            Scanner filescanner = new Scanner(file);
            while (filescanner.hasNextLine()) {
                line += filescanner.nextLine();
            }
            filescanner.close();
            System.out.println("Podaj znak do wyszukania:");
            char sign = keyboard.nextLine().charAt(0);
            int count = 0;
            for(int i = 0; i < line.length(); i++){
                if(line.charAt(i)==sign){
                    count++;
                }
            }
            System.out.println("Znak '"+sign+"' pojawia się w pliku "+count+" razy");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
