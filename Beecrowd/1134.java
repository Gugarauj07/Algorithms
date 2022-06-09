import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);

        int alc = 0, gas = 0, die = 0;
        while (true)
        {
            int entrada = ler.nextInt();
            if (entrada < 1 || entrada >4) continue;
            else if (entrada==4) break;
            else
            {
                if (entrada==1) alc++;
                else if (entrada==2) gas++;
                else if (entrada==3) die++;
            }
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println(String.format("Alcool: %d", alc));
        System.out.println(String.format("Gasolina: %d", gas));
        System.out.println(String.format("Diesel: %d", die));
        ler.close();
    }
}

