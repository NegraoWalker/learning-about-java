package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaPonderada {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int casos;
        double valor1, valor2, valor3;
        double media;

        System.out.println("Quantos casos você vai digitar: ");
        casos = scanner.nextInt();
        for (int i = 0; i < casos; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite três números: ");
                valor1 = scanner.nextDouble();
                valor2 = scanner.nextDouble();
                valor3 = scanner.nextDouble();
                media = ((valor1 * 2) + (valor2 * 3) + (valor3 * 5)) / 10;
                System.out.printf("Média: %.2f\n", media);
            }
        }
        scanner.close();
    }
}
