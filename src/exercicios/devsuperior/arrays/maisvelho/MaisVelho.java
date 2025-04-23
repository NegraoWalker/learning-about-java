package exercicios.devsuperior.arrays.maisvelho;

import java.util.Locale;
import java.util.Scanner;

public class MaisVelho {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine(); // limpa o enter do buffer

        String[] vetorNomes = new String[qtdPessoas];
        int[] vetorIdades = new int[qtdPessoas];

        // Coleta os dados das pessoas
        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Informe os dados da pessoa " + (i + 1) + ":");
            System.out.print("Nome: ");
            vetorNomes[i] = scanner.nextLine();

            System.out.print("Idade: ");
            vetorIdades[i] = scanner.nextInt();
            scanner.nextLine(); // limpa o enter do buffer
        }

        // Encontra a pessoa mais velha
        int maiorIdade = vetorIdades[0];
        int indiceMaiorIdade = 0;

        for (int i = 1; i < qtdPessoas; i++) {
            if (vetorIdades[i] > maiorIdade) {
                maiorIdade = vetorIdades[i];
                indiceMaiorIdade = i;
            }
        }

        // Mostra o resultado
        System.out.println("Pessoa mais velha: " + vetorNomes[indiceMaiorIdade]);

        scanner.close();
    }
}