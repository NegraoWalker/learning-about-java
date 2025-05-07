package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class CadaLinha {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        // Variáveis:
        int n;

        // Entrada de dados:
        System.out.print("Informe a ordem da matriz (no máximo 10): ");
        n = scanner.nextInt();

        int[][] matriz = new int[n][n];

        // Leitura da matriz:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d,%d]: ", i, j);
                matriz[i][j] = scanner.nextInt();
            }
        }

        int[] vetor = new int[n];

        // Encontrar o maior elemento de cada linha:
        for (int i = 0; i < n; i++) {
            int maiorElemento = matriz[i][0]; // Inicializa com o primeiro elemento da linha
            for (int j = 1; j < n; j++) {     // Começa do segundo elemento
                if (matriz[i][j] > maiorElemento) {
                    maiorElemento = matriz[i][j];
                }
            }
            vetor[i] = maiorElemento;
        }

        // Impressão do resultado:
        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for (int elemento : vetor) {
            System.out.println(elemento);
        }

        scanner.close();
    }
}