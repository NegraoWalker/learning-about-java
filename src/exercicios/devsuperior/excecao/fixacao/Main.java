package exercicios.devsuperior.excecao.fixacao;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Enter account data:");

            System.out.print("Number: ");
            int number = scanner.nextInt();
            scanner.nextLine(); // Consumir a quebra de linha pendente

            System.out.print("Holder: ");
            String holder = scanner.nextLine();

            System.out.print("Initial balance: ");
            double balance = scanner.nextDouble();

            System.out.print("Withdraw limit: ");
            double withdrawLimit = scanner.nextDouble();

            // Instanciando a conta
            Account account = new Account(number, holder, balance, withdrawLimit);

            // Solicitando saque
            System.out.print("Enter amount for withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);

            System.out.printf("New balance: %.2f%n", account.getBalance());
        }
        catch (AmountException e) {
            System.out.println(e.getMessage());
        }
        catch (RuntimeException e) {
            System.out.println("Unexpected error: " + e.getMessage());
        }
        finally {
            scanner.close();
        }
    }
}
