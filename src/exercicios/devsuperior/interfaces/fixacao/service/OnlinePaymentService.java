package exercicios.devsuperior.interfaces.fixacao.service;

public interface OnlinePaymentService {
    double paymentFee(double amount); //paymentFee = taxa de pagamento
    double interest(double amount, int months); //interest = juros mensal
}
