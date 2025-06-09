package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Scanner;

public class ProblemaSequenciaImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;

        System.out.println("Informe o valor de x: ");
        x = scanner.nextInt();
        for (int i = 1; i <= x ; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
