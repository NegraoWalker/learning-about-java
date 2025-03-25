package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Scanner;

public class ProblemaFatorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int fatorial = 1;

        System.out.println("Informe o número para o cálculo do fatorial: ");
        n = scanner.nextInt();

        if (n < 15) {
            for (int i = n; i >= 1 ; i--) {
                fatorial *= i;
            }
        } else {
            System.out.println("Número fora do range!");
        }

        System.out.println("FATORIAL: " + fatorial);
        scanner.close();
    }
}
