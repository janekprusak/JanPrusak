import java.util.Scanner;

public class Zadanie18 {
    public static void main(String[] args) {
        double onestockprice = 21.77;
        int stocks = 600;
        double stocksprice = onestockprice * stocks;
        double comission = stocksprice * 0.02;
        double sum = stocksprice + comission;
        System.out.println("Wartość akcji: "+ stocksprice +", prowizja:"+ comission +", czyli w sumie: "+ sum);
    }
}
