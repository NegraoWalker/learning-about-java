package exercicios.buildandrun.variaveiseostiposdedados;

import java.util.Locale;
import java.util.Scanner;

public class Aula10 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número com ponto flutuante: ");
        String numeroDePontoFlutuanteString = scanner.nextLine();
        double numeroPontoFlutuanteConvertidoDouble = Double.parseDouble(numeroDePontoFlutuanteString);
        float numeroPontoFlutuanteConvertidoFloat = Float.parseFloat(numeroDePontoFlutuanteString);
        System.out.printf("Convertido para double: %.2f\n", numeroPontoFlutuanteConvertidoDouble);
        System.out.printf("Convertido para float: %.2f\n", numeroPontoFlutuanteConvertidoFloat);

        System.out.println("Digite um número inteiro: ");
        String numeroInteiroString = scanner.nextLine();
        byte numeroConvertidoParaByte = Byte.parseByte(numeroInteiroString);
        short numeroConvertidoParaShort = Short.parseShort(numeroInteiroString);
        int numeroConvertidoParaInt = Integer.parseInt(numeroInteiroString);
        long numeroConvertidoParaLong = Long.parseLong(numeroInteiroString);

        System.out.println("Convertido para byte: " + numeroConvertidoParaByte);
        System.out.println("Convertido para short: " + numeroConvertidoParaShort);
        System.out.println("Convertido para int: " + numeroConvertidoParaInt);
        System.out.println("Convertido para long: " + numeroConvertidoParaLong);

        scanner.close();
    }
}
