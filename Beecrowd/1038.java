import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int codigo = ler.nextInt();
        int quant = ler.nextInt();

        double total;
        switch (codigo) {
			case 1:	total = quant * 4.00; break;
			case 2: total = quant * 4.50; break;
			case 3: total = quant * 5.00; break;
			case 4: total = quant * 2.00; break;
			case 5: total = quant * 1.50; break;
			default: total = 0.0;
		}
		System.out.println(String.format("Total: R$ %.2f", total));
        ler.close();
    }
}
