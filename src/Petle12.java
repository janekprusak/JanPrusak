import java.util.Scanner;

public class Petle12 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int shops[] = new int[5];
        for(int i = 0; i < 5; i++){
            System.out.println("Podaj dzisiejszą wartość sprzedaży dla sklepu nr "+(i+1)+":");
            shops[i]=keyboard.nextInt();
        }
        System.out.println("WYKRES SŁUPKOWY Z POZIOMEM SPRZEDAŻY");
        for(int i = 0; i < 5; i++){
            System.out.print("Sklep nr "+(i+1)+":");
            while(shops[i]>=100){
                System.out.print("*");
                shops[i]-=100;
            }
            System.out.println("");
        }
    }
}
