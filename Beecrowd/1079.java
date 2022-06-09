import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        int N = ler.nextInt();
        for (int i = 0; i < N; i++) 
        {
            double primeiro = ler.nextDouble();
            double segundo = ler.nextDouble();
            double terceiro = ler.nextDouble();
            System.out.println(String.format("%.1f", (primeiro*2 + segundo*3 + terceiro*5)/10 ));
        }
        
        ler.close();
    }
}

