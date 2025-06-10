package exercicios.devsuperior.desafios.plataforma_de_ensino;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        List<Lesson> lessonList = new ArrayList<>();

        System.out.print("Quantas aulas tem o curso? ");
        int quantityLessons = scanner.nextInt();
        scanner.nextLine(); // Consome a quebra de linha pendente

        for (int i = 1; i <= quantityLessons ; i++) {
            System.out.println("Dados da " + i + "a aula:");
            System.out.print("Conteúdo ou tarefa (c/t)? ");
            char response = scanner.nextLine().charAt(0); // Lê toda a linha

            if (response == 'c') {
                System.out.print("Título: ");
                String title = scanner.nextLine();
                System.out.print("URL: ");
                String url = scanner.nextLine();
                System.out.print("Duração em segundos: ");
                int seconds = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha pendente
                lessonList.add(new Video(title, url, seconds));
            } else if (response == 't') {
                System.out.print("Título: ");
                String title = scanner.nextLine();
                System.out.print("Descrição: ");
                String description = scanner.nextLine();
                System.out.print("Quantidade de questões: ");
                int questionCount = scanner.nextInt();
                scanner.nextLine(); // Consome a quebra de linha pendente
                lessonList.add(new Task(title, description, questionCount));
            }
        }

        int totalDuration = 0;
        for (Lesson lesson : lessonList) {
            totalDuration += lesson.duration();
        }
        System.out.println();
        System.out.printf("DURAÇÃO TOTAL DO CURSO = %d segundos", totalDuration);

        scanner.close();
    }
}