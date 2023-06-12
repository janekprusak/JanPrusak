import java.util.Scanner;

public class Zadanie16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź nazwę ulubionego miasta: ");
        String city = keyboard.nextLine();
        int length = city.length();
        String upper = city.toUpperCase();
        String lower = city.toLowerCase();
        char initial = city.charAt(0);
        System.out.println("Nazwa miata " + city + " ma " + length + " liter, wielkimi literami to: " + upper + ", małymi: " + lower + ", pierwsza litera to: " + initial);
    }
}
