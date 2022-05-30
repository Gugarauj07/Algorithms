import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Scanner ler = new Scanner(System.in);
        String[] dia_inicio = ler.nextLine().split(" ");
        String[] hora_inicio = ler.nextLine().replaceAll(" ", "").split(":");
        String[] dia_fim = ler.nextLine().split(" ");
        String[] hora_fim = ler.nextLine().replaceAll(" ", "").split(":");

        int diaInicial = Integer.parseInt(dia_inicio[1]);
        int horaInicial = Integer.parseInt(hora_inicio[0]);
        int minutoInicial = Integer.parseInt(hora_inicio[1]);
        int segundoInicial = Integer.parseInt(hora_inicio[2]);
        int diaFinal = Integer.parseInt(dia_fim[1]);
        int horaFinal = Integer.parseInt(hora_fim[0]);
        int minutoFinal = Integer.parseInt(hora_fim[1]);
        int segundoFinal = Integer.parseInt(hora_fim[2]);
        int totalDias = 0, totalHoras = 0, totalMinutos = 0, totalSegundos = 0;

        int tempo_inicial = segundoInicial + minutoInicial*60 + horaInicial*60*60 + diaInicial*24*60*60;
        int tempo_final = segundoFinal + minutoFinal*60 + horaFinal*60*60 + diaFinal*24*60*60;
        int dif = tempo_final - tempo_inicial;

        totalDias = (int) dif / (24*60*60);
        dif %= (24*60*60);
        totalHoras = (int) dif / (60*60);
        dif %= (60*60);
        totalMinutos = (int) dif / 60;
        dif %= 60;
        totalSegundos = (int) dif;

                
        System.out.printf("%d dia(s)\n", totalDias);
        System.out.printf("%d hora(s)\n", totalHoras);
        System.out.printf("%d minuto(s)\n", totalMinutos);
        System.out.printf("%d segundo(s)\n", totalSegundos);
        ler.close();
    }
}