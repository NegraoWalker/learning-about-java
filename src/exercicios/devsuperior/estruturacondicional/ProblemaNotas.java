package exercicios.devsuperior.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaNotas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("------------------------------------------------------------------");
        System.out.println("SISTEMA DE LEITURA DE NOTAS ESCOLARES:");
        System.out.println("------------------------------------------------------------------");
        System.out.println("Digite a primeira nota do aluno: ");
        double primeiraNota = scanner.nextDouble();
        System.out.println("Digite a segunda nota do aluno: ");
        double segundaNota = scanner.nextDouble();

        double mediaNotas = primeiraNota + segundaNota / 2;
        System.out.printf("Média final do aluno: %.1f\n", mediaNotas);
        if (mediaNotas < 60.00) {
            System.out.println("Reprovado!");
        }

        scanner.close();
    }
}
