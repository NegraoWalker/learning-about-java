package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class AcimaDiagonal {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Declaração de variáveis:
        int n;
        int somaAcima = 0;
        //Recebendo o tamanho da matriz quadrada:
        System.out.print("Informe a ordem da matriz (no máximo 10): ");
        n = scanner.nextInt();

        //Declarando a matriz:
        int [][] matriz = new int[n][n];
        //Recebendo os elementos da matriz:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: \n", i,j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        //Somando os elementos acima da diagonal principal:
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                somaAcima += matriz[i][j];
            }
        }

        //Saída de dados:
        System.out.println();
        System.out.println("Matriz informada:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("%4d", matriz[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        System.out.printf("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = %d%n", somaAcima);

        scanner.close();
    }
}
