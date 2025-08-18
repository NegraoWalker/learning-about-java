package avancado.generics.exemplo4_wildcards;

import java.math.BigDecimal;

public class RelatorioFinanceiro extends Relatorio {
    private final BigDecimal saldo;

    public RelatorioFinanceiro(BigDecimal saldo) {
        super("Relatório Financeiro");
        this.saldo = saldo;
    }

    @Override
    public String gerarConteudo() {
        return "Saldo atual: R$ " + saldo;
    }
}
