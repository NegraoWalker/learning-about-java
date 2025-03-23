package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Scanner;

public class ProblemaCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada;
        int alcool = 0, gasolina = 0, diesel = 0;


        do {
            System.out.println("Informe um código [1 - Álcool; 2 - Gasolina; 3 - Diesel; 4 - Finalizar]: ");
            entrada = scanner.nextInt();
            switch (entrada) {
                case 1:
                    alcool++;
                    break;
                case 2:
                    gasolina++;
                    break;
                case 3:
                    diesel++;
                    break;
            }
        } while (entrada != 4);
        System.out.println("Muito obrigado!");
        System.out.printf("ÁLCOOL: %d\nGASOLINA: %d\nDIESEL: %d\n", alcool, gasolina, diesel);

        scanner.close();
    }
}
