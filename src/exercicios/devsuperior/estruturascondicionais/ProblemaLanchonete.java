package exercicios.devsuperior.estruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaLanchonete {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        final double VALOR_PRODUTO_1 = 5.00;
        final double VALOR_PRODUTO_2 = 3.50;
        final double VALOR_PRODUTO_3 = 4.80;
        final double VALOR_PRODUTO_4 = 8.90;
        final double VALOR_PRODUTO_5 = 7.32;
        System.out.println("----------------------------------------------------");
        System.out.println("SISTEMA LANCHONETE: ");
        System.out.println("----------------------------------------------------");
        System.out.println("Informe o código do produto: ");
        int codigoProduto = scanner.nextInt();
        System.out.println("Informe a quantidade do produto: ");
        int qtdProduto = scanner.nextInt();
        double totalAPagar = 0;

        switch (codigoProduto) {
            case 1:
                totalAPagar = qtdProduto * VALOR_PRODUTO_1;
                break;
            case 2:
                totalAPagar = qtdProduto * VALOR_PRODUTO_2;
                break;
            case 3:
                totalAPagar = qtdProduto * VALOR_PRODUTO_3;
                break;
            case 4:
                totalAPagar = qtdProduto * VALOR_PRODUTO_4;
                break;
            case 5:
                totalAPagar = qtdProduto * VALOR_PRODUTO_5;
                break;
            default:
                System.out.println("Informe um código válido!");
        }

        System.out.printf("Valor a pagar: R$%.2f", totalAPagar);

        scanner.close();
    }
}
