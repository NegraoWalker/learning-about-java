package exercicios.buildandrun.variaveiseostiposdedados;

import java.util.Locale;
import java.util.Scanner;

public class Aula11Exercicio2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de arquitetura 2.0");
        System.out.println("Quando de revestimento precisamos?");
        System.out.println("Digite o diamêtro em metros: ");
        double diametro = scanner.nextDouble();

        System.out.println("Calculando o metro quadrado");
        double raio = diametro / 2;
        double area = Math.PI * Math.pow(raio, 2);
        System.out.printf("Resultado: %.2f metros quadrados", area);

        scanner.close();
    }
}
