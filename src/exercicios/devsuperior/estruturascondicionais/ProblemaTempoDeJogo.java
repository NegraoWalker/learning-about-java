package exercicios.devsuperior.estruturascondicionais;

import java.util.Scanner;

public class ProblemaTempoDeJogo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a hora inicial do jogo: ");
        int horaInicial = scanner.nextInt();
        System.out.println("Informe a hora final do jogo: ");
        int horaFinal = scanner.nextInt();
        int tempoJogo = 0;

        if (horaInicial > horaFinal) {
            tempoJogo = 24 - horaInicial + horaFinal;
        } else if (horaInicial < horaFinal) {
            tempoJogo = horaFinal - horaInicial;
        } else {
            tempoJogo = 24;
        }
        System.out.println("O jogo durou " + tempoJogo + " hora(s)");
        scanner.close();
    }
}

