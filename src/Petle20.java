import java.util.Scanner;

public class Petle20 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wymiar kwadratu:");
        int square = keyboard.nextInt();
        for(int i = 0; i < square; i++){
            for(int j = 0; j < square; j++){
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
