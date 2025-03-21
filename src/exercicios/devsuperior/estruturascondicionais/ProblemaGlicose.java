package exercicios.devsuperior.estruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaGlicose {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("VERIFICAÇÃO DA QUANTIDADE DE GLICOSE:");
        System.out.println("-------------------------------------------------");
        System.out.println("Informe a medida de glicose: ");
        double qtdGlicose = scanner.nextDouble();

        if (qtdGlicose <= 100) {
            System.out.println("Classificação: Normal");
        } else if (qtdGlicose > 100 && qtdGlicose <= 140) {
            System.out.println("Classificação: Elevado");
        } else {
            System.out.println("Classificação: Diabetes");
        }

        scanner.close();
    }
}
