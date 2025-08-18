package intermediario.composicao.devsuperior.exemplo1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        String departmentName, workerName, workerLevel;
        double baseSalary, valuePerHour;
        int n, hours;

        // Formato da data brasileira
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        departmentName = scanner.nextLine();

        System.out.println("Enter worker data:");
        System.out.print("Name: ");
        workerName = scanner.nextLine();

        System.out.print("Level: ");
        workerLevel = scanner.nextLine();

        System.out.print("Base salary: ");
        baseSalary = scanner.nextDouble();

        // Criação do objeto Worker e Department
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName));

        System.out.print("How many contracts to this worker? ");
        n = scanner.nextInt();

        scanner.nextLine(); // Limpa o \n pendente após nextInt

        for (int i = 1; i <= n; i++) {
            System.out.println("Enter contract #" + i + " data:");

            System.out.print("Date (DD/MM/YYYY): ");
            String dateStr = scanner.nextLine();
            LocalDate contractDate = LocalDate.parse(dateStr, formatoBR);

            System.out.print("Value per hour: ");
            valuePerHour = scanner.nextDouble();

            System.out.print("Duration (hours): ");
            hours = scanner.nextInt();

            scanner.nextLine(); // Limpa o \n pendente após nextInt

            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        scanner.close();
    }
}