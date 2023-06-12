import java.util.Scanner;

public class Petle5 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj łańcuch znaków:");
        String line = keyboard.nextLine();
        System.out.println("Podaj znak do wyszukania:");
        char sign = keyboard.nextLine().charAt(0);
        int count = 0;
        for(int i = 0; i < line.length(); i++){
            if(line.charAt(i)==sign){
                count++;
            }
        }
        System.out.println("Znak '"+sign+"' pojawia się w łańcuchu "+count+" razy");
    }
}
