package exercicios.build_and_run.variaveis_e_os_tipos_de_dados;

import java.util.Scanner;

public class Aula9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo a build & run gpt!");
        System.out.println("Digite um prompt:");
        String promptDigitado = scanner.nextLine();
        System.out.println("Quantidade de caracteres: " + promptDigitado.length());
        scanner.close();
    }
}
