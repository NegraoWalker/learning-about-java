package exercicios.devsuperior.desafios.bar;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Bill bill = new Bill();

        System.out.println("Informe o sexo: ");
        bill.gender = scanner.next().charAt(0);
        System.out.println("Informe a quantidade de cervejas: ");
        bill.beer = scanner.nextInt();
        System.out.println("Informe a quantidade de refrigerantes: ");
        bill.softDrink = scanner.nextInt();
        System.out.println("Informe a quantidade de espetinhos: ");
        bill.barbecue = scanner.nextInt();
        System.out.println("RELATÓRIO:");
        System.out.println(bill);
        scanner.close();
    }
}
