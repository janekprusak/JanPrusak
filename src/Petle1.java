import java.util.Scanner;

public class Petle1 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj dodatnią niezerową liczbę całkowitą:");
        int target = keyboard.nextInt();
        int sum = 0;
        for(int i = 0; i <= target; i++){
            sum+=i;
        }
        System.out.println("Suma liczb całkowitych od 0 do "+target+" to: "+sum);
    }
}
