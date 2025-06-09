package exercicios.build_and_run.estruturas_condicionais;

import java.util.Scanner;

public class Aula18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe se o cliente retirou o item da prateleira [S ou N]?");
        char resposta = scanner.next().charAt(0);
        String status = (resposta == 'S') ? "Item adicionado ao carrinho de compra"
                                          : "Seu carrinho de compras está vazio!";
        System.out.println(status);
        scanner.close();
    }
}
