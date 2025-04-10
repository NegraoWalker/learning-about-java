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
        double valor;

        System.out.println("Informe o número da conta: ");
        numeroDaConta = scanner.nextInt();

        scanner.nextLine();  // Consome o newline deixado pelo nextInt()

        System.out.println("Informe o nome do titular da conta: ");
        nomeDoTitularDaConta = scanner.nextLine();

        System.out.println("Você deseja efetuar um depósito inicial: (S/N)");
        respostaDepositoInicial = scanner.next().charAt(0);

        Conta conta = new Conta(numeroDaConta, nomeDoTitularDaConta);

        if (respostaDepositoInicial == 'S') {
            System.out.println("Informe o valor do depósito inicial: ");
            valor = scanner.nextDouble();
            conta.depositar(valor);
        }

        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println("Informe o valor do depósito: ");
        valor = scanner.nextDouble();
        conta.depositar(valor);

        System.out.println("Atualização dos dados da conta:");
        System.out.println(conta);

        System.out.println("Informe o valor de saque: ");
        valor = scanner.nextDouble();
        conta.sacar(valor);
        System.out.println(conta);

        scanner.close();
    }
}