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
            int entrada = ler.nextInt();
            String result = String.format("%d eh primo", entrada);
            for (int j = 2; j < entrada; j++)
            {
                if (entrada % j == 0) 
                {
                    result = String.format("%d nao eh primo", entrada);
                    break;
                }
            }
            System.out.println(result);
        }

        ler.close();
    }
}

