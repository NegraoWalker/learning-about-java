package exercicios.devsuperior.arrays.dadospessoas;

import exercicios.devsuperior.arrays.abaixodamedia.Pessoa;

import java.util.Locale;
import java.util.Scanner;

public class DadosPessoas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int qtdPessoas, qtdMulheres = 0, qtdHomens = 0;
        double altura, maiorAltura, menorAltura, somaAlturasMulheres = 0, mediaAlturasMulheres;
        char genero;

        System.out.print("Informe a quantidade de pessoas: ");
        qtdPessoas = scanner.nextInt();

        Pessoa[] pessoas = new Pessoa[qtdPessoas];
        double[] alturasMulheres;

        for (int i = 0; i < qtdPessoas; i++) {
            System.out.println("Informe a altura da pessoa " + +(i + 1) + ":");
            altura = scanner.nextDouble();
            System.out.println("Informe o gênero da pessoa " + (i + 1) + ":");
            genero = scanner.next().charAt(0);
            pessoas[i] = new Pessoa(altura, genero);
        }

        maiorAltura = pessoas[0].getAltura();
        menorAltura = pessoas[0].getAltura();

        for (int i = 0; i < qtdPessoas; i++) {
            if (pessoas[i].getAltura() > maiorAltura) {
                maiorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura() < menorAltura) {
                menorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getGenero() == 'F') {
                qtdMulheres++;
                somaAlturasMulheres += pessoas[i].getAltura();
            }
            if (pessoas[i].getGenero() == 'M') {
                qtdHomens++;
            }
        }

        mediaAlturasMulheres = somaAlturasMulheres / qtdMulheres;

        System.out.printf("Menor altura do grupo de pessoas: %.2f\n", menorAltura);
        System.out.printf("Maior altura do grupo de pessoas: %.2f\n", maiorAltura);
        System.out.printf("Média de alturas das mulheres: %.2f\n", mediaAlturasMulheres);
        System.out.print("Número de homens: " + qtdHomens);
        scanner.close();
    }
}
