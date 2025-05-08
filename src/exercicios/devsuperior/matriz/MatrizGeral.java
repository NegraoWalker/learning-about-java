package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class MatrizGeral {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Recebe ordem da matriz (máx. 10)
        System.out.print("Qual a ordem da matriz? ");
        int n = scanner.nextInt();

        double[][] matriz = new double[n][n];
        double somaPositivos = 0.0;

        // Leitura dos elementos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextDouble();
            }
        }

        // a) soma dos elementos positivos
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] > 0) {
                    somaPositivos += matriz[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.2f%n", somaPositivos);

        // b) imprime linha escolhida
        System.out.print("Escolha uma linha: ");
        int linha = scanner.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for (int j = 0; j < n; j++) {
            System.out.printf("%.2f ", matriz[linha][j]);
        }
        System.out.println();

        // c) imprime coluna escolhida
        System.out.print("Escolha uma coluna: ");
        int coluna = scanner.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", matriz[i][coluna]);
        }
        System.out.println();

        // d) diagonal principal
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f ", matriz[i][i]);
        }
        System.out.println();

        // e) eleva ao quadrado elementos negativos e imprime matriz alterada
        System.out.println("MATRIZ ALTERADA:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double valor = matriz[i][j];
                if (valor < 0) {
                    valor = Math.pow(valor, 2);  // x²
                }
                System.out.printf("%.2f ", valor);
            }
            System.out.println();
        }

        scanner.close();
    }
}
