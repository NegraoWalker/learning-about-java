package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaValidacaoDeNota {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double primeiraNota;
        double segundaNota;
        double somaNotas = 0;
        double mediaNotas;

        do {
            System.out.println("Digite a primeira nota: ");
            primeiraNota = scanner.nextDouble();
            if (primeiraNota < 0 || primeiraNota > 10) {
                System.out.println("Valor inválido! Tente novamente: ");
                primeiraNota = scanner.nextDouble();
            }
            System.out.println("Digite a segunda nota: ");
            segundaNota = scanner.nextDouble();
            if (segundaNota < 0 || segundaNota > 10) {
                System.out.println("Valor inválido! Tente novamente: ");
                segundaNota = scanner.nextDouble();
            }
        } while ((primeiraNota < 0 || primeiraNota > 10) || (segundaNota < 0 || segundaNota > 10));

        somaNotas = primeiraNota + segundaNota;
        mediaNotas = somaNotas / 2;
        System.out.printf("Média notas: %.2f", mediaNotas);

        scanner.close();
    }
}
