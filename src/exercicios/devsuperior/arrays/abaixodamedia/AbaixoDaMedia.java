package exercicios.devsuperior.arrays.abaixodamedia;

import java.util.Locale;
import java.util.Scanner;

public class AbaixoDaMedia {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        double soma = 0, media;

        System.out.println("Informe a quantidade de números:");
        n = scanner.nextInt();

        double[] vetorNumerosReais = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe um número:");
            vetorNumerosReais[i] = scanner.nextDouble();
        }

        for (double numero : vetorNumerosReais) {
            soma += numero;
        }

        media = soma / n;

        System.out.printf("Média aritmética: %.3f\n", media);

        System.out.println("Elementos que estão abaixo da média:");
        for (int i = 0; i < n; i++) {
            if (vetorNumerosReais[i] < media) {
                System.out.printf("%.1f\n", vetorNumerosReais[i]);
            }
        }

        scanner.close();
    }
}
