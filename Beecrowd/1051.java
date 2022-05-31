import java.util.Scanner;
import java.io.IOException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(new Locale("en", "US"));
        Scanner ler = new Scanner(System.in);
        
        float entrada = ler.nextFloat();
        double total = 0,imposto, pagar, pago = 0;
        if (entrada <= 2000) System.out.println("Isento");
        else
        {
            if (entrada > 4500) {
                imposto = entrada - 4500;
                pagar = imposto * 0.28;
                total += pagar;
                pago += imposto;
            }
            if (entrada > 3000.01) 
            {
                imposto = entrada - 3000 - pago;
                pagar = imposto * 0.18;
                total += pagar;
                pago += imposto;
            }
            if (entrada > 2000.01) 
            {
                imposto = entrada - 2000 - pago;
                pagar = imposto * 0.08;
                total += pagar;
                pago += imposto;
            }
            System.out.println(String.format("R$ %.2f", total));
        }
        
        
        ler.close();
    }
}
