package conteudo1;

import java.util.Locale;

public class FormatacaoDeSaidaComLocale {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        String name = "Walker";
        int age = 32;
        double salary = 3150.453;
        boolean male = true;

        System.out.print(name);
        System.out.println(age);
        System.out.printf("Meu nome é %s, tenho %d anos. Meu salário é R$%.2f, sou do sexo masculino: %b", name, age, salary, male);
    }
}
