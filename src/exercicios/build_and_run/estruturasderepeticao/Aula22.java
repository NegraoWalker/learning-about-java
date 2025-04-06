package exercicios.build_and_run.estruturasderepeticao;

import java.util.Locale;
import java.util.Scanner;

public class Aula22 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a quantidade de membros no seu time: ");
        int qtdMembros = scanner.nextInt();
        double notaMembro;
        double somaNotas = 0;
        double mediaNotas;
        for (int i = 1; i <= qtdMembros; i++) {
            System.out.printf("Digite a nota do membro %d:\n", i);
            notaMembro = scanner.nextDouble();
            somaNotas += notaMembro;
        }
        mediaNotas = somaNotas / qtdMembros;
        System.out.println("Pesquisa finalizada!");
        System.out.println("Gerando média do time...");
        System.out.printf("O desempenho médio do time é %.2f", mediaNotas);
        scanner.close();
    }
}
