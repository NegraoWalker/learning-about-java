package conteudo3.interfaces.exemplo_default_methods;

public class USAInterestService implements InterestService{
    private double interestRate;

    public USAInterestService(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
