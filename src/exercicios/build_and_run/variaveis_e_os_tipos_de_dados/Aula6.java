package exercicios.build_and_run.variaveis_e_os_tipos_de_dados;

import java.util.Scanner;

public class Aula6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vamos até a lua hoje!!");
        System.out.println("Informe o peso da primeira pessoa: ");
        int pesoPessoa1 = scanner.nextInt();
        System.out.println("Informe o peso da segunda pessoa: ");
        int pesoPessoa2 = scanner.nextInt();
        System.out.println("Informe o peso da terceira pessoa: ");
        int pesoPessoa3 = scanner.nextInt();

        int pesoTotal = pesoPessoa1 + pesoPessoa2 + pesoPessoa3;
        System.out.println("Peso total dos passageiros: " + pesoTotal + " Kg");
        System.out.println("Viagem liberada!");
        scanner.close();
    }
}
