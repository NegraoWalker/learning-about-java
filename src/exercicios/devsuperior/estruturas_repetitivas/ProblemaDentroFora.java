package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Scanner;

public class ProblemaDentroFora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int valor, numero;
        int dentroIntervalo = 0;
        int foraIntervalo = 0;

        System.out.println("Quantos números você vai digitar: ");
        valor = scanner.nextInt();

        for (int i = 0; i < valor; i++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            if (numero >= 10 && numero <= 20) {
                dentroIntervalo++;
            } else {
                foraIntervalo++;
            }
        }
        System.out.println("Dentro do intervalo: " + dentroIntervalo);
        System.out.println("Fora do intervalo: " + foraIntervalo);
        scanner.close();
    }
}
