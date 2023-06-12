import java.util.Scanner;

public class Zadanie12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź liczbę przejechanych kilometrów: ");
        double km = keyboard.nextDouble();
        System.out.println("Wprowadż liczbę litrów paliwa: ");
        double fuel = keyboard.nextDouble();
        double kmperlitre = km/fuel;
        System.out.println("Na litrze przejechano średnio "+ kmperlitre+" km.");

    }
}
