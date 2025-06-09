package exercicios.devsuperior.classes_atributos_e_metodos.problemaretangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double largura, altura;
        System.out.println("Informe a largura e altura do retângulo: ");
        largura = scanner.nextDouble();
        altura = scanner.nextDouble();
        Retangulo retangulo = new Retangulo();
        retangulo.width = largura;
        retangulo.height = altura;
        System.out.println(retangulo);
        scanner.close();
    }
}
