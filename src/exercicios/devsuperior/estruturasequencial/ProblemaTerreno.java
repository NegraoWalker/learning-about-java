package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTerreno {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe a largura do terreno: ");
        double larguraTerreno = scanner.nextDouble();

        System.out.println("Informe o comprimento do terreno: ");
        double comprimentoTerreno = scanner.nextDouble();

        System.out.println("Informe o valor do metro quadrado do terreno: ");
        double metroQuadradoTerreno = scanner.nextDouble();

        double areaTerreno = larguraTerreno * comprimentoTerreno;
        double precoTerreno = areaTerreno * metroQuadradoTerreno;

        System.out.printf("Área do terreno: %.2f metros quadrados\n", areaTerreno);
        System.out.printf("Preço do terreno: R$ %.2f", precoTerreno);
        scanner.close();
    }
}
