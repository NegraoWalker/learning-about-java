package intermediario.exemplos_de_classe_e_objeto;

public class Caneta {
    //Atributos:
    public String cor;
    public String marca;
    public double ponta;
    public boolean tampada;

    //Métodos:
    public void destampar() {
        System.out.println("Caneta destampada!");
    }

    public void tampar() {
        System.out.println("Caneta tampada!");
    }

    public void escrever(String texto) {
        System.out.println(texto);
    }

}
