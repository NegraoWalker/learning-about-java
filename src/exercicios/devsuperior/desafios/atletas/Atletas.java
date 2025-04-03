package exercicios.devsuperior.desafios.atletas;

import java.util.Locale;
import java.util.Scanner;

public class Atletas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int qtdDeAtletas, homens = 0, mulheres = 0;
        String nome, nomeAtletaMaisAlto = "";
        char sexo;
        double altura, maiorAltura = 0, peso;
        double pesoAtletas = 0, alturaMulheres = 0;

        System.out.println("========================================================================");
        System.out.println("DESAFIO ATLETAS");
        System.out.println("========================================================================");
        System.out.print("Informe a quantidade de atletas: ");
        qtdDeAtletas = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= qtdDeAtletas; i++) {
            System.out.println("Digite as informações do atleta " + i + ":");

            System.out.print("Nome: ");
            nome = scanner.nextLine();

            // Validação do sexo
            System.out.print("Informe o sexo [M]- Male ou [F]- Female: ");
            sexo = scanner.next().charAt(0);
            while (sexo != 'F' && sexo != 'M') {
                System.out.print("Valor inválido! Digite F ou M: ");
                sexo = scanner.next().charAt(0);
            }

            // Validação da altura
            System.out.print("Altura: ");
            altura = scanner.nextDouble();
            while (altura <= 0) {
                System.out.print("Valor inválido! Digite um valor positivo ou maior que zero: ");
                altura = scanner.nextDouble();
            }

            // Atualizar o atleta mais alto
            if (altura > maiorAltura) {
                maiorAltura = altura;
                nomeAtletaMaisAlto = nome;
            }

            // Validação do peso
            System.out.print("Peso: ");
            peso = scanner.nextDouble();
            while (peso <= 0) {
                System.out.print("Valor inválido! Digite um valor positivo ou maior que zero: ");
                peso = scanner.nextDouble();
            }

            pesoAtletas += peso;
            if (sexo == 'M') {
                homens++;
            } else {
                mulheres++;
                alturaMulheres += altura;
            }
            scanner.nextLine();
        }

        double pesoMedioAtletas = pesoAtletas / qtdDeAtletas;
        double percentualHomens = ((double) homens / qtdDeAtletas) * 100;

        // Exibir relatório
        System.out.println("\nRELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f\n", pesoMedioAtletas);
        System.out.printf("Atleta mais alto: %s\n", nomeAtletaMaisAlto);
        System.out.printf("Porcentagem de homens: %.2f%%\n", percentualHomens);

        if (mulheres == 0) {
            System.out.println("Não há mulheres cadastradas!");
        } else {
            double alturaMediaMulheres = alturaMulheres / mulheres;
            System.out.printf("Altura média das mulheres: %.2f\n", alturaMediaMulheres);
        }
        scanner.close();
    }
}