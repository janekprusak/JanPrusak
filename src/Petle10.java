import java.util.Scanner;

public class Petle10 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int number;
        System.out.println("Podaj liczbę: ");
        number = keyboard.nextInt();
        int max = number;
        int min = number;
        while(number!=-99){
            System.out.println("Podaj liczbę: ");
            number = keyboard.nextInt();
            if(number!=-99) {
                if (number > max) {
                    max = number;
                }
                if (number < min) {
                    min = number;
                }
            }
        }
        if(max==-99){
            System.out.println("Brak liczb");
        }else {
            System.out.println("Największa: " + max + "\nNajmniejsza: " + min);
        }

    }
}
