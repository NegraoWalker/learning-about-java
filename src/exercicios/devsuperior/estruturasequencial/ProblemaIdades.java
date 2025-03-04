package exercicios.devsuperior.estruturasequencial;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: ");
        String nomePrimeiraPessoa = scanner.nextLine();
        System.out.println("Idade: ");
        int idadePrimeiraPessoa = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Dados da primeira pessoa:");
        System.out.println("Nome: ");
        String nomeSegundaPessoa = scanner.nextLine();
        System.out.println("Idade: ");
        int idadeSegundaPessoa = scanner.nextInt();

        double mediaDasIdades = (double) (idadePrimeiraPessoa + idadeSegundaPessoa) / 2;

        System.out.printf("A idade média de %s e %s é de %.1f anos.", nomePrimeiraPessoa, nomeSegundaPessoa, mediaDasIdades);

        scanner.close();
    }
}
