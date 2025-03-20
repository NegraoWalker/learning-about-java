package exercicios.buildandrun.estruturasderepeticao;

import java.util.Scanner;

public class Aula21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;
        System.out.println("Jira CLI");
        do {
            System.out.println("1 - Criar Tarefa");
            System.out.println("2 - Criar Projeto");
            System.out.println("3 - Sair");
            System.out.println("Digite uma opção: ");
            opcao = scanner.nextInt();
            System.out.println();
            switch (opcao) {
                case 1:
                    System.out.println("Tarefa criada com sucesso!");
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Projeto criado com sucesso!");
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Sistema Finalizado!");
                    break;
            }
        } while (opcao != 3);
        scanner.close();
    }
}
