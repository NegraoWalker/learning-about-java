package avancado.generics.exemplo4_wildcards;

import java.math.BigDecimal;

public class RelatorioVendas extends Relatorio {
    private final BigDecimal totalVendas;

    public RelatorioVendas(BigDecimal totalVendas) {
        super("Relatório de Vendas");
        this.totalVendas = totalVendas;
    }
    @Override
    public String gerarConteudo() {
        return "Total de vendas: R$ " + totalVendas;
    }
}
