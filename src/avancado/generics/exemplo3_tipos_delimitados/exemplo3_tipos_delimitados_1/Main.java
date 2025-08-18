package avancado.generics.exemplo3_tipos_delimitados.exemplo3_tipos_delimitados_1;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Funciona com Integer
        ProcessadorEstatistico<Integer> processadorInt = new ProcessadorEstatistico<>();
        List<Integer> integers = Arrays.asList(10, 20, 30, 40, 50);
        System.out.println("Média dos inteiros: " + processadorInt.calcularMedia(integers));

        // Funciona com Double
        ProcessadorEstatistico<Double> processadorDouble = new ProcessadorEstatistico<>();
        List<Double> doubles = Arrays.asList(10.5, 20.3, 30.7, 40.1);
        System.out.println("Máximo dos doubles: " + processadorDouble.encontrarMaximo(doubles));

        // Funciona com BigDecimal (também é Number)
        ProcessadorEstatistico<BigDecimal> processadorBig = new ProcessadorEstatistico<>();
        List<BigDecimal> bigDecimals = Arrays.asList(
                new BigDecimal("100.50"),
                new BigDecimal("200.75"),
                new BigDecimal("300.25")
        );
        System.out.println("Soma dos BigDecimals: " + processadorBig.calcularSoma(bigDecimals));
    }
}
