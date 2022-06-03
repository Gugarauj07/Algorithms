import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void sequencia(int a, int b)
    {
        int sum = 0;
        for (int i = a; i < b + 1; i++)
        {
            System.out.printf("%d ", i);
            sum += i;
        }
        System.out.printf("Sum=%d\n", sum);
    }
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);



        while (true)
        {
            int M = ler.nextInt();
            int N = ler.nextInt();
            if (M <= 0 || N <= 0) break;

            if (M>N) sequencia(N, M);

            if (M<N) sequencia(M, N);
        }
        ler.close();
    }
}

