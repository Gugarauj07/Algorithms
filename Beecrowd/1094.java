import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);
        int N = Integer.parseInt(ler.nextLine());
        int total = 0, coelho = 0, rato = 0, sapo = 0;
        for (int i = 0; i < N; i++) 
        {
            String[] line = ler.nextLine().split(" ");
            if (line[1].equals("C")) coelho += Integer.parseInt(line[0]);
            else if (line[1].equals("R")) rato += Integer.parseInt(line[0]);
            else if (line[1].equals("S")) sapo += Integer.parseInt(line[0]);
        }
        total = coelho + rato + sapo;
        float P_coelho = (float)((coelho * 100.00) /total);
        float P_rato = (float)((rato * 100.00) /total);
        float P_sapo = (float)((sapo * 100.00) /total);
        System.out.printf("Total: %d cobaias\n", total);
        System.out.printf("Total de coelhos: %d\n", coelho);
        System.out.printf("Total de ratos: %d\n", rato);
        System.out.printf("Total de sapos: %d\n", sapo);
        System.out.printf("Percentual de coelhos: %.2f ", P_coelho);
        System.out.print("%\n");
        System.out.printf("Percentual de ratos: %.2f ", P_rato);
        System.out.print("%\n");
        System.out.printf("Percentual de sapos: %.2f ", P_sapo);
        System.out.print("%\n");
        ler.close();
    }
}
