package exercicios.devsuperior.arrays.comerciante;

import java.util.Locale;
import java.util.Scanner;

public class Comerciante {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int qtdMercadorias, qtdMercadoriasLucroAbaixo10 = 0, qtdMercadoriasLucroEntre10E20 = 0, qtdMercadoriasLucroAcimaDe20 = 0;
        String nome;
        double precoVenda, precoCompra, lucro;
        double somaValorDeCompra = 0, somaValorDeVenda = 0, valorTotalDeCompra, valorTotalVenda, somaLucro = 0, lucroTotal;

        System.out.print("Informe a quantidade de mercadorias: ");
        qtdMercadorias = scanner.nextInt();
        Mercadoria[] mercadorias = new Mercadoria[qtdMercadorias];

        for (int i = 0; i < qtdMercadorias; i++) {
            scanner.nextLine(); // limpa buffer
            System.out.println("Mercadoria " + (i + 1) + ":");
            System.out.println("Nome:");
            nome = scanner.nextLine();
            System.out.println("Preço de compra:");
            precoCompra = scanner.nextDouble();
            System.out.println("Preço de venda:");
            precoVenda = scanner.nextDouble();
            mercadorias[i] = new Mercadoria(nome, precoCompra, precoVenda);
        }

        for (int i = 0; i < qtdMercadorias; i++) {
            precoCompra = mercadorias[i].getPrecoCompra();
            precoVenda = mercadorias[i].getPrecoVenda();
            lucro = precoVenda - precoCompra;

            // Acumula totais
            somaValorDeCompra += precoCompra;
            somaValorDeVenda += precoVenda;
            somaLucro += lucro;

            // Calcula lucro percentual
            double lucroEmPercentual = lucro / precoCompra;

            // Classificação de acordo com o lucro percentual
            if (lucroEmPercentual < 0.10) {
                qtdMercadoriasLucroAbaixo10++;
            } else if (lucroEmPercentual <= 0.20) {
                qtdMercadoriasLucroEntre10E20++;
            } else {
                qtdMercadoriasLucroAcimaDe20++;
            }
        }

        valorTotalDeCompra = somaValorDeCompra;
        valorTotalVenda = somaValorDeVenda;
        lucroTotal = somaLucro;

        // Saída final
        System.out.print("RELATORIO:\n");
        System.out.printf("Lucro abaixo de 10%%: %d\n", qtdMercadoriasLucroAbaixo10);
        System.out.printf("Lucro entre 10%% e 20%%: %d\n", qtdMercadoriasLucroEntre10E20);
        System.out.printf("Lucro acima de 20%%: %d\n", qtdMercadoriasLucroAcimaDe20);
        System.out.printf("Valor total de compra: %.2f\n", valorTotalDeCompra);
        System.out.printf("Valor total de venda: %.2f\n", valorTotalVenda);
        System.out.printf("Lucro total: %.2f\n", lucroTotal);

        scanner.close();
    }
}