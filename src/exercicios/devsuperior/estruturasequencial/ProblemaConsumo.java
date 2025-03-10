package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaConsumo {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a distância percorrida: ");
        double distancia = scanner.nextDouble();
        System.out.println("Digite o total de combustível gasto para percorrer essa distância: ");
        double combustivel = scanner.nextDouble();

        double consumoMedio = distancia / combustivel;
        System.out.printf("Consumo médio: %.3f Km/litros", consumoMedio);
        scanner.close();
    }
}
