package exercicios.devsuperior.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaBaskara {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o coeficiente a: ");
        double a = scanner.nextDouble();
        System.out.println("Informe o coeficiente b: ");
        double b = scanner.nextDouble();
        System.out.println("Informe o coeficiente c: ");
        double c = scanner.nextDouble();

        double delta = Math.pow(b, 2) - 4 * a * c;
        double x1 = - b + Math.sqrt(delta) / 2 * a;
        double x2 = - b - Math.sqrt(delta) / 2 * a;

        if (delta < 0) {
            System.out.println("Não possui raizes reais");
        } else {
            System.out.printf("x1: %.4f\n", x1);
            System.out.printf("x2: %.4f\n", x2);
        }

        scanner.close();
    }
}
