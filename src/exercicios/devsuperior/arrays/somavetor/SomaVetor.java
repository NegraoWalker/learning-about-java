package exercicios.devsuperior.arrays.somavetor;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetor {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int qtdNumeros;
        double somaNumeros = 0;
        double mediaNumeros;

        System.out.println("Informe a quantidade de números:");
        qtdNumeros = scanner.nextInt();

        double[] vetor = new double[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Informe um número:");
            vetor[i] = scanner.nextDouble();
        }

        for (double numero : vetor) {
            somaNumeros+= numero;
        }

        mediaNumeros = somaNumeros / qtdNumeros;

        System.out.print("Vetor: ");
        for (double numero : vetor) {
            System.out.printf("%.2f ", numero);
        }
        System.out.println();

        System.out.printf("Soma: %.2f\n", somaNumeros);
        System.out.printf("Média: %.2f\n", mediaNumeros);

        scanner.close();
    }
}
