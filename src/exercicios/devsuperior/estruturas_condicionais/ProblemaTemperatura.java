package exercicios.devsuperior.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaTemperatura {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("CONVERSÃO DE ESCALAS DE TEMPERATURA:");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe a escala de medida (C/F)");
        char escala = scanner.next().charAt(0);
        double temperatura;

        if (escala == 'C') {
            System.out.println("Informe a temperatura em Celsius: ");
            temperatura = scanner.nextDouble();
            double temperaturaEmFahrenheit = (temperatura * 1.8) + 32;
            System.out.printf("Temperatura em Fahrenheit: %.2f", temperaturaEmFahrenheit);
        } else if (escala == 'F') {
            System.out.println("Informe a temperatura em Fahrenheit: ");
            temperatura = scanner.nextDouble();
            double temperaturaEmCelsius = ((double) 5 / 9) * (temperatura - 32);
            System.out.printf("Temperatura em Celsius: %.2f", temperaturaEmCelsius);
        }
        scanner.close();
    }
}
