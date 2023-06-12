import java.util.Scanner;
public class Zadanie2_1 {
    public static int ToDecimal(char roman){
        int dec = 0;
        switch(roman){
            case 'M':
                dec = 1000;
                break;
            case 'D':
                dec = 500;
                break;
            case 'C':
                dec = 100;
                break;
            case 'L':
                dec = 50;
                break;
            case 'X':
                dec = 10;
                break;
            case 'V':
                dec = 5;
                break;
            case 'I':
                dec = 1;
                break;
        }
        return dec;
    }
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String option ;
        while(true){
            System.out.println("Jeśli zamieniasz liczbę z dziesiętnej na rzymską wpisz \"d\", a jęsli z rzymskiej na dziesiętną wpisz \"r\"");
            option = keyboard.nextLine();
            if(option.equals("d")){
                System.out.println("Wprowadź liczbę od 1 do 3999");
                int number = keyboard.nextInt();
                if(number >= 1 && number<=3999){
                    String roman = "";
                    while(number > 0) {
                        if (number >= 1000) {
                            roman += "M";
                            number -= 1000;
                        }else if (number >= 900) {
                            roman += "CM";
                            number -= 900;
                        }else if (number >= 500) {
                            roman += "D";
                            number -= 500;
                        }else if (number >= 400) {
                            roman += "CD";
                            number -= 400;
                        }else if (number >= 100) {
                            roman += "C";
                            number -= 100;
                        }else if (number >= 90){
                            roman += "XC";
                            number -= 90;
                        }else if (number >= 50) {
                            roman += "L";
                            number -= 50;
                        }else if (number >= 40) {
                            roman += "XL";
                            number -= 40;
                        }else if (number >= 10) {
                            roman += "X";
                            number -= 10;
                        }else if(number == 9){
                            roman += "IX";
                            number -= 9;
                        }else if(number >=5){
                            roman += "V";
                            number -= 5;
                        }else if(number == 4){
                            roman += "IV";
                            number -= 4;
                        }else if(number >= 1){
                            roman += "I";
                            number--;
                        }
                    }
                    System.out.println("Liczba rzymska: " + roman);
                }else{
                    System.out.println("Podano liczbę spoza przedziału!");
                }
                keyboard.nextLine();
            }else if(option.equals("r")){
                int decimal = 0;
                System.out.println("Wprowadź liczbę rzymską od 1 do 3999");
                String fromroman = keyboard.nextLine();
                for(int i = 0; i < fromroman.length(); i++) {
                    char charat = fromroman.charAt(i);
                    if (charat == 'M' || charat == 'D' || charat == 'C' || charat == 'L' || charat == 'X' || charat == 'V' || charat == 'I'){
                        if (i == fromroman.length() - 1) {
                            decimal += ToDecimal(charat);
                        } else if (ToDecimal(charat) >= ToDecimal(fromroman.charAt(i + 1))) {
                            decimal += ToDecimal(charat);
                        } else {
                            decimal -= ToDecimal(charat);
                        }
                    }else{
                        System.out.println("To nie jest liczba rzymnska!");
                        decimal = 0;
                        break;
                    }
                }
                System.out.println("Liczba arabska: " + decimal);

            }else{
                System.out.println("Wprowadzono nieprawidłowe dane!");
            }
        }
    }
}
