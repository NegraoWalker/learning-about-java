package exercicios.devsuperior.membros_estaticos.problemacambio;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        ConversaoDeMoeda conversaoDeMoeda = new ConversaoDeMoeda();

        System.out.println("Informe o valor do dólar atual: ");
        ConversaoDeMoeda.cotacaoDolarAtual = scanner.nextDouble();
        System.out.println("Informe a quantidade de dólares que deseja comprar: ");
        ConversaoDeMoeda.quantidadeDeDolares = scanner.nextInt();
        ConversaoDeMoeda.exibeOValorConvertido();
        scanner.close();
    }
}
