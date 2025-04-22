package exercicios.devsuperior.arrays.somavetores;

import java.util.Locale;
import java.util.Scanner;

public class SomaVetores {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int qtdDeNumeros;

        System.out.println("Informe a quantidade de números:");
        qtdDeNumeros = scanner.nextInt();

        int[] vetorA = new int[qtdDeNumeros];
        int[] vetorB = new int[qtdDeNumeros];
        int[] vetorC = new int[qtdDeNumeros];

        for (int i = 0; i < qtdDeNumeros; i++) {
            System.out.println("Informe os números do vetor A:");
            vetorA[i] = scanner.nextInt();
        }

        for (int i = 0; i < qtdDeNumeros; i++) {
            System.out.println("Informe os números do vetor B:");
            vetorB[i] = scanner.nextInt();
        }

        for (int i = 0; i < qtdDeNumeros; i++) {
            System.out.println("Informe os números do vetor C:");
            vetorC[i] = vetorA[i] + vetorB[i];
        }

        System.out.println("Vetor C:");
        for (int numero : vetorC) {
            System.out.println(numero);
        }
        scanner.close();
    }
}
