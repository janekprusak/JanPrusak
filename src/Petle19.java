import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Petle19 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int random, counter = 0;
        String[] colours = {"Czerwony", "Zielony", "Niebieski", "Pomarańczowy", "Żółty"};
        for(int i = 0; i<10; i++) {
            random = ThreadLocalRandom.current().nextInt(0, 5);
            System.out.println("Zgadnij kolor wybrany przez komputer");
            String colour = keyboard.nextLine();
            if (colour.equals(colours[random])) {
                counter++;
            }
            System.out.println("Program wybrał " + colours[random]);
        }
        System.out.println("Zgadł*ś poprawnie "+counter+" na 10 razy");
    }
}
