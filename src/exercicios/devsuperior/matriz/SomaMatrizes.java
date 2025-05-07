package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class SomaMatrizes {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        //Variáveis:
        int linhas, colunas;

        //Receber o número de linhas e colunas:
        System.out.print("Informe a quantidade de linhas da matriz (Máximo 10): ");
        linhas = scanner.nextInt();
        System.out.print("Informe a quantidade de colunas da matriz (Máximo 10): ");
        colunas = scanner.nextInt();
        //Declaração da matriz:
        int [][] matrizA = new int[linhas][colunas];
        int [][] matrizB = new int[linhas][colunas];
        int [][] matrizC = new int[linhas][colunas];

        //Armazenando os números na matriz A:
        System.out.println("Digite os valores da matriz A:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: \n", i,j);
                matrizA[i][j] = scanner.nextInt();
            }
        }
        //Armazenando os números na matriz B:
        System.out.println("Digite os valores da matriz B:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.printf("Elemento [%d][%d]: \n", i,j);
                matrizB[i][j] = scanner.nextInt();
            }
        }
        //Matriz C: Soma dos elementos das matrizes A e B:
        System.out.println("MATRIZ SOMA:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizC[i][j] + " ");
            }
            System.out.println(); // Pula linha após cada linha da matriz
        }

        scanner.close();
    }
}
