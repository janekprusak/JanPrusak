import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź wynik 1. testu: ");
        double test1 = keyboard.nextDouble();
        System.out.println("Wprowadź wynik 2. testu: ");
        double test2 = keyboard.nextDouble();
        System.out.println("Wprowadź wynik 3. testu: ");
        double test3 = keyboard.nextDouble();
        double avg = (test1 + test2 + test3)/3;
        System.out.println("Wynik 1. testu: " + test1 +", wynik 2. testu: " + test2 + ", wynik 3. testu: " + test3 + ", średnia: " + avg);
    }
}
