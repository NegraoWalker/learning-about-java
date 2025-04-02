package exercicios.devsuperior.membros_estaticos.problemacambio;

public class ConversaoDeMoeda {
    public static double cotacaoDolarAtual;
    public static int quantidadeDeDolares;

    public static final double IOF = 0.06;

    public static double quantidadeEmReais() {
        return quantidadeDeDolares * cotacaoDolarAtual;
    }

    public static double valorASerPagoMaisIOF() {
        return (quantidadeEmReais() * IOF) + quantidadeEmReais();
    }

    public static void exibeOValorConvertido() {
        System.out.println("Valor em reais: " + String.format("%.2f", valorASerPagoMaisIOF()));
    }
}
