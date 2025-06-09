package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Scanner;

public class ProblemaCrescente {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        int y;

        do {
            System.out.println("Digite dois números: ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > y) {
                System.out.println("DECRESCENTE!");
            } else if (y > x){
                System.out.println("CRESCENTE!");
            }
        } while (x != y);
        scanner.close();
    }
}
