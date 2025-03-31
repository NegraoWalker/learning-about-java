package conteudo2.classe_object_metodo_tostring;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int qtdAdicionar, qtdRemover;

        Product product1 = new Product();
        Product product2 = new Product();

        System.out.println("Informe o nome do produto: ");
        product1.name = scanner.nextLine();

        System.out.println("Informe o preço do produto: ");
        product1.price = scanner.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        product1.quantity = scanner.nextInt();

        System.out.println(product1); // ou System.out.println(product1.toString());

        System.out.println("Informe quantos produtos você quer adicionar: ");
        qtdAdicionar= scanner.nextInt();
        product1.addProducts(qtdAdicionar);
        System.out.println(product1);

        System.out.println("Informe quantos produtos você quer remover: ");
        qtdRemover = scanner.nextInt();
        product1.removeProducts(qtdRemover);
        System.out.println(product1);

        scanner.close();
    }
}
