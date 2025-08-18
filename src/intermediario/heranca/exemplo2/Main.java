package intermediario.heranca.exemplo2;

public class Main {
    public static void main(String[] args) {
      Account account = new Account(001, "Gabriel", 1000.00);
      SavingsAccount savingsAccount = new SavingsAccount(002, "Bruno", 1000.00, 0.01);
      BusinessAccount businessAccount = new BusinessAccount(003, "Amiguinho", 1000.00, 500.00);

      account.withdraw(200.00);
      savingsAccount.withdraw(200.00);
      businessAccount.withdraw(200.00);

      System.out.println(account.getBalance());
      System.out.println(savingsAccount.getBalance());
      System.out.println(businessAccount.getBalance());
    }
}
