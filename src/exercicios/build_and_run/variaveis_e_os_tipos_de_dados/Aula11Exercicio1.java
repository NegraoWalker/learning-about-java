package exercicios.build_and_run.variaveis_e_os_tipos_de_dados;

import java.util.Locale;
import java.util.Scanner;

public class Aula11Exercicio1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de arquitetura");
        System.out.println("Vamos calcular o metro quadrado?");
        System.out.println("Digite a largura em metros: ");
        double largura = scanner.nextDouble();
        System.out.println("Digite a altura em metros: ");
        double altura = scanner.nextDouble();

        System.out.println("Calculando o metro quadrado");
        double area = largura * altura;
        System.out.printf("Resultado: %.2f metros quadrados", area);

        scanner.close();
    }
}
