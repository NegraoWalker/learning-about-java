package exercicios.buildandrun.estruturascondicionais;

import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Aula14 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o usuário: ");
        String usuario = scanner.nextLine();
        System.out.println("Informe a senha: ");
        String senha = scanner.nextLine();

        if (Objects.equals(usuario, "ADMIN") && Objects.equals(senha, "SECRET")) {
            System.out.println("Acesso concedido!");
            System.out.println("Liberando arquivos secretos!");
        } else {
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("ALARME");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Agentes do FBI a caminho");
        }

        scanner.close();
    }
}
