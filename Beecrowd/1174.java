import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        double[] Array = new double[100];

        for (int i = 0; i < 100; i++) Array[i] = ler.nextDouble();
        for (int i = 0; i < 100; i++) if (Array[i]<=10) System.out.println(String.format("A[%d] = %.1f", i, Array[i]));

        ler.close();
    }
}

