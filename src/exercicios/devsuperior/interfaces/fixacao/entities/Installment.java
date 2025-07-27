package exercicios.devsuperior.interfaces.fixacao.entities;

import java.time.LocalDate;

//Installment = Parcela
public class Installment {
    private LocalDate dueDate; //dueDate = data de vencimento
    private Double amount; //amount = quantia

    public Installment() {
    }

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    // Getters e Setters
    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return String.format("%02d/%02d/%d - %.2f",
                dueDate.getDayOfMonth(),
                dueDate.getMonthValue(),
                dueDate.getYear(),
                amount);
    }
}
