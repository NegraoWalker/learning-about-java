package intermediario.exemplos_de_classe_e_objeto;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        //Exemplo 1:
        Caneta caneta1 = new Caneta();
        Caneta caneta2 = new Caneta();

        caneta1.cor = "Azul";
        caneta1.marca = "Bic";
        caneta1.ponta = 0.5;
        caneta1.tampada = true;

        caneta2.cor = "Preta";
        caneta2.marca = "Faber-Castell";
        caneta2.ponta = 0.7;
        caneta2.tampada = false;

        System.out.println("-----------------------------------------------------------------------------------------");
        caneta1.destampar();
        caneta2.escrever("Hello World!");
        caneta2.tampar();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(caneta1.marca);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(caneta2.marca);

        //Exemplo 2:
        Product product1 = new Product();
        Product product2 = new Product();

        System.out.println("Informe o nome do produto: ");
        product1.name = scanner.nextLine();

        System.out.println("Informe o preço do produto: ");
        product1.price = scanner.nextDouble();

        System.out.println("Informe a quantidade do produto: ");
        product1.quantity = scanner.nextInt();

        System.out.printf("Preço total do produto: %.2f", product1.totalPriceOfTheProduct());

        scanner.close();



    }
}
