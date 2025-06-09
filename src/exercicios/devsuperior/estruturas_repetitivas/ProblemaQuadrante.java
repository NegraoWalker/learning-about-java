package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Scanner;

public class ProblemaQuadrante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y;
        do {
            System.out.println("Digite as coordenadas x e y: ");
            x = scanner.nextInt();
            y = scanner.nextInt();
            if (x > 0 && y > 0) {
                System.out.println("Q1");
            } else if (x < 0 && y > 0) {
                System.out.println("Q2");
            } else if (x < 0 && y < 0) {
                System.out.println("Q3");
            } else if (x > 0 && y < 0) {
                System.out.println("Q4");
            }
        }
        while (x != 0 && y != 0);
        scanner.close();
    }
}
