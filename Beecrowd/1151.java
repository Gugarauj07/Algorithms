import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);
        int N = ler.nextInt();
        int X = 0, Y = 0, TEMP;
        for (int i = 0; i < N; i++) 
        {
            if (i == 0) X = 0;
            else if (i == 1) {
                X = 1;
                Y = 0;
            }
            else
            {
                TEMP = X;
                X += Y;
                Y = TEMP;
            }
            if (i == N-1) System.out.printf("%d\n", X);
            else System.out.printf("%d ", X);
        }
        ler.close();
    }
}
