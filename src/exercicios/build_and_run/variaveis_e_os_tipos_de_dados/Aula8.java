package exercicios.build_and_run.variaveis_e_os_tipos_de_dados;

import java.util.Scanner;

public class Aula8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Verificação contra fraudes:");
        System.out.println("Digite 'true' ou 'false' para a verificação");
        boolean valorDigitado = scanner.nextBoolean();
        System.out.println("Valor verificado: " + valorDigitado);
        scanner.close();
    }
}
