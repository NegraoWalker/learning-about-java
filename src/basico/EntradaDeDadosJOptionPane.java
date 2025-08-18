package basico;

import javax.swing.*;
import java.util.Locale;

public class EntradaDeDadosJOptionPane {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String name = JOptionPane.showInputDialog("Digite seu nome: ");
        String age = JOptionPane.showInputDialog("Digite sua idade: ");
        int convAge = Integer.parseInt(age);

        System.out.printf("Meu nome é %s, tenho %d anos.", name, convAge);
    }
}
