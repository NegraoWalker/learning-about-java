package exercicios.devsuperior.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaDardo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("DESAFIO DO ARREMESSO DO DARDO:");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe a primeira distância: ");
        double primeiraDistancia = scanner.nextDouble();
        System.out.println("Informe a segunda distância: ");
        double segundaDistancia = scanner.nextDouble();
        System.out.println("Informe a terceira distância: ");
        double terceiraDistancia = scanner.nextDouble();

        double maiorDistancia = primeiraDistancia;
        if (segundaDistancia > primeiraDistancia & segundaDistancia > terceiraDistancia) {
            maiorDistancia = segundaDistancia;
        }

        if (terceiraDistancia > primeiraDistancia & terceiraDistancia > segundaDistancia) {
            maiorDistancia = terceiraDistancia;
        }
        System.out.printf("Maior distância: %.2f", maiorDistancia);
        scanner.close();
    }
}
