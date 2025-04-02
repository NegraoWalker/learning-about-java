package conteudo2.membros_estaticos;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Conta conta = new Conta();
        conta.agencia = 4000;
        conta.numero = 1001;
        conta.cliente = "Walker";

        Conta conta2 = new Conta();
        conta2.agencia = 4000;
        conta2.numero = 1002;
        conta2.cliente = "João";

        System.out.println(Conta.total); //Posso acessar o atributo estático usando a notação Classe.atributo
    }
}
