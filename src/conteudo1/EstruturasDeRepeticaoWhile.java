package conteudo1;

import java.util.Scanner;

public class EstruturasDeRepeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senhaCorreta = "12345";
        String senhaDigitada;

        System.out.print("Digite a senha: ");
        senhaDigitada = scanner.nextLine();

        while (!senhaDigitada.equals(senhaCorreta)) {
            System.out.print("Senha incorreta. Tente novamente: ");
            senhaDigitada = scanner.nextLine();
        }

        System.out.println("Acesso permitido!");
        scanner.close();
    }
}

