import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProstokatMain {
    double a;
    double b;


    public static void main(String[] args) {
        Prostokat prostokat = new Prostokat();
        prostokat.readSize(3, 5);
        prostokat.print();
    }
}





