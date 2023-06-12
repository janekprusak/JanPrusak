import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Petle3 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        try {
            File myObj = new File("petle3.txt");
            if (myObj.createNewFile()) {
                System.out.println("Stworzono plik: " + myObj.getName());
            } else {
                System.out.println("Taki plik już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Błąd przy tworzeniu.");
            e.printStackTrace();
        }
        try {
            FileWriter file = new FileWriter("petle3.txt");
            System.out.println("Podaj szybkość pojazdu w km/h:");
            double v = keyboard.nextDouble();
            System.out.println("Podaj czas podróży w godzinach:");
            int h = keyboard.nextInt();
            int s = 0;
            if(h>=1 && v>=0){
                System.out.println("Przebyta droga:");
                for(int i = 1; i<=h; i++){
                    s+=v;
                    System.out.println(i+"h "+s+"km");
                    file.write(i+"h "+s+"km\n");
                }
                file.close();
            }else{
                System.out.println("Niepoprawne dane wejściowe!");
            }
        } catch (IOException e) {
            System.out.println("Bład przy zapisie.");
            e.printStackTrace();
        }

    }
}
