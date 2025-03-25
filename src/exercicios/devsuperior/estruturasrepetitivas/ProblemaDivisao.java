package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDivisao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int n;
        int numerador, denominador;
        double divisao;

        System.out.println("Quantos casos você vai digitar: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {

            System.out.println("Entre com o numerador: ");
            numerador = scanner.nextInt();
            System.out.println("Entre com o denominador: ");
            denominador = scanner.nextInt();
            if (denominador != 0) {
                divisao = (double) numerador / denominador;
                System.out.printf("Resultado da divisão: %.2f\n", divisao);
            } else {
                System.out.println("Divisão impossível!");
            }
        }
        scanner.close();
    }
}
