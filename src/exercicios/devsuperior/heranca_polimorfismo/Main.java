package exercicios.devsuperior.heranca_polimorfismo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        List<Product> products = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.println("Product #" + i + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = scanner.next().charAt(0);
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Price: ");
            double price = scanner.nextDouble();
            scanner.nextLine();

            switch (type) {
                case 'c': // comum
                    products.add(new Product(name, price));
                    break;

                case 'u': // usado
                    System.out.print("Manufacture date (DD/MM/YYYY): ");
                    String strDate = scanner.nextLine();
                    LocalDate manufactureDate = LocalDate.parse(strDate, formatoBR);
                    products.add(new UsedProduct(name, price, manufactureDate));
                    break;

                case 'i': // importado
                    System.out.print("Customs fee: ");
                    double customsFee = scanner.nextDouble();
                    scanner.nextLine(); // limpa o buffer
                    products.add(new ImportedProduct(name, price, customsFee));
                    break;

                default:
                    System.out.println("Invalid option! Skipping product.");
                    break;
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS:");
        for (Product product : products) {
            System.out.println(product.priceTag());
        }

        scanner.close();
    }
}