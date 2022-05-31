import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);
        
        int total = 0;
        int X = ler.nextInt();
        int Y = ler.nextInt();
        for (int i = Y+1; i < X; ++i) {
            if (i % 2 != 0) total+=i;
        }
        System.out.println(total);
        ler.close();
    }
}
