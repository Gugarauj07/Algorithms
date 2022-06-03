import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);
        int X = ler.nextInt();
        int Z = 0;

        while (Z<=X)
        {
            Z = ler.nextInt();
        }
        int count = 0, soma = 0;
        while (soma < Z)
        {
            soma += X; 
            X++; count++;
        }
        System.out.println(count);
        ler.close();
    }
}
