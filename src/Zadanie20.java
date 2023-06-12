import java.util.Scanner;

public class Zadanie20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        double sugarinrecipe = 1.5;
        double butterinrecipe = 1;
        double flourinrecipe = 2.75;
        int cookiesinrecipe = 48;
        double sugarpercookie = sugarinrecipe/cookiesinrecipe;
        double butterpercookie = butterinrecipe/cookiesinrecipe;
        double flourpercookie = flourinrecipe/cookiesinrecipe;
        System.out.println("Ile ciasteczek chcesz upiec?");
        int cookies = keyboard.nextInt();
        double sugar = sugarpercookie * cookies;
        double butter = butterpercookie * cookies;
        double flour = flourpercookie * cookies;
        System.out.println("Potrzebujesz:");
        System.out.println(sugar + " szklanki cukru,");
        System.out.println(butter + " szklanki masła,");
        System.out.println(flour + " szklanki mąki");


    }
}
