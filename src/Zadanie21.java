import java.util.Scanner;

public class Zadanie21 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź początkową kwotę: ");
        double p = keyboard.nextDouble();
        System.out.println("Wprowadź roczną stopę oprocentowania: ");
        double r = keyboard.nextDouble();
        System.out.println("Wprowadź roczną liczbę kapitalizacji odsetek: ");
        double n = keyboard.nextDouble();
        System.out.println("Wprowadź liczbę lat: ");
        double t = keyboard.nextDouble();
        double A = p*Math.pow(1+r/n,n*t);
        System.out.println("Kwota końcowa po "+ t +" latach: "+A);
    }
}
