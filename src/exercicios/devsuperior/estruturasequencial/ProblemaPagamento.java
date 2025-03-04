package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaPagamento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Informe o valor por hora trabalhada: ");
        double valorHoraTrabalhada = scanner.nextDouble();
        System.out.println("Informe a quantidade de horas trabalhadas: ");
        double quantidadeHorasTrabalhadas = scanner.nextDouble();

        double valorPagamentoFuncionario = valorHoraTrabalhada * quantidadeHorasTrabalhadas;
        System.out.printf("O valor do pagamento do(a) %s é R$ %.2f", nome, valorPagamentoFuncionario);

        scanner.close();
    }
}
