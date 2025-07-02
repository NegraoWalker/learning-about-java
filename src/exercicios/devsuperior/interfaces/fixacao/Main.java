package exercicios.devsuperior.interfaces.fixacao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatoBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Entre com os dados do contrato:");
        System.out.println("Número:");
        int numero = scanner.nextInt();
        System.out.println("Data (dd/MM/yyyy):");
        String dataStr = scanner.nextLine();
        LocalDate data = LocalDate.parse(dataStr, formatoBR);
        System.out.println("Valor do contrato:");
        System.out.println();

        System.out.println("Entre com o número de parcelas:");
        int numeroDeParcelas = scanner.nextInt();
        System.out.println("Parcelas:");
        //Exibir o processamento aqui!




        scanner.close();
    }
}
