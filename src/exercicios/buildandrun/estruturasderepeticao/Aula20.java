package exercicios.buildandrun.estruturasderepeticao;

import java.util.Scanner;

public class Aula20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String respostaUsuario = "";
        int altura;

        System.out.println("Sistema inicializado com sucesso");
        System.out.println("Para sair digite a palavra 'FINALIZAR'");

        while (!respostaUsuario.equalsIgnoreCase("FINALIZAR")) {
            System.out.println("Informe a altura do passageiro em cm: ");
            respostaUsuario = scanner.nextLine();
            try {
                altura = Integer.parseInt(respostaUsuario); // Tenta converter a entrada para um número
                if (altura > 160) {
                    System.out.println("VIAGEM LIBERADA!");
                } else {
                    System.out.println("VIAGEM NÃO LIBERADA!");
                }
            } catch (NumberFormatException e) {
                // Se a conversão falhar, informa ao usuário que a entrada é inválida
                System.out.println("Entrada inválida! Por favor, digite um número válido ou 'FINALIZAR' para sair.");
            }
        }
        System.out.println("SISTEMA ENCERRADO COM SUCESSO!");
        scanner.close();
    }
}