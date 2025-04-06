package exercicios.build_and_run.estruturascondicionais;

import java.util.Scanner;

public class Aula15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade?");
        int idade = scanner.nextInt();
        System.out.println("Você tem permissão do seus pais [S ou N]?");
        char resposta = scanner.next().charAt(0);
        if (idade > 17 || resposta == 'S') {
            System.out.println("ACESSO LIBERADO!");
        } else {
            System.out.println("ACESSO NEGADO!");
        }

        scanner.close();
    }
}
