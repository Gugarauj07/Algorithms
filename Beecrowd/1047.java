import java.util.Scanner;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        Scanner ler = new Scanner(System.in);

        int hora_inicio = ler.nextInt();
        int min_inicio = ler.nextInt();
        int hora_final = ler.nextInt();
        int min_final = ler.nextInt();
        int dif, hora, min;

        if (hora_inicio < hora_final) dif = ((hora_final*60) + min_final) - ((hora_inicio*60) + min_inicio);
        else if (hora_inicio > hora_final) dif = (((hora_final+24)*60) + min_final) - ((hora_inicio*60) + min_inicio);
        else if (min_inicio < min_final) dif = ((hora_final*60) + min_final) - ((hora_inicio*60) + min_inicio);
        else dif = (((hora_final+24)*60) + min_final) - ((hora_inicio*60) + min_inicio);
        
        hora = (int) dif/60;
        min = (int) dif%60;

		System.out.println(String.format("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", hora, min));
        ler.close();
    }
}
