package avancado.generics.exemplo4_wildcards;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ProcessadorRelatorios processador = new ProcessadorRelatorios();

        // Criando diferentes tipos de listas
        List<RelatorioVendas> relatoriosVendas = Arrays.asList(new RelatorioVendas(new BigDecimal("10000")), new RelatorioVendas(new BigDecimal("15000")));

        List<RelatorioEstoque> relatoriosEstoque = Arrays.asList(new RelatorioEstoque(500), new RelatorioEstoque(750));

        List<RelatorioFinanceiro> relatoriosFinanceiro = List.of(new RelatorioFinanceiro(new BigDecimal("50000")));

        // Wildcards permitem flexibilidade total
        processador.exibirEstatisticasBasicas(relatoriosVendas);
        processador.processarRelatorios(relatoriosVendas); // Upper bounded
        processador.processarRelatorios(relatoriosEstoque); // Upper bounded

        // Lower bounded - podemos adicionar a lista de Relatorio ou Object
        List<Relatorio> todosRelatorios = new ArrayList<>();
        processador.adicionarRelatorioVendas(todosRelatorios, new BigDecimal("20000"));

        List<Object> listaObjetos = new ArrayList<>();
        processador.adicionarRelatorioVendas(listaObjetos, new BigDecimal("25000"));

        // Relatório consolidado com diferentes tipos
        processador.gerarRelatorioConsolidado(relatoriosVendas, relatoriosEstoque, relatoriosFinanceiro);
    }
}
