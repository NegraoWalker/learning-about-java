package conteudo2.heranca.exemplo2;

public class Account {
    private Integer number;
    private String holder;
    protected Double balance; //visível para a subclasse

    public Account() {
    }

    public Account(Integer number, String holder, Double balance) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        this.balance -= amount + 5.0;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }
}
