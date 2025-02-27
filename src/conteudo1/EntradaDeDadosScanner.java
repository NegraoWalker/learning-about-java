package conteudo1;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDadosScanner {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe seu nome: ");
        String name = scanner.nextLine();

        System.out.println("Informe sua idade: ");
        int age = scanner.nextInt();

        System.out.println("Informe seu salário: ");
        double salary = scanner.nextDouble();

        System.out.printf("Meu nome é %s, tenho %d de idade e meu salário é R$ %.3f.", name, age, salary);

        scanner.close();
    }
}
