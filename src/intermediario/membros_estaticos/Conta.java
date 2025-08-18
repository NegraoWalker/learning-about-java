package intermediario.membros_estaticos;

public class Conta {
    public int agencia;
    public int numero;
    public String cliente;
    public double saldo;

    public static int total = 0; //Com a palavra static esse atributo do objeto se transforma em um atributo da classe ou estático

    public Conta() {
        total++;
    }


}
