import java.util.concurrent.ThreadLocalRandom;

public class Petle21 {
    public static void main(String[] args) {
        int randomcomp, randomuser, userpoints = 0, comppoints = 0;
        for(int i = 0; i < 10; i++){
            randomcomp = ThreadLocalRandom.current().nextInt(1, 7);
            randomuser = ThreadLocalRandom.current().nextInt(1, 7);
            System.out.println("Komputer wyrzucił "+randomcomp+", a użytkownik "+randomuser);
            if(randomuser > randomcomp){
                userpoints++;
            }else if(randomcomp > randomuser){
                comppoints++;
            }
        }
        if(userpoints > comppoints){
            System.out.println("Wygrał użytkownik!");
        }else if(userpoints == comppoints) {
            System.out.println("REMIS");
        }else{
            System.out.println("Wygrał komputer");
        }
        System.out.println(userpoints +":"+ comppoints);
    }
}
