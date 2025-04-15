package conteudo3.estrutura_de_dados.array.exemplo_primitivo1;

import java.util.Locale;
import java.util.Scanner;

public class ExemploPrimitivo1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;

        System.out.println("Informe o tamanho do vetor: ");
        int tamanho = scanner.nextInt();
        double[] vetor = new double[tamanho];

        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }

        for (int i=0; i< tamanho; i++) {
            sum += vetor[i];
        }
        double avg = sum / tamanho;
        System.out.printf("AVERAGE HEIGHT: %.2f%n", avg);
        scanner.close();
    }
}
