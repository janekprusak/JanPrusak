import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Petle23 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String img = null;
        System.out.println("Podaj nazwę strony: ");
        String sitename = keyboard.nextLine();
        try {
            File createfile = new File(sitename+".html");
            if (createfile.createNewFile()) {
                System.out.println("Stworzono plik: " + createfile.getName());
            } else {
                System.out.println("Taki plik już istnieje.");
            }
        } catch (IOException e) {
            System.out.println("Błąd przy tworzeniu.");
            e.printStackTrace();
        }
        try {
            FileWriter file = new FileWriter(sitename+".html");
            System.out.println("Podaj swoje imię:");
            String name = keyboard.nextLine();
            System.out.println("Opisz się:");
            String opis = keyboard.nextLine();
            System.out.println("Podaj kolor tła po angielsku:");
            String backgroundcolour = keyboard.nextLine();
            System.out.println("Podaj kolor nagłówka po angielsku:");
            String h1colour = keyboard.nextLine();
            System.out.println("Podaj kolor opisu po angielsku:");
            String pcolour = keyboard.nextLine();
            System.out.println("Czy chcesz dodać zdjęcie?");
            String want = keyboard.nextLine();
            if(want.equals("Tak") || want.equals("tak")){
                System.out.println("Podaj nazwę zdjęcia z folderu wraz z rozszerzeniem");
                img = keyboard.nextLine();
            }
            file.write("<html><head><style>" +
                    "body{background-color:"+backgroundcolour+";}"+
                    "h1{color:"+h1colour+";}"+
                    "p{color:"+pcolour+";}"+
                    "img{max-width: 100%; height: auto}"+
                    "</style></head><body><center>" +
                    "<h1>"+name+"</h1></center><hr><p>"+opis+"</p>");
            if(want.equals("Tak") || want.equals("tak")){
                file.write("<img src=\""+img+"\"/>");
            }
            file.write("<hr></body></html>");
            file.close();
            System.out.println("Utworzono stronę!");
        } catch (IOException e) {
            System.out.println("Bład przy zapisie.");
            e.printStackTrace();
        }

    }
}
