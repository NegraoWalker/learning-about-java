package exercicios.devsuperior.composicao_enumeracao.fixacao;

public enum OrderStatus {
    PENDING_PAYMENT(0), //PAGAMENTO PENDENTE
    PROCESSING(1), //PROCESSANDO
    SHIPPED(2), //ENVIADO
    DELIVERED(3); //ENTREGUE

    OrderStatus(int i) {
    }
}
