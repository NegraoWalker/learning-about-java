package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Scanner;

public class ProblemaTabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada, resultado;
        System.out.println("Para qual valor você deseja a tabuada: ");
        entrada = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            resultado = entrada * i;
            System.out.printf("%d x %d = %d\n", entrada, i, resultado);
        }
        scanner.close();
    }
}
