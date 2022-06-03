import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);
        int A = ler.nextInt();
        int N = 0;

        while (N<=0)
        {
            N = ler.nextInt();
        }
        int soma = 0;
        for (int i = 0; i < N; i++) soma += A + i;
        System.out.println(soma);
        ler.close();
    }
}
