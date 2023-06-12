import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Petle17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int random = ThreadLocalRandom.current().nextInt(0, 101), number;
        System.out.println("Odgadnij liczbę od 0 do 100!");
        do{
            number = keyboard.nextInt();
            if(number > random){
                System.out.println("Za duża liczba, spróbuj ponownie");
            }else if(number < random){
                System.out.println("Za mała liczba, spróbuj ponownie");
            }else{
                System.out.println("BRAWO ZGADŁ*Ś!!!");
            }
        }while(number != random);
    }
}
