import java.util.Scanner;

public class Petle16 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj miesięczny budżet:");
        int budget = keyboard.nextInt();
        System.out.println("Podawaj kolejne wydatki, jeśl skończyłeś wpisz '0'");
        int expense, sum =0;
        do{
            expense = keyboard.nextInt();
            if(expense<0){
                System.out.println("Wydatek nie może być ujemny!");
            }else if(expense != 0){
                sum += expense;
                System.out.println("Suma wydatków: "+sum);
            }
        }while(expense!=0);
        int difference=budget-sum;
        System.out.println("Budżet: "+budget+", suma wydatków: "+sum+", różnica: "+difference);
        if(difference < 0){
            System.out.println(":(");
        }else{
            System.out.println(":)");
        }
    }
}
