package conteudo2.classeeobjeto;

public class Main {
    public static void main(String[] args) {
        Caneta caneta1 = new Caneta();
        Caneta caneta2 = new Caneta();

        caneta1.cor = "Azul";
        caneta1.marca = "Bic";
        caneta1.ponta = 0.5;
        caneta1.tampada = true;

        caneta2.cor = "Preta";
        caneta2.marca = "Faber-Castell";
        caneta2.ponta = 0.7;
        caneta2.tampada = false;

        System.out.println("-----------------------------------------------------------------------------------------");
        caneta1.destampar();
        caneta2.escrever("Hello World!");
        caneta2.tampar();
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(caneta1.marca);
        System.out.println("-----------------------------------------------------------------------------------------");
        System.out.println(caneta2.marca);
    }
}
