import java.util.Scanner;

public class Petle7 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczę pięter:");
        int floors = keyboard.nextInt();
        int rooms = 0, occupiedrooms =0, roomsperfloor, occupiedroomsperfloor;
        if(floors<1){
            System.out.println("Wprowadzono niepoprawne dane!");
        }else{
            for(int i = 1; i <= floors; i++){
                do{
                    System.out.println("Podaj liczbę pokoi na "+i+". piętrze");
                    roomsperfloor = keyboard.nextInt();
                    if(roomsperfloor<10){
                        System.out.println("Za mało poki na piętrze!");
                    }else{
                        rooms+=roomsperfloor;
                    }
                }while(roomsperfloor<10);
                do{
                    System.out.println("Podaj liczbę zajętych pokoi na "+i+". piętrze");
                    occupiedroomsperfloor = keyboard.nextInt();
                    if(occupiedroomsperfloor>roomsperfloor){
                        System.out.println("Niepoprawne dane!");
                    }else{
                        occupiedrooms+=occupiedroomsperfloor;
                    }
                }while(occupiedroomsperfloor>roomsperfloor);

            }
            double occupancy = (double) occupiedrooms/rooms;
            System.out.println("Łączna liczba pokoi w hotelu to: "+rooms+", a zajętych jest "+occupiedrooms);
            System.out.println("Obłożenie wynosi: "+occupancy);
        }
    }
}
