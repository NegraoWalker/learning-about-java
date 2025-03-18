package exercicios.buildandrun.estruturascondicionais;

import java.util.Objects;
import java.util.Scanner;

public class Aula16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe a sua idade?");
        int idade = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Informe a sua escolaridade?");
        String escolaridade = scanner.nextLine();

        if (idade <= 22 && !Objects.equals(escolaridade, "Ensino Fundamental")) {
            System.out.println("Inscreva-se agora em nosso concurso!");
            System.out.println("Sistema encerrado!");
        } else {
            System.out.println("Sistema encerrado!");
        }

        scanner.close();
    }
}
