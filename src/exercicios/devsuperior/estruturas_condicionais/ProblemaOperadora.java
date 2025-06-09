package exercicios.devsuperior.estruturas_condicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaOperadora {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de minutos: ");
        int qtdMinutos = scanner.nextInt();
        double totalAPagar;
        final double VALOR_DEFAULT_A_PAGAR = 50.00;
        final int VALOR_DEFAULT_PLANO_MINUTOS = 100;
        int qtdMinutosExcedentes;

        if (qtdMinutos <= 100) {
            totalAPagar = VALOR_DEFAULT_A_PAGAR;
            System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
        } else {
            qtdMinutosExcedentes = qtdMinutos - VALOR_DEFAULT_PLANO_MINUTOS;
            totalAPagar = VALOR_DEFAULT_A_PAGAR + 2.00 * qtdMinutosExcedentes;
            System.out.printf("Total a pagar: R$ %.2f", totalAPagar);
        }
        scanner.close();
    }
}
