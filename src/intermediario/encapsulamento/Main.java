package intermediario.encapsulamento;

public class Main {
    public static void main(String[] args) {
        // Criando uma conta
        ContaBancaria contaDoJoao = new ContaBancaria("João Silva", 12345);

        // Usando métodos públicos para interagir
        contaDoJoao.depositar(1000); // Depósito válido
        contaDoJoao.sacar(300);      // Saque válido
        contaDoJoao.sacar(800);      // Falha: saldo insuficiente

        // Acessando informações via getters
        System.out.println("Saldo atual: R$" + contaDoJoao.getSaldo());

        // Exibindo informações formatadas
        contaDoJoao.exibirInformacoes();
    }
}

