package exercicios.devsuperior.arrays.negativos;

import java.util.Locale;
import java.util.Scanner;

public class Negativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Quantos números voce vai digitar? ");
        int n = scanner.nextInt();
        // Vetor para armazenar os números
        int[] vetor = new int[n];
        // Leitura dos números
        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = scanner.nextInt();
        }
        // Impressão dos negativos
        System.out.println("NUMEROS NEGATIVOS:");
        for (int i = 0; i < n; i++) {
            if (vetor[i] < 0) {
                System.out.println(vetor[i]);
            }
        }
        scanner.close();
    }
}