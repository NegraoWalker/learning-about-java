package exercicios.devsuperior.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTrocoVerificado {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("PROCESSO DE PAGAMENTO DE MERCEARIA");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe o preço unitário do produto: ");
        double precoUnitarioProduto = scanner.nextDouble();
        System.out.println("Informe a quantidade comprada do produto: ");
        int qtdCompradaProduto = scanner.nextInt();
        System.out.println("Informe o valor em dinheiro: ");
        double valorEmDinheiroDadoPeloCliente = scanner.nextDouble();

        double totalASerPago = precoUnitarioProduto * qtdCompradaProduto;

        if (totalASerPago > valorEmDinheiroDadoPeloCliente) {
            double valorRestante = totalASerPago - valorEmDinheiroDadoPeloCliente;
            System.out.printf("Dinheiro insuficiente, faltam R$%.2f reais" , valorRestante);
        } else {
            double troco = valorEmDinheiroDadoPeloCliente - totalASerPago;
            System.out.printf("Troco: R$%.2f reais", troco);
        }
        scanner.close();
    }
}
