package intermediario.construtores;

public class Conta {
    public int agencia;
    public int numero;
    public double saldo;
    public Cliente titular;

    //Método Construtor parametrizado:
    public Conta(int agencia, int numero, double saldo, Cliente titular) {
        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }
}
