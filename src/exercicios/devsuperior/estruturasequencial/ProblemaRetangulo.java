package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaRetangulo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a base do retângulo");
        double baseRetangulo = scanner.nextDouble();

        System.out.println("Informe a altura do retângulo");
        double alturaRetangulo = scanner.nextDouble();

        double areaRetangulo = baseRetangulo * alturaRetangulo;
        double perimetroRetangulo = 2 * (baseRetangulo + alturaRetangulo);
        double diagonalRetangulo = Math.sqrt(Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));

        System.out.printf("Área do retângulo: %.4f metros quadrados\n",areaRetangulo);
        System.out.printf("Perímetro do retângulo: %.4f metros\n", perimetroRetangulo);
        System.out.printf("Diagonal do retângulo: %.4f metros", diagonalRetangulo);
        scanner.close();
    }
}
