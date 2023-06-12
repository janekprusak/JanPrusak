import java.util.Scanner;

public class Petle2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj szybkość pojazdu w km/h:");
        double v = keyboard.nextDouble();
        System.out.println("Podaj czas podróży w godzinach:");
        int h = keyboard.nextInt();
        int s = 0;
        if(h>=1 && v>=0){
            System.out.println("Przebyta droga:");
            for(int i = 1; i<=h; i++){
                s+=v;
                System.out.println(i+"h "+s+"km");
            }
        }else{
            System.out.println("Niepoprawne dane wejściowe!");
        }
    }
}
