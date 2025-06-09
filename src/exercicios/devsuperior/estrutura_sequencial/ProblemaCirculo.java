package exercicios.devsuperior.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaCirculo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor do raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = Math.PI * Math.pow(raio,2);
        System.out.printf("Área do círculo: %.3f", area);

        scanner.close();
    }
}
