import java.util.Scanner;

public class Zadanie13 {
    public static void main(String[] args) {
        int cookiesinpackage = 40;
        int portions = 10;
        int calloriesinportion = 300;
        int cookiesperportion = cookiesinpackage/portions;
        double calloriespercookie = calloriesinportion/cookiesperportion;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę zjedzonych ciasteczek: ");
        int cookies = keyboard.nextInt();
        double callories = cookies * calloriespercookie;
        System.out.println("Skonsumowałeś "+ callories + " kalorii");

    }
}
