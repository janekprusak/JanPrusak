public class Zadanie19 {
    public static void main(String[] args) {
        int people = 12467;
        double onedrink = people * 0.14;
        double citrus = onedrink * 0.64;
        System.out.println("Liczba osób pijących przynajmniej jeden napój energetyczny dzinnie: "+ Math.round(onedrink) + ", liczba osób preferujących smak cytrusowy: " +
                Math.round(citrus));

    }
}
