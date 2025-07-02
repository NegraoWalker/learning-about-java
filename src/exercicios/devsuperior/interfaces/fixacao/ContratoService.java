package exercicios.devsuperior.interfaces.fixacao;

public class ContratoService {
    private PagamentoOnline pagamentoOnline;

    public ContratoService() {
    }

    public ContratoService(PagamentoOnline pagamentoOnline) {
        this.pagamentoOnline = pagamentoOnline;
    }

    public void processarContrato(Contrato contrato, Integer numeroDeParcelas) {

    }
}
