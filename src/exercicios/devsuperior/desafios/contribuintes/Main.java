package exercicios.devsuperior.desafios.contribuintes;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Variáveis:
        int n;
        double salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending;


        //Armazenamento de dados na lista:
        System.out.println("======================================================================================");
        System.out.print("Informe a quantidade de contribuintes: ");
        n = scanner.nextInt();
        System.out.println();

        List<TaxPayer> taxPayers = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Digite os dados do contribuinte " + (i+1) + ":");
            System.out.println("Informe a renda anual com salário: ");
            salaryIncome = scanner.nextDouble();
            System.out.println("Informe a renda anual com prestação de serviço: ");
            servicesIncome = scanner.nextDouble();
            System.out.println("Informe a renda anual com ganho de capital: ");
            capitalIncome = scanner.nextDouble();
            System.out.println("Informe os gastos médicos: ");
            healthSpending = scanner.nextDouble();
            System.out.println("Informe os gastos educacionais: ");
            educationSpending = scanner.nextDouble();

            taxPayers.add(new TaxPayer(salaryIncome, servicesIncome, capitalIncome, healthSpending, educationSpending));
        }

        //Apresentação dos resultados:



        scanner.close();
    }
}
