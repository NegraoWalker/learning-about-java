package conteudo3.classes_abstratas.exemplo1;


public class Main {
    public static void main(String[] args) {
//        Account account = new Account(001, "Gabriel", 1000.00); //ERRO NÃO PERMITE INSTANCIAR
        SavingsAccount savingsAccount = new SavingsAccount(002, "Bruno", 1000.00, 0.01);
        BusinessAccount businessAccount = new BusinessAccount(003, "Amiguinho", 1000.00, 500.00);
    }
}
