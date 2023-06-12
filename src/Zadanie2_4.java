import java.util.Scanner;

public class Zadanie2_4 {
    public static int Grade(double percent){
        int grade;
        if(percent < 60){
            grade = 1;
        }else if(percent <= 69){
            grade = 2;
        }else if(percent <= 79){
            grade = 3;
        }else if(percent <= 89){
            grade = 4;
        }else{
            grade = 5;
        }
        return grade;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Wprowadź liczbę testów: ");
        int testnumber = keyboard.nextInt();
        double percentsum = 0;
        double gradesum = 0;
        double[] tests = new double[testnumber];
        int[] grades = new int[testnumber];
        for(int i = 0; i < testnumber; i++){
            do {
                System.out.println("Wprowadź wynik " + (i + 1) + ". testu w procentach: ");
                tests[i] = keyboard.nextDouble();
                if(tests[i]<0 || tests[i]>100){
                    System.out.println("Niepoprawny wynik!");
                }
            }while(tests[i]<0 || tests[i]>100);
            grades[i] = Grade(tests[i]);
            System.out.println("Ocena z testu: "+ grades[i]);
            percentsum+=tests[i];
            gradesum+=grades[i];
        }
        double avgpercent = (Math.round((percentsum/testnumber) * 100.0))/100.0;
        double avggrade = (Math.round((gradesum/testnumber) * 100.0))/100.0;

        System.out.println("Średni wynik wszytkich testów to: "+ avgpercent  +"%, a średnia ocen: "+avggrade);
    }
}
