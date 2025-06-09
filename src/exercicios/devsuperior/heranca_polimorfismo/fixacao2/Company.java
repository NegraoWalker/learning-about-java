package exercicios.devsuperior.heranca_polimorfismo.fixacao2;

public class Company extends TaxPayer{
    private Integer numberOfEmployees;

    public Company() {
    }
    public Company(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }
    public Company(String name, Double anualIncome, Integer numberOfEmployees) {
        super(name, anualIncome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public Integer getNumberOfEmployees() {
        return numberOfEmployees;
    }
    public void setNumberOfEmployees(Integer numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (this.numberOfEmployees > 10) {
            return 0.14 * getAnualIncome();
        }
        return 0.16 * getAnualIncome();
    }
}
