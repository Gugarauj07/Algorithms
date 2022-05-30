import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);
        int inicio = ler.nextInt();
        int fim = ler.nextInt();

        int resultado;
        if (inicio < fim) resultado = fim - inicio;
        else resultado = (fim + 24) - inicio;

		System.out.println(String.format("O JOGO DUROU %d HORA(S)", resultado));
        ler.close();
    }
}
