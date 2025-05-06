package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class SomaLinhas {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        //Variáveis:
        int linhas, colunas;
        double soma = 0;

        //Receber o número de linhas e colunas:
        System.out.print("Informe a quantidade de linhas da matriz (Máximo 10): ");
        linhas = scanner.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz (Máximo 10): ");
        colunas = scanner.nextInt();
        //Declaração da matriz:
        double [][] matriz = new double[linhas][colunas];

        //Armazenando os números na matriz:
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Informe os elementos da linha " + (i+1) + ":");
                matriz[i][j] = scanner.nextDouble();
            }
        }
        //Declarando o vetor:
        double [] vetor = new double[linhas];

        //Adicionando no vetor:
        for (int i = 0; i < linhas; i++) {
            soma = 0;
            for (int j = 0; j < colunas; j++) {
                soma += matriz[i][j];
            }
            vetor[i] = soma;
        }

        //Exibindo o vetor:
        System.out.println("Vetor gerado:");
        for (double elemento : vetor) {
            System.out.println(elemento);
        }
        scanner.close();
    }
}
