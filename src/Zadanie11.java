import java.util.Scanner;

public class Zadanie11 {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Proszę wprowadzić wartość produktu: ");
        double value = keyboard.nextDouble();
        double statetax = value * 0.04;
        double localtax = value * 0.02;
        double price = value + statetax + localtax;
        System.out.println("Wartość produktu: "+ value +", podatek stanowy: "+ statetax + ", podatek lokaly: "+ localtax + ", cena sprzedaży: "+ price);
    }
}
