package exercicios.devsuperior.desafios.contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n;
        double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending;

        System.out.print("Quantos contribuintes você vai digitar? ");
        n = scanner.nextInt();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do " + (i + 1) + "o contribuinte:");
            System.out.print("Renda anual com salário: ");
            salaryIncome = scanner.nextDouble();
            System.out.print("Renda anual com prestação de serviço: ");
            servicesIncome = scanner.nextDouble();
            System.out.print("Renda anual com ganho de capital: ");
            capitalIncome = scanner.nextDouble();
            System.out.print("Gastos médicos: ");
            healthSpending = scanner.nextDouble();
            System.out.print("Gastos educacionais: ");
            educationSpending = scanner.nextDouble();

            taxPayers.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            System.out.println("Resumo do " + (i + 1) + "o contribuinte:");
            System.out.printf("Imposto bruto total: R$%.2f\n", taxPayers.get(i).grossTax());
            System.out.printf("Abatimento: R$%.2f\n", taxPayers.get(i).taxRebate());
            System.out.printf("Imposto devido: R$%.2f\n", taxPayers.get(i).netTax());
        }
        scanner.close();
    }
}
