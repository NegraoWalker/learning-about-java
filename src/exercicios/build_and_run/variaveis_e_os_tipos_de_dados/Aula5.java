package exercicios.build_and_run.variaveis_e_os_tipos_de_dados;

import java.util.Scanner;

public class Aula5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistema de liberações:");
        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();
        System.out.println("Gerando declaração...");
        System.out.println("O funcionário " + nome + " está liberado para jogar ping-pong");
        scanner.close();
    }
}
