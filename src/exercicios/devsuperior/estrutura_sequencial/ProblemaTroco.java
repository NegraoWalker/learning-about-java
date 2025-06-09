package exercicios.devsuperior.estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTroco {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o preço unitário do produto: ");
        double precoUnitarioProduto = scanner.nextDouble();
        System.out.println("Informe a quantidade requisitada: ");
        int quantidadeDoProdutoRequisitada = scanner.nextInt();
        System.out.println("Informe o valor em dinheiro do pagamento: ");
        double valorEmDinheiroPagamento = scanner.nextDouble();

        double troco = valorEmDinheiroPagamento - (precoUnitarioProduto * quantidadeDoProdutoRequisitada);
        System.out.printf("Troco: R$ %.2f", troco);
        scanner.close();
    }
}
