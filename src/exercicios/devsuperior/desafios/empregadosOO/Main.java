package exercicios.devsuperior.desafios.empregadosOO;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do departamento: ");
        String name = scanner.nextLine();

        System.out.print("Dia do pagamento: ");
        int day = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após o nextInt()

        System.out.print("Email: ");
        String email = scanner.nextLine();

        System.out.print("Telefone: ");
        String phone = scanner.nextLine();

        Address address = new Address(email, phone);
        Department department = new Department(name, day, address);

        System.out.print("Quantos funcionários tem o departamento? ");
        int numberOfEmployees = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha após o nextInt()

        for (int i = 1; i <= numberOfEmployees; i++) {
            System.out.println("Dados do funcionário " + i + ":");

            System.out.print("Nome: ");
            String nameEmployee = scanner.nextLine();

            System.out.print("Salário: ");
            double salary = scanner.nextDouble();
            scanner.nextLine(); // Consome a quebra de linha após o nextDouble()

            Employee employee = new Employee(nameEmployee, salary);
            department.addEmployee(employee);
        }

        showReport(department);
        scanner.close();
    }

    private static void showReport(Department department) {
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("FOLHA DE PAGAMENTO:\n");
        stringBuilder.append("Departamento ").append(department.getName());
        stringBuilder.append(" = R$ ").append(String.format("%.2f", department.payroll())).append("\n");
        stringBuilder.append("Pagamento realizado no dia ").append(department.getPayDay()).append("\n");
        stringBuilder.append("Funcionários:\n");
        for (Employee e : department.getEmployees()) {
            stringBuilder.append(e.getName()).append("\n");
        }

        stringBuilder.append("Para dúvidas favor entrar em contato: ")
                .append(department.getAddress().getEmail());

        System.out.println();
        System.out.println(stringBuilder.toString());
    }
}