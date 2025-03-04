package exercicios.devsuperior.estruturasequencial;

import java.util.Scanner;

public class ProblemaSoma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de X: ");
        int valorX = scanner.nextInt();
        System.out.println("Digite o valor de Y: ");
        int valorY = scanner.nextInt();

        int soma = valorY + valorX;
        System.out.println("Soma: " + soma);

        scanner.close();
    }
}
