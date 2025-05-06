package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class DiagonalNegativos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Variáveis:
        int n;
        int qtdNegativos = 0;

        //Entrada de dados:
        //Ordem da matriz:
        System.out.print("Informe a ordem da matriz: (No máximo 10): ");
        n = scanner.nextInt();
        //Declaração da matriz:
        int [][] matriz = new int[n][n];
        //Recebendo os dados por laço:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf("Elemento [%d][%d]: \n", i,j);
                matriz[i][j] = scanner.nextInt();
            }
        }
        //Exibindo os dados da diagonal principal da matriz:
        System.out.print("DIAGONAL PRINCIPAL: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    System.out.print(matriz[i][j] + " ");
                }
            }
        }
        //Contando a quantidade de dados negativos:
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (matriz[i][j] < 0) {
                    qtdNegativos++;
                }
            }
        }
        System.out.println();
        //Exibindo a quantidade de dados negativos:
        System.out.print("QUANTIDADE DE NEGATIVOS: " + qtdNegativos);
        scanner.close();
    }
}
