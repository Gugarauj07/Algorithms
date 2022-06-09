import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static int factorial(int num)
    {
        if (num >= 1)
            return num * factorial(num - 1);
        else
            return 1;
    }
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        int num = ler.nextInt();

        int fatorial = factorial(num);

        System.out.println(fatorial);

        ler.close();
    }
}

