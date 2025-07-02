package exercicios.devsuperior.interfaces.fixacao;

public class PayPal implements PagamentoOnline{


    @Override
    public Double taxaDePagamento(Double quantia) {
        return 0.0;
    }

    @Override
    public Double juroMensal(Double quantia, Integer numeroDeMeses) {
        return 0.0;
    }
}
