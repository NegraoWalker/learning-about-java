package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDuracao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a duração do tempo em segundos: ");
        int tempoSegundos = scanner.nextInt();
        int horas = tempoSegundos / 3600;
        int minutos = tempoSegundos % 3600 / 60;
        int segundos = tempoSegundos % 60;
        System.out.printf("%d:%d:%d", horas, minutos, segundos);
        scanner.close();
    }
}
