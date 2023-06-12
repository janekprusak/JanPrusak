import java.util.Scanner;

public class Petle9 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj poczatkową liczbę organizmów:");
        int organisms = keyboard.nextInt();
        if(organisms < 2){
            System.out.println("Zbyt mała liczba początkowa orgaznizmów!");
        }else{
            System.out.println("Podaj dzienny przyrost w procentach:");
            double growth = keyboard.nextDouble()/100 + 1.0;
            if(growth < 1){
                System.out.println("Podano ujemny przyrost!");
            }else{
                System.out.println("Podaj liczbę dni:");
                int days = keyboard.nextInt();
                if(days<1){
                    System.out.println("Zbyt mała liczba dni!");
                }else{
                    for(int i = 1; i<= days; i++){
                        System.out.println("Populacja "+i+" dnia: "+ organisms);
                        organisms = (int)(organisms * growth);


                    }
                }
            }
        }
    }
}
