import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Petle22 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String[] images = {"Wiśnie", "Pomarańcze", "Śliwki", "Dzwonki", "Melony", "Bary"};
        String want;
        int rand1, rand2, rand3, money, moneysum = 0, win, winsum =0;
        do {
            System.out.println("Jaką kwotę chcesz postawić?");
            money = keyboard.nextInt();
            moneysum += money;
            rand1 = ThreadLocalRandom.current().nextInt(0, 6);
            rand2 = ThreadLocalRandom.current().nextInt(0, 6);
            rand3 = ThreadLocalRandom.current().nextInt(0, 6);
            System.out.println(images[rand1] + " " + images[rand2] + " " + images[rand3]);
            if (rand1 != rand2 && rand1 != rand3 && rand2 != rand3) {
                win = 0;
                System.out.println("Wygrałeś 0zł");
            } else if (rand1 == rand2 && rand1 == rand3) {
                win = money * 3;
                System.out.println("Wygrałeś " + win +"zł");
            } else {
                win = money * 2;
                System.out.println("Wygrałeś " + win + "zł");
            }
            winsum+=win;
            keyboard.nextLine();
            System.out.println("Czy chcesz zagrać ponownie?");
            want = keyboard.nextLine();
        }while(want.equals("Tak") || want.equals("tak"));
        System.out.println("Łącznie wydałeś "+moneysum+"zł,a wygrałeś "+winsum+"zł");
        if(moneysum > winsum){
            System.out.println("Straciłeś "+(moneysum-winsum)+"zł");
        }else{
            System.out.println("Wygrałeś "+(winsum-moneysum)+"zł");
        }
    }
}
