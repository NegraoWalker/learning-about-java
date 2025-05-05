package exercicios.devsuperior.desafios.contribuintes;

public class TaxPayer { //PagadorDeImpostos
    //Atributos:
    private double salaryIncome; //renda salarial
    private double servicesIncome; //renda de serviços
    private double capitalIncome; //renda de capital
    private double healthSpending; //gastos com saúde
    private double educationSpending; //gastos com educação

    //Métodos:
    public TaxPayer() {
    }

    public TaxPayer(double salaryIncome, double servicesIncome, double capitalIncome, double healthSpending, double educationSpending) {
        this.salaryIncome = salaryIncome;
        this.servicesIncome = servicesIncome;
        this.capitalIncome = capitalIncome;
        this.healthSpending = healthSpending;
        this.educationSpending = educationSpending;
    }

    //Getter and Setter:
    public double getSalaryIncome() {
        return salaryIncome;
    }

    public void setSalaryIncome(double salaryIncome) {
        this.salaryIncome = salaryIncome;
    }

    public double getServicesIncome() {
        return servicesIncome;
    }

    public void setServicesIncome(double servicesIncome) {
        this.servicesIncome = servicesIncome;
    }

    public double getHealthSpending() {
        return healthSpending;
    }

    public void setHealthSpending(double healthSpending) {
        this.healthSpending = healthSpending;
    }

    public double getCapitalIncome() {
        return capitalIncome;
    }

    public void setCapitalIncome(double capitalIncome) {
        this.capitalIncome = capitalIncome;
    }

    public double getEducationSpending() {
        return educationSpending;
    }

    public void setEducationSpending(double educationSpending) {
        this.educationSpending = educationSpending;
    }

    //Especificos da classe:
    public double salaryTax() { //imposto sobre salário
        if (this.salaryIncome < 3000.00) {
            return 0.0;
        } else if (this.salaryIncome >= 3000.00 && this.salaryIncome < 5000.00) {
            return this.salaryIncome * 0.1;
        } else if (this.salaryIncome >= 5000.00) {
            return this.salaryIncome * 0.2;
        }
        return 0.0;
    }

    public double servicesTax() { //imposto sobre serviços
        return this.servicesIncome * 0.15;
    }

    public double capitalTax() { //imposto sobre capital
        return this.capitalIncome * 0.2;
    }

    public double grossTax() { //imposto bruto
        return this.salaryTax() + this.servicesTax() + this.capitalTax();
    }

    public double taxRebate() { //abatimento/restituição do imposto
        return 0.0;
    }

    public double netTax() { //imposto líquido
        return 0.0;
    }



}
