package exercicios.devsuperior.arrays.alturas;

import java.util.Locale;
import java.util.Scanner;

public class Alturas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a quantidade de pessoas: ");
        int qtdPessoas = scanner.nextInt();
        scanner.nextLine(); // limpa o buffer

        Pessoa[] pessoas = new Pessoa[qtdPessoas];

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Dados da pessoa " + (i + 1) + ":");
            System.out.print("Informe o nome: ");
            String nome = scanner.nextLine();

            System.out.print("Informe a idade: ");
            int idade = scanner.nextInt();

            System.out.print("Informe a altura: ");
            double altura = scanner.nextDouble();
            scanner.nextLine(); // limpa o buffer

            pessoas[i] = new Pessoa(nome, idade, altura);
        }

        double somaAlturas = 0;
        int qtdPessoasMenorDe16 = 0;

        for (Pessoa pessoa : pessoas) {
            somaAlturas += pessoa.getAltura();
            if (pessoa.getIdade() < 16) {
                qtdPessoasMenorDe16++;
            }
        }

        double mediaAlturas = somaAlturas / qtdPessoas;
        double porcentagem = (double) qtdPessoasMenorDe16 / qtdPessoas * 100;

        System.out.printf("\nAltura média: %.2f\n", mediaAlturas);
        System.out.printf("Pessoas com menos de 16 anos: %.2f%%\n", porcentagem);

        for (Pessoa pessoa : pessoas) {
            if (pessoa.getIdade() < 16) {
                System.out.println(pessoa.getNome());
            }
        }
        scanner.close();
    }
}