package basico;

public class EstruturasDeRepeticaoForEach {
    public static void main(String[] args) {
        double[] precos = {1500.00, 2500.00, 3000.00, 1200.00};
        double total = 0;

        for (double preco : precos) {
            total += preco;
        }

        System.out.println("O total da compra é: R$" + total);
    }
}
