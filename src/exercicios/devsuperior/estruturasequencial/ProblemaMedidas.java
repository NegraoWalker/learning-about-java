package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMedidas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a medida de A: ");
        double medidaA = scanner.nextDouble();
        System.out.println("Digite a medida de B: ");
        double medidaB = scanner.nextDouble();
        System.out.println("Digite a medida de C: ");
        double medidaC = scanner.nextDouble();

        double areaQuadrado = Math.pow(medidaA, 2);
        double areaTriangulo = medidaA * medidaB / 2;
        double areaTrapezio = ((medidaA + medidaB) * medidaC) / 2;
        System.out.printf("Área do quadrado: %.4f\n", areaQuadrado);
        System.out.printf("Área do triângulo: %.4f\n", areaTriangulo);
        System.out.printf("Área do trapézio: %.4f", areaTrapezio);
        scanner.close();
    }
}
