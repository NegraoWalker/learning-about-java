package exercicios.devsuperior.arrays.numerospares;

import java.util.Locale;
import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int qtdNumeros, qtdNumerosPares = 0;
        System.out.println("Informe a quantidade de números:");
        qtdNumeros = scanner.nextInt();
        int[] vetorNumeros = new int[qtdNumeros];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Informe um número:");
            vetorNumeros[i] = scanner.nextInt();
        }

        System.out.println("Números pares:");
        for (int numero : vetorNumeros) {
            if (numero % 2 == 0) {
                qtdNumerosPares++;
                System.out.println(numero);
            }
        }

        System.out.println("Quantidade de números pares: " + qtdNumerosPares);

        scanner.close();
    }
}
