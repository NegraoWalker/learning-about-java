package exercicios.devsuperior.interfaces.fixacao;

import java.time.LocalDate;

public class Parcela {
    private LocalDate dataDeVencimento;
    private Double quantia;

    public Parcela() {
    }

    public Parcela(LocalDate dataDeVencimento, Double quantia) {
        this.dataDeVencimento = dataDeVencimento;
        this.quantia = quantia;
    }

    public LocalDate getDataDeVencimento() {
        return dataDeVencimento;
    }

    public void setDataDeVencimento(LocalDate dataDeVencimento) {
        this.dataDeVencimento = dataDeVencimento;
    }

    public Double getQuantia() {
        return quantia;
    }

    public void setQuantia(Double quantia) {
        this.quantia = quantia;
    }
}
