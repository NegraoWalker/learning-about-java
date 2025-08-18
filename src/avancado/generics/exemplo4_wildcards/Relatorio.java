package avancado.generics.exemplo4_wildcards;

import java.time.LocalDate;

/**
 * Sistema de relatórios que demonstra diferentes usos de wildcards
 * Este é um exemplo muito comum em sistemas corporativos
 */

// Classe base para todos os relatórios
public abstract class Relatorio {
    protected String titulo;
    protected LocalDate dataGeracao;

    public Relatorio(String titulo) {
        this.titulo = titulo;
        this.dataGeracao = LocalDate.now();
    }
    public abstract String gerarConteudo();
    public String getTitulo() {
        return titulo;
    }
    public LocalDate getDataGeracao() {
        return dataGeracao;
    }
}
