import java.util.Scanner;

public class Zadanie23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź długość rzędu w metrach: ");
        double R = keyboard.nextDouble();
        System.out.println("Wprowadź ilość miejsca zajmowanego przez okratowanie w metrach: ");
        double E = keyboard.nextDouble();
        System.out.println("Wprowadź odległość między sadzonkami w metrach: ");
        double S = keyboard.nextDouble();
        int V = (int)((R - 2 * E)/S);
        System.out.println("W rzędzie zmieści się "+ V +" sadzonek.");
    }
}
