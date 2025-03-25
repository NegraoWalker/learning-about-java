package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaExperiencias {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int casosDeTeste, qtdCobaias;
        char tipoDeCobaia;
        int totalDeCobaias, totalDeCobaiasCoelhos = 0, totalDeCobaiasRatos = 0, totalDeCobaiasSapos = 0;
        double percentualCoelhos, percentualRatos, percentualSapos;

        System.out.println("Informe quantos casos de teste serão digitados: ");
        casosDeTeste = scanner.nextInt();

        for (int i = 0; i < 10; i++) {
            System.out.println("Informe a quantidade de cobais: ");
            qtdCobaias = scanner.nextInt();
            System.out.println("Informe o tipo de cobaia: ");
            tipoDeCobaia = scanner.next().charAt(0);

            switch (tipoDeCobaia) {
                case 'C':
                totalDeCobaiasCoelhos += qtdCobaias;
                break;
                case 'R':
                    totalDeCobaiasRatos += qtdCobaias;
                    break;
                case 'S':
                    totalDeCobaiasSapos += qtdCobaias;
                    break;
            }
        }
        totalDeCobaias = totalDeCobaiasCoelhos + totalDeCobaiasRatos + totalDeCobaiasSapos;
        percentualCoelhos = ((double) totalDeCobaiasCoelhos / totalDeCobaias) * 100;
        percentualRatos = ((double) totalDeCobaiasRatos / totalDeCobaias) * 100;
        percentualSapos = ((double) totalDeCobaiasSapos / totalDeCobaias) * 100;

        System.out.println("RELATÓRIO FINAL:");
        System.out.printf("TOTAL DE COBAIAS GERAL: %d\n", totalDeCobaias);
        System.out.printf("TOTAL DE COBAIAS DE COELHOS: %d\n", totalDeCobaiasCoelhos);
        System.out.printf("TOTAL DE COBAIAS DE RATOS: %d\n", totalDeCobaiasRatos);
        System.out.printf("TOTAL DE COBAIAS DE SAPOS: %d\n", totalDeCobaiasSapos);
        System.out.printf("PERCENTUAL DE COELHOS: %.2f%\n", percentualCoelhos);
        System.out.printf("PERCENTUAL DE RATOS: %.2f\n", percentualRatos);
        System.out.printf("PERCENTUAL DE SAPOS: %.2f\n", percentualSapos);
        scanner.close();
    }
}
