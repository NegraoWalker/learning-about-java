package exercicios.devsuperior.estruturasrepetitivas;

import java.util.Scanner;

public class ProblemaSenhaFixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        System.out.println("Digite a senha: ");
        senha = scanner.nextInt();
        if (senha == 2002) {
            System.out.println("Acesso permitido!");
        }

        while (senha != 2002) {
            System.out.println("Senha inválida! Tente novamente: ");
            senha = scanner.nextInt();
            if (senha == 2002) {
                System.out.println("Acesso permitido!");
            }
        }
        scanner.close();
    }
}
