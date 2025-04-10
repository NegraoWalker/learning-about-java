package exercicios.devsuperior.encapsulamento_exercicio_fixacao;

public class Conta {
    private int numeroDaConta;
    private String nomeTitularDaConta;
    private double saldo;

    public static final double TAXA = 5.00;

    public Conta(int numeroDaConta, String nomeTitularDaConta) {
        this.numeroDaConta = numeroDaConta;
        this.nomeTitularDaConta = nomeTitularDaConta;
        this.saldo = 0.0;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getNomeTitularDaConta() {
        return nomeTitularDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setNomeTitularDaConta(String nomeTitularDaConta) {
        this.nomeTitularDaConta = nomeTitularDaConta;
    }

    public String depositar(double valor) {
        if (valor <= 0) {
            return "Valor de depósito inválido!";
        }
        saldo += valor;
        return String.format("Depósito de R$%.2f efetuado com sucesso!", valor);
    }

    public String sacar(double valor) {
        saldo -= valor + TAXA;
        return String.format("Saque de R$%.2f efetuado com sucesso! (Taxa de R$%.2f aplicada)", valor, TAXA);
    }

    @Override
    public String toString() {
        return "Número da conta: " + numeroDaConta + "\n"
                + "Nome do titular: " + nomeTitularDaConta + "\n"
                + "Saldo: R$" + String.format("%.2f", saldo);
    }
}