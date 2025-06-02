package conteudo3.downcasting_upcasting;

public class Main {
    public static void main(String[] args) {
        Account account = new Account(001, "José Markus", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(002, "Thiago Onaya", 0.0, 500.00);

        Account account2 = businessAccount; //Upcasting
        Account account3 = new BusinessAccount(003, "Bruno", 0.0, 250.00); //Upcasting
        Account account4 = new SavingsAccount(004, "Gustavo", 0.0, 0.01); //Upcasting

        BusinessAccount businessAccount2 = (BusinessAccount) account; //Downcasting
        businessAccount2.loan(100.00);
    }
}
