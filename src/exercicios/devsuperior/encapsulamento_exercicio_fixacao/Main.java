package exercicios.devsuperior.encapsulamento_exercicio_fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int numeroDaConta;
        String nomeDoTitularDaConta;
        char respostaDepositoInicial;

        System.out.println("Informe o número da conta: ");
        numeroDaConta = scanner.nextInt();

        System.out.println("Informe o nome do titular da conta: ");
        nomeDoTitularDaConta = scanner.nextLine();

        System.out.println("Você deseja efetuar um depósito inicial: (S/N)");
        respostaDepositoInicial = scanner.next().charAt(0);


        scanner.close();
    }
}
