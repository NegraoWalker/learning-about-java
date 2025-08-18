package avancado.generics.exemplo4_wildcards;

public class RelatorioEstoque extends Relatorio {
    private final int itensEmEstoque;

    public RelatorioEstoque(int itensEmEstoque) {
        super("Relatório de Estoque");
        this.itensEmEstoque = itensEmEstoque;
    }

    @Override
    public String gerarConteudo() {
        return "Itens em estoque: " + itensEmEstoque;
    }
}