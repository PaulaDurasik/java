import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Prostokat {
    private double boka,bokb;

    public void readSize(int boka, int bokb){
        this.boka=boka;
        this.bokb=bokb;

    }


    public static void readSize() {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));



        while (true) {
            try {
                System.out.println("Podaj bok a: ");
                String a1 = br.readLine();
                double boka = Integer.parseInt(a1);
                if(boka<0){
                    System.out.println("wpisałeś liczbę uejmną");}
                break;
            } catch (Exception e) {
                System.out.println("źle napisałeś liczbę A, wpisz ją jeszcze raz");
            }
        }
        while (true) {
            try {
                System.out.println("Podaj bok b: ");
                String b1 = br.readLine();
                double bokb = Integer.parseInt(b1);
                if(bokb<0){System.out.println("wpisałeś liczbę uejmną");}
                break;
            } catch (Exception e) {
                System.out.println("źle napisałeś liczbę B, wpisz ją jeszcze raz");
            }
        }
    }


    public void wczytanieJakoParametr(double boka,double bokb){
        this.boka=boka;
        this.bokb=bokb;



    }

    void print(){
        print( "*");

    }


    void print(String znak) {
        for (int i = 0; i < boka; i++) {
            for (int j = 0; j < bokb; j++) {
                System.out.print(znak);

            }
            System.out.println();
        }
    }

}
