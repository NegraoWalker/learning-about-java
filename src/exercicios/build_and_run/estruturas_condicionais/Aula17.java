package exercicios.build_and_run.estruturas_condicionais;

import java.util.Scanner;

public class Aula17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o número do mês: ");
        int numeroMes = scanner.nextInt();

        switch (numeroMes) {
            case 1,2,3:
                System.out.println("Verão");
                break;
            case 4,5,6:
                System.out.println("Outono");
                break;
            case 7,8,9:
                System.out.println("Inverno");
                break;
            case 10,11,12:
                System.out.println("Primavera");
                break;
        }
        scanner.close();
    }
}
