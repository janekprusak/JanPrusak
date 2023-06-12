import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Petle18 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int random = ThreadLocalRandom.current().nextInt(0, 101), number, counter = 1;
        System.out.println("Odgadnij liczbę od 0 do 100!");
        do{
            number = keyboard.nextInt();
            if(number > random){
                System.out.println("Za duża liczba, spróbuj ponownie");
                counter++;
            }else if(number < random){
                System.out.println("Za mała liczba, spróbuj ponownie");
                counter++;
            }else{
                System.out.println("BRAWO ZGADŁ*Ś za "+counter+" razem!!!");
            }
        }while(number != random);
    }
}
