package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Scanner;

public class ProblemaParImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, numero;
        System.out.println("Quantos números você vai digitar: ");
        n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0 && numero > 0) {
                System.out.println("Par positivo!");
            } else if (numero % 2 == 0 && numero < 0) {
                System.out.println("Par negativo!");
            } else if (numero % 2 != 0 && numero > 0) {
                System.out.println("Ímpar positivo!");
            } else if (numero % 2 != 0 && numero < 0) {
                System.out.println("Ímpar negativo!");
            } else {
                System.out.println("Nulo");
            }
        }
        scanner.close();
    }
}