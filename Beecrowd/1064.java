import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in).useLocale(Locale.ENGLISH);;
        
        int positivos = 0;
        double total = 0, entrada;

        for (int i = 0; i < 6; i++) {
            entrada = ler.nextDouble();
            if (entrada > 0) {
                total += entrada;
                positivos++;
            }
        }
        System.out.println(String.format("%d valores positivos", positivos));
        System.out.println(String.format("%.1f", total/positivos));
        ler.close();
    }
}
