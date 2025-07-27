package exercicios.devsuperior.interfaces.fixacao;

import exercicios.devsuperior.interfaces.fixacao.entities.Contract;
import exercicios.devsuperior.interfaces.fixacao.entities.Installment;
import exercicios.devsuperior.interfaces.fixacao.service.ContractService;
import exercicios.devsuperior.interfaces.fixacao.service.OnlinePaymentService;
import exercicios.devsuperior.interfaces.fixacao.service.PaypalService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre os dados do contrato:");

        System.out.print("Numero: ");
        int number = scanner.nextInt();

        System.out.print("Data (dd/MM/yyyy): ");
        LocalDate date = LocalDate.parse(scanner.next(), fmt);

        System.out.print("Valor do contrato: ");
        double totalValue = scanner.nextDouble();

        System.out.print("Entre com o numero de parcelas: ");
        int months = scanner.nextInt();

        // Criar contrato
        Contract contract = new Contract(number, date, totalValue);

        // Criar serviço de pagamento
        OnlinePaymentService paymentService = new PaypalService();

        // Criar serviço de contratos
        ContractService contractService = new ContractService(paymentService);

        // Processar contrato
        contractService.processContract(contract, months);

        // Exibir parcelas
        System.out.println("Parcelas:");
        for (Installment installment : contract.getInstallments()) {
            System.out.println(installment);
        }

        scanner.close();
    }
}
