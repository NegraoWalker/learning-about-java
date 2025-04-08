package conteudo2.encapsulamento;

//Principais Benefícios Neste Exemplo:
    //Proteção de Dados: Ninguém pode alterar saldo diretamente, evitando valores negativos.
    //Controle Centralizado: Toda lógica de depósito/saque está na classe, facilitando manutenção.
    //Flexibilidade: Se novas regras surgirem (ex.: taxa de saque), basta modificar sacar().
    //Abstração: O usuário da classe não precisa saber como o saldo é armazenado internamente.

public class ContaBancaria {
    // Atributos PRIVADOS (acessíveis apenas dentro da classe)
    private String titular;
    private double saldo;
    private int numeroConta;

    // Construtor (inicializa os atributos de forma controlada)
    public ContaBancaria(String titular, int numeroConta) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = 0.0; // Saldo inicia em zero
    }

    // ===== MÉTODOS PÚBLICOS PARA INTERAÇÃO SEGURA =====

    // Getter para saldo (apenas leitura)
    public double getSaldo() {
        return saldo;
    }

    // Getter para titular (apenas leitura)
    public String getTitular() {
        return titular;
    }

    // Getter para número da conta (apenas leitura)
    public int getNumeroConta() {
        return numeroConta;
    }

    // Método para DEPOSITAR (com validação)
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    // Método para SACAR (com validação)
    public boolean sacar(double valor) {
        if (valor > 0 && saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
            return true; // Saque bem-sucedido
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
            return false; // Saque falhou
        }
    }

    // Método para exibir informações (seguro e formatado)
    public void exibirInformacoes() {
        System.out.println("Titular: " + titular);
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Saldo: R$" + saldo);
    }
}
