package exercicios.devsuperior.estruturacondicional;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMultiplos {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundoNumero = scanner.nextInt();
        if (Math.max(primeiroNumero, segundoNumero) == primeiroNumero) {
            if (primeiroNumero % segundoNumero == 0) {
                System.out.println("São múltiplos!");
            } else {
                System.out.println("Não são múltiplos!");
            }
        } else {
            if (primeiroNumero % segundoNumero == 0) {
                System.out.println("São múltiplos!");
            } else {
                System.out.println("Não são múltiplos!");
            }
        }
        scanner.close();
    }
}
