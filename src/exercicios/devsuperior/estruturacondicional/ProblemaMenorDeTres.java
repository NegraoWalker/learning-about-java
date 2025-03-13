package exercicios.devsuperior.estruturacondicional;

import java.util.Scanner;

public class ProblemaMenorDeTres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o primeiro valor: ");
        int valor1 = scanner.nextInt();
        System.out.println("Informe o segundo valor: ");
        int valor2 = scanner.nextInt();
        System.out.println("Informe o terceiro valor: ");
        int valor3 = scanner.nextInt();

        int menorValor = valor1;

        if (valor2 < valor1 && valor2 < valor3) {
            menorValor = valor2;
        }

        if (valor3 < valor1 && valor3 < valor2) {
            menorValor = valor3;
        }

        System.out.println("Meno valor: " + menorValor);

        scanner.close();
    }
}
