package exercicios.devsuperior.classes_atributos_e_metodos.problemaalunos;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        String nomeAluno;
        double nota1, nota2, nota3;
        Student student = new Student();

        System.out.println("Informe o nome do aluno: ");
        nomeAluno = scanner.nextLine();
        System.out.println("Informe a nota do primeiro trimestre: ");
        nota1 = scanner.nextDouble();
        System.out.println("Informe a nota do segundo trimestre: ");
        nota2 = scanner.nextDouble();
        System.out.println("Informe a nota do terceiro trimestre: ");
        nota3 = scanner.nextDouble();

        student.name = nomeAluno;
        student.grade1 = nota1;
        student.grade2 = nota2;
        student.grade3 = nota3;

        System.out.println(student);

        scanner.close();
    }
}
