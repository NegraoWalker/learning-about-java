package conteudo1;

import java.util.Scanner;

public class EstruturasDeRepeticaoDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Ver saldo");
            System.out.println("2. Transferir dinheiro");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Seu saldo é de R$1000,00");
                    break;
                case 2:
                    System.out.println("Transferência realizada com sucesso!");
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        } while (opcao != 3);

        scanner.close();
    }
}

