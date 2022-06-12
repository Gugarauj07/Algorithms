import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        int[] array = new int[20];
        int counter = 0;

        for (int i = 0; i < array.length; i++) 
        {
            array[i] = ler.nextInt();
        }
        for (int i = 19; i >= 0; --i)
        {
            System.out.printf("N[%d] = %d\n", counter, array[i]);
            counter++;
        }

        ler.close();
    }
}

