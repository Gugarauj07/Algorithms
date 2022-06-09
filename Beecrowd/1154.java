import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        int count = 0, soma = 0;

        while (true)
        {
            int entrada = ler.nextInt();
            if (entrada<0) break;
            else 
            {
                count++;
                soma += entrada;
            }
        }
        System.out.printf("%.2f\n", (float) soma/count);
        ler.close();
    }
}

