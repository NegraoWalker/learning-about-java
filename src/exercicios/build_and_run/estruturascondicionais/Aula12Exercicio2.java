package exercicios.build_and_run.estruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Aula12Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        double x = scanner.nextDouble();
        System.out.println("Digite o valor de Y: ");
        double y = scanner.nextDouble();

        System.out.println("Qual operação você deseja realizar? [ - , +, * ou / ]");
        char caractere = scanner.next().charAt(0);
        double resultadoOperacao;

        switch (caractere) {
            case '+':
                resultadoOperacao = x + y;
                System.out.printf("%.2f + %.2f = %.2f", x, y, resultadoOperacao);
                break;
            case '-':
                resultadoOperacao = x - y;
                System.out.printf("%.2f - %.2f = %.2f", x, y, resultadoOperacao);
                break;
            case '*':
                resultadoOperacao = x * y;
                System.out.printf("%.2f * %.2f = %.2f", x, y, resultadoOperacao);
                break;
            case '/':
                resultadoOperacao = x / y;
                System.out.printf("%.2f / %.2f = %.2f", x, y, resultadoOperacao);
                break;
        }

        scanner.close();
    }
}
