import java.util.Scanner;

public class Zadanie17 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cenę posiłku: ");
        double meal = keyboard.nextDouble();
        double tax = meal * 0.0675;
        double tip = (meal + tax) * 0.2;
        double sum = meal + tax + tip;
        System.out.println("Cena posiłku to: "+ meal +", podatek: "+ tax +", napiwek: "+ tip + ", czyli w sumie: "+ sum);
    }
}
