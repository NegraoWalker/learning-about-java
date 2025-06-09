package exercicios.build_and_run.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class Aula12Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você gostaria de fornecer gorjeta [(S) ou (N)]?");
        char resposta = scanner.next().charAt(0);

        if (resposta == 'S') {
            System.out.println("Qual o valor da gorjeta?");
            double valorGorjeta = scanner.nextDouble();
            System.out.printf("Gorjeta de R$ %.2f realizada com sucesso!", valorGorjeta);
        } else if (resposta == 'N') {
            System.out.println("Agradecemos a visita, até a próxima!");
        }

        scanner.close();
    }
}
