package conteudo3.estrutura_de_dados.array.exemplo_referencia1;

import java.util.Locale;
import java.util.Scanner;

public class ExemploReferencia1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tamanho;
        String name;
        double price, sum = 0.0;

        System.out.println("Informe o tamanho do vetor: ");
        tamanho = scanner.nextInt();
        Produto[] vetorProdutos = new Produto[tamanho];

        for (int i = 0; i < vetorProdutos.length; i++) {
            scanner.nextLine();
            System.out.println("Informe o nome do produto: ");
            name = scanner.nextLine();
            System.out.println("Informe o preço do produto: ");
            price = scanner.nextDouble();
            vetorProdutos[i] = new Produto(name, price);
        }

        for (Produto produto : vetorProdutos) {
            sum += produto.getPrice();
        }

        double avg = sum / vetorProdutos.length;
        System.out.printf("AVERAGE PRICE = %.2f%n", avg);

        scanner.close();
    }
}
