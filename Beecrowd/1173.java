import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        int V = ler.nextInt();

        int[] Array = new int[10];
        Array[0] = V;

        for (int i = 1; i < 10; i++) Array[i] = Array[i-1] * 2;
        
        for (int i = 0; i < 10; i++) System.out.println(String.format("N[%d] = %d", i, Array[i]));

        ler.close();
    }
}

