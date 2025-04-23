package exercicios.devsuperior.arrays.mediapares;

import java.util.Locale;
import java.util.Scanner;

public class MediaPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int qtdNumeros, qtdNumerosInteiros = 0;
        int soma = 0;
        double media;

        System.out.print("Informe a quantidade de números: ");
        qtdNumeros = scanner.nextInt();

        int[] vetorNumerosInteiros = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.print("Informe um número: ");
            vetorNumerosInteiros[i] = scanner.nextInt();
        }

        for (int i = 0; i < qtdNumeros; i++) {
            if (vetorNumerosInteiros[i] % 2 == 0) {
                soma += vetorNumerosInteiros[i];
                qtdNumerosInteiros++;
            }
        }

        media = (double) soma / qtdNumerosInteiros;

        if (media > 0) {
            System.out.printf("Média dos pares: %.1f", media);
        } else {
            System.out.println("Nenhum par!");
        }

        scanner.close();
    }
}
