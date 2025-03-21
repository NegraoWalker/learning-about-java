package exercicios.devsuperior.estruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaAumento {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o salário do(a) funcionário(a): ");
        double salario = scanner.nextDouble();
        double aumento;
        String porcentagemDeAumento;

        if (salario <= 1000.00) {
            aumento = 0.2 * salario;
            salario += aumento;
            porcentagemDeAumento = "20%";
        } else if (salario > 1000.00 && salario <= 3000.00) {
            aumento = 0.15 * salario;
            salario += aumento;
            porcentagemDeAumento = "15%";
        } else if (salario > 3000.00 && salario <= 8000.00) {
            aumento = 0.1 * salario;
            salario += aumento;
            porcentagemDeAumento = "10%";
        } else {
            aumento = 0.05 * salario;
            salario += aumento;
            porcentagemDeAumento = "5%";
        }

        System.out.printf("Novo salário: R$ %.2f\n", salario);
        System.out.printf("Aumento: R$ %.2f\n", aumento);
        System.out.println("Porcentagem: " + porcentagemDeAumento);

        scanner.close();
    }
}
