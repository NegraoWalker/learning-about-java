package avancado.generics.exemplo4_wildcards;

import java.math.BigDecimal;
import java.util.List;

/**
 * Processador de relatórios que demonstra diferentes wildcards
 */
public class ProcessadorRelatorios {
    /**
     * WILDCARD UNBOUNDED (?)
     * Aceita lista de qualquer tipo de objeto
     * Usado quando só precisamos de funcionalidades básicas (size, isEmpty, etc.)
     */
    public void exibirEstatisticasBasicas(List<?> lista) {
        System.out.println("=== Estatísticas Básicas ===");
        System.out.println("Quantidade de itens: " + lista.size());
        System.out.println("Lista vazia: " + lista.isEmpty());

        // Note que não podemos acessar métodos específicos dos objetos
        // porque não sabemos qual é o tipo real
        for (Object item : lista) {
            System.out.println("Tipo do item: " + item.getClass().getSimpleName());
        }
    }

    /**
     * UPPER BOUNDED WILDCARD (? extends Relatorio)
     * Aceita listas de Relatorio ou qualquer subclasse
     * Usado para LEITURA - podemos ler como Relatorio, mas não adicionar novos itens
     */
    public void processarRelatorios(List<? extends Relatorio> relatorios) {
        System.out.println("\n=== Processando Relatórios ===");

        for (Relatorio relatorio : relatorios) {
            // Podemos chamar métodos de Relatorio porque sabemos que
            // todos os elementos são Relatorio ou suas subclasses
            System.out.println("Título: " + relatorio.getTitulo());
            System.out.println("Data: " + relatorio.getDataGeracao());
            System.out.println("Conteúdo: " + relatorio.gerarConteudo());
            System.out.println("---");
        }

        // IMPORTANTE: Não podemos adicionar elementos!
        // relatorios.add(new RelatorioVendas(BigDecimal.ZERO)); // ERRO DE COMPILAÇÃO
        // Isso protege contra corrupção de tipos
    }

    /**
     * LOWER BOUNDED WILDCARD (? super RelatorioVendas)
     * Aceita listas que podem conter RelatorioVendas ou suas superclasses
     * Usado para ESCRITA - podemos adicionar RelatorioVendas com segurança
     */
    public void adicionarRelatorioVendas(List<? super RelatorioVendas> relatorios, BigDecimal vendas) {
        System.out.println("\n=== Adicionando Relatório de Vendas ===");

        // Podemos adicionar RelatorioVendas porque sabemos que a lista
        // aceita RelatorioVendas ou suas superclasses
        RelatorioVendas novoRelatorio = new RelatorioVendas(vendas);
        relatorios.add(novoRelatorio);

        System.out.println("Relatório de vendas adicionado com sucesso!");
        System.out.println("Total na lista agora: " + relatorios.size());

        // Note que ao ler, só temos garantia de Object
        // Object primeiroItem = relatorios.get(0); // Só podemos tratar como Object
    }

    /**
     * Metodo que demonstra flexibilidade dos wildcards
     * Pode trabalhar com diferentes tipos de coleções de relatórios
     */
    public void gerarRelatorioConsolidado(List<? extends Relatorio> vendas, List<? extends Relatorio> estoque, List<? extends Relatorio> financeiro) {

        System.out.println("\n=== Relatório Consolidado ===");
        // Podemos processar diferentes tipos de listas de relatórios
        System.out.println("VENDAS (" + vendas.size() + " relatórios):");
        vendas.forEach(r -> System.out.println("  - " + r.gerarConteudo()));

        System.out.println("ESTOQUE (" + estoque.size() + " relatórios):");
        estoque.forEach(r -> System.out.println("  - " + r.gerarConteudo()));

        System.out.println("FINANCEIRO (" + financeiro.size() + " relatórios):");
        financeiro.forEach(r -> System.out.println("  - " + r.gerarConteudo()));
    }
}
