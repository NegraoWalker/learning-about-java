package conteudo3.interfaces.exemplo_default_methods;

public class BrazilInterestService implements InterestService{
    private double interestRate;

    public BrazilInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
