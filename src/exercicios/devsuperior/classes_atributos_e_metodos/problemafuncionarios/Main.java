package exercicios.devsuperior.classes_atributos_e_metodos.problemafuncionarios;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String nome;
        double salarioBruto, imposto, porcentagemAumento;
        Employee employee = new Employee();

        System.out.println("Informe o nome do funcionário: ");
        nome = scanner.nextLine();
        System.out.println("Informe o salário bruto do funcionário: ");
        salarioBruto = scanner.nextDouble();
        System.out.println("Informe o imposto: ");
        imposto = scanner.nextDouble();
        employee.name = nome;
        employee.grossSalary = salarioBruto;
        employee.tax = imposto;
        System.out.println(employee);

        System.out.println("Qual a porcentagem de aumento de salário: ");
        porcentagemAumento = scanner.nextDouble();
        employee.increaseSalary(porcentagemAumento);
        System.out.println(employee);
        scanner.close();
    }
}
