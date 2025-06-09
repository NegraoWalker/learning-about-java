package exercicios.devsuperior.estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class ProblemaMediaIdades {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int idades;
        int somaIdades = 0;
        int count = 0;
        double mediaIdades;

        System.out.println("Informe as idades: ");

        do {
            idades = scanner.nextInt();
            if (idades < 0 && count == 0) {
                System.out.println("IMPOSSÍVEL CALCULAR!");
            }
            if (idades > 0) {
                somaIdades += idades;
                count++;
            }
        } while (idades > 0);

        if (somaIdades > 0) {
            mediaIdades = (double) somaIdades / count;
            System.out.printf("Média das idades: %.2f", mediaIdades);
        }
        scanner.close();
    }
}
