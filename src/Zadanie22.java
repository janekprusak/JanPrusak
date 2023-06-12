public class Zadanie22 {
    public static void main(String[] args) {
        int actions = 1000;
        double boughtactionprice = 32.87;
        double comission = 0.02;
        double transaction1 = actions * boughtactionprice;
        double transaction1commision = transaction1 * comission;
        double soldactionprice = 33.92;
        double transaction2 = actions * soldactionprice;
        double transaction2commission = transaction2 * comission;
        double sum = transaction2 - transaction1 - transaction1commision - transaction2commission;
        System.out.println("Kwota za zakup akcji: "+ transaction1 +", prowizja za zakup: "+ transaction1commision+
                ", kwota za sprzedaż akcji: "+ transaction2 +", prowizja za sprzedaż: "+ transaction2commission+
                ". \nW sumie Jacek zyskał: "+ sum);
    }
}
