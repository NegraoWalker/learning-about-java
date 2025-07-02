package exercicios.devsuperior.interfaces.fixacao;

public interface PagamentoOnline {
    Double taxaDePagamento(Double quantia);
    Double juroMensal(Double quantia, Integer numeroDeMeses);
}
