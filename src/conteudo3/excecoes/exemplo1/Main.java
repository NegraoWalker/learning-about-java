package conteudo3.excecoes.exemplo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            String[] vetor = scanner.nextLine().split(" ");
            int posicao = scanner.nextInt();
            System.out.println(vetor[posicao]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice Inválido! -> Exception gerada: " + e);
        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida! -> Exception gerada: " + e);
        } finally {
            System.out.println("Final do programa!");
        }

        scanner.close();
    }
}
