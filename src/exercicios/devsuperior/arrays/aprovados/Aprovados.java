package exercicios.devsuperior.arrays.aprovados;

import java.util.Locale;
import java.util.Scanner;

public class Aprovados {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int qtdAlunos;
        String nome;
        double primeiraNota, segundaNota, mediaNotas;

        System.out.println("Informe a quantidade de alunos:");
        qtdAlunos = scanner.nextInt();

        Aluno[] alunos = new Aluno[qtdAlunos];

        //Recebendo os dados:
        for (int i = 0; i < qtdAlunos; i++) {
            System.out.println("Digite o nome, a primeira nota e segunda nota do aluno " + (i+1) + ":");
            scanner.nextLine();
            nome = scanner.nextLine(); //nome
            primeiraNota = scanner.nextDouble(); //nota1
            segundaNota = scanner.nextDouble(); //nota2
            alunos[i] = new Aluno(nome, primeiraNota, segundaNota);
        }

        System.out.println("Alunos aprovados:");
        for (int i = 0; i < qtdAlunos; i++) {
            mediaNotas = (alunos[i].getPrimeiraNota() + alunos[i].getSegundaNota()) / 2;
            if (mediaNotas >= 6.0) {
                System.out.println(alunos[i].getNome());
            }
        }
        scanner.close();
    }
}
