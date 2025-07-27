package exercicios.devsuperior.interfaces.fixacao.service;

import exercicios.devsuperior.interfaces.fixacao.entities.Contract;
import exercicios.devsuperior.interfaces.fixacao.entities.Installment;

import java.time.LocalDate;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months) {
        // Valor básico de cada parcela (sem juros e taxa)
        double basicQuota = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            // Data de vencimento: mês atual + i meses
            LocalDate dueDate = contract.getDate().plusMonths(i);

            // Aplicar juros compostos
            double interest = onlinePaymentService.interest(basicQuota, i);
            double updatedQuota = basicQuota + interest;

            // Aplicar taxa de pagamento
            double paymentFee = onlinePaymentService.paymentFee(updatedQuota);
            double finalQuota = updatedQuota + paymentFee;

            // Criar e adicionar parcela
            contract.getInstallments().add(new Installment(dueDate, finalQuota));
        }
    }
}
