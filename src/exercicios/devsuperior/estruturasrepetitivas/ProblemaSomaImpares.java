package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Scanner;

public class ProblemaSomaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;
        int soma = 0;
        int inicio, fim;

        System.out.println("Digite dois números: ");
        numero1 = scanner.nextInt();
        numero2 = scanner.nextInt();

        if (numero1 > numero2) {
            inicio = numero2;
            fim = numero1;
        } else {
            inicio = numero1;
            fim = numero2;
        }

        for (int i = inicio + 1; i < fim; i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }

    System.out.println("Soma: " + soma);
    scanner.close();
    }
}

/*
    2 e 9 -> 3, 5, 7 = 15
    10 e 15 -> 11, 13 = 24
    6 e -5 -> -3 -1 1 3 5 = 5

 */