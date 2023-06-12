import java.util.Scanner;

public class Petle8 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbę lat:");
        int years = keyboard.nextInt();
        if(years>1) {
            double[] rainfall = new double[12];
            double sum = 0, avg, rain;
            int months = 12*years;
            for (int y = 1; y <= years; y++) {
                for (int m = 1; m < 13; m++) {
                    do {
                        System.out.println("Podaj sumę opadów w " + m + " miesiącu " + y + " roku:");
                        rain = keyboard.nextDouble();
                        if (rain < 0) {
                            System.out.println("Wprowadzono niepoprawne dane!");
                        } else {
                            rainfall[m - 1] += rain;
                            sum += rain;
                        }
                    } while (rain < 0);
                }

            }
            System.out.println("Podczas "+ months+ " miesięcy spadło łącznie "+sum+"cm opadów\nŚrednio:");
            for(int i = 0; i < 12; i++) {
                avg = rainfall[i] / years;
                System.out.println("W " + (i + 1) + " miesiącu: " + avg + " cm");
            }
        }else{
            System.out.println("Wprowadzono niepoprawne dane!");
        }
    }
}
