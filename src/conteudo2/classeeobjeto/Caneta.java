package conteudo2.classeeobjeto;

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
