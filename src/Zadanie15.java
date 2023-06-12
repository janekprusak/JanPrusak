import java.util.Scanner;

public class Zadanie15 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź cenę detaliczną płytki: ");
        double retailprice = keyboard.nextDouble();
        double profit = retailprice * 0.4;
        System.out.println("Zysk ze sprzedaży to: " + profit);
    }
}
