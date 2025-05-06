package exercicios.devsuperior.matriz;

import java.util.Locale;
import java.util.Scanner;

public class NegativosMatriz {
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
        int [][] matriz = new int[linhas][colunas];

        //Armazenando os números na matriz:
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.println("Informe os elementos da linha " + (i+1) + ":");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Valores negativos: ");
        //Contando a quantidade de dados negativos:
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                if (matriz[i][j] < 0) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    scanner.close();
    }
}
