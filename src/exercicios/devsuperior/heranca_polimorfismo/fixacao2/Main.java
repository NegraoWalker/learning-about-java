package exercicios.devsuperior.heranca_polimorfismo.fixacao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<TaxPayer> payerList = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax Payer #" + i + " data: ");
            System.out.print("Individual or company (i/c)? ");
            char ch = scanner.next().charAt(0);
            scanner.nextLine(); // Consome a quebra de linha pendente após next()

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Anual income: ");
            double anualIncome = scanner.nextDouble();

            if (ch == 'i') {
                System.out.print("Health expenditures: ");
                double healthExpenditures = scanner.nextDouble();
                payerList.add(new Individual(name, anualIncome, healthExpenditures));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = scanner.nextInt();
                payerList.add(new Company(name, anualIncome, numberOfEmployees));
            }
        }

        double totalTaxes = 0.0;
        System.out.println();
        System.out.println("TAXES PAID:");
        for (TaxPayer taxPayer : payerList) {
            double tax = taxPayer.tax();
            System.out.printf("%s: $%.2f%n", taxPayer.getName(), tax);
            totalTaxes += tax;
        }

        System.out.println();
        System.out.printf("TOTAL TAXES: $%.2f%n", totalTaxes);

        scanner.close();
    }
}