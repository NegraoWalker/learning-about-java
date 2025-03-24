package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Scanner;

public class ProblemaParesConsecutivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int primeiroConsecutivo, segundoConsecutivo, terceiroConsecutivo, quartoConsecutivo, quintoConsecutivo;
        int soma = 0;

        do {
            System.out.println("Informe um número inteiro: ");
            numero = scanner.nextInt();
            if (numero % 2 == 0) {
                primeiroConsecutivo = numero;
                segundoConsecutivo = numero + 2;
                terceiroConsecutivo = numero + 4;
                quartoConsecutivo = numero + 6;
                quintoConsecutivo = numero + 8;
            } else {
                primeiroConsecutivo = numero + 1;
                segundoConsecutivo = primeiroConsecutivo + 2;
                terceiroConsecutivo = segundoConsecutivo + 2;
                quartoConsecutivo = terceiroConsecutivo + 2;
                quintoConsecutivo = quartoConsecutivo + 2;
            }
            if (numero != 0) {
                soma = primeiroConsecutivo + segundoConsecutivo + terceiroConsecutivo + quartoConsecutivo + quintoConsecutivo;
                System.out.println("Soma: " + soma);
            }
        } while (numero != 0);
        scanner.close();
    }
}

/*
    PAR: Soma dos 5 pares consecutivos incluindo
    4 => 4 + 6 + 8 + 10 + 12 = 40
    ÍMPAR: Soma dos 5 pares consecutivos
    11 => 12 + 14 + 16 + 18 + 20 = 80
 */