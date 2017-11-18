import java.util.Random;
import java.util.Scanner;

public class LosowanieWymiarowe {
    int a, b;
    int array[][];

    public void rozmiarTablicy(int a, int b) {
        this.a = a;
        this.b = b;
        array = new int[a][b];

    }

    public void rozmiarTablicy() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (a > 0) {
                System.out.println("Wpisz rozmair tablicy");
                int rozmiar1 = scanner.nextInt();
                break;
            }
        } catch (Exception e) {
            System.out.println("Wpisałeś nieporawną liczbę");
        }
        try {
            while (b > 0) {
                System.out.println("Wpisz rozmair tablicy");
                int rozmiar2 = scanner.nextInt();
                break;
            }
        } catch (Exception e) {
            System.out.println("Wpisałeś nieporawną liczbę");
        }

    }

    public void wypełnijTablic(int min, int max) {
        Random generator = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                array[i][j] = generator.nextInt(max - min + 1) + min;
            }

        }


    }

    public void show() {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                System.out.print(array[i][j] + "\t");

            }
            System.out.println();

        }

    }

    public void showWiersz(int wiersz) {
        System.out.println();
        System.out.println("\t" + "wyświetl wiersz");
        for (int i = 0; i < b; i++) {

            System.out.print(array[i][wiersz] + "\t");

        }

    }


    public void showColum(int kolumna) {
        System.out.println("\t" + "wyśtiela kolumne");
        for (int i = 0; i < b; i++) {

            System.out.print(array[kolumna][i] + "\t");
            System.out.println();

        }

    }


    public void sumaWTablicy() {
        int[] temp = new int[b];

        for (int i = 0; i < a; i++) {
            int suma = 0;

            for (int j = 0; j < b; j++) {

                System.out.print(array[i][j] + "\t");
                suma += array[i][j];
                temp[j] += array[i][j];
                System.out.print( temp[j]+"\t");
            }
            int sumat=0;
            for (int j = 0; j <a ; j++) {
                System.out.print(temp[j]+"\t");
                sumat+=temp[j];
            }
            System.out.print("\t"+sumat);

            }

        }
    }





