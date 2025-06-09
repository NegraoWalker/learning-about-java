package exercicios.devsuperior.heranca_polimorfismo.fixacao2;

public class Individual extends TaxPayer{
    private Double healthExpenditures;

    public Individual() {
    }
    public Individual(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }
    public Individual(String name, Double anualIncome, Double healthExpenditures) {
        super(name, anualIncome);
        this.healthExpenditures = healthExpenditures;
    }

    public Double getHealthExpenditures() {
        return healthExpenditures;
    }
    public void setHealthExpenditures(Double healthExpenditures) {
        this.healthExpenditures = healthExpenditures;
    }

    @Override
    public Double tax() {
        if (getAnualIncome() < 20000.00) {
            return 0.15 * getAnualIncome() - 0.5 * this.healthExpenditures;
        }
        return 0.25 * getAnualIncome() - 0.5 * this.healthExpenditures;
    }
}
