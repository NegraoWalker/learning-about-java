package exercicios.devsuperior.interfaces.fixacao.service;

public class PaypalService implements OnlinePaymentService {

    @Override
    public double paymentFee(double amount) {
        // Taxa de pagamento de 2%
        return amount * 0.02;
    }

    @Override
    public double interest(double amount, int months) {
        // Juros compostos de 1% ao mês
        return amount * Math.pow(1.01, months) - amount;
    }
}

