import java.util.Scanner;

public class Petle4 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę przepracowanych dni:");
        int days = keyboard.nextInt();
        if(days < 1){
            System.out.println("Niepoprawne dane wejściowe!");
        }else{
            double pay = 0.005, sum = 0;
            for (int i = 1; i <= days; i++) {
                pay = pay * 2;
                sum += pay;
                System.out.println(i + ". dzień - " + pay + " zł");
            }
            System.out.println("W sumie: " + sum + "zł");
        }
    }
}
