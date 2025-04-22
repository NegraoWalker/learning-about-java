package exercicios.devsuperior.arrays.maiorposicao;

import java.util.Locale;
import java.util.Scanner;

public class MaiorPosicao {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int qtdDeNumeros, indiceMaiorNumero = 0;
        double maiorNumero = 0;

        System.out.println("Informe a quantidade de números:");
        qtdDeNumeros = scanner.nextInt();

        double[] vetorNumeros = new double[qtdDeNumeros];
        for (int i = 0; i < qtdDeNumeros; i++) {
            System.out.println("Digite um número:");
            vetorNumeros[i] = scanner.nextDouble();
        }

        for (int i = 0; i < qtdDeNumeros; i++) {
            if (vetorNumeros[i] > maiorNumero) {
                maiorNumero = vetorNumeros[i];
                indiceMaiorNumero = i;
            }
        }

        System.out.println("Maior número:" + maiorNumero);
        System.out.println("Posição do maior número:" + indiceMaiorNumero);
        scanner.close();
    }
}
