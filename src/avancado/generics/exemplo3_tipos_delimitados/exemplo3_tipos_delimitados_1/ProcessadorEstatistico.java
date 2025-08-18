package avancado.generics.exemplo3_tipos_delimitados.exemplo3_tipos_delimitados_1;

import java.util.List;

/**
 * Exemplo real de tipos delimitados: Sistema de processamento de estatísticas que trabalha apenas com tipos numéricos
 */
public class ProcessadorEstatistico<T extends Number> {
    /*
     * Calcula a média de uma lista de números
     * Repare que podemos chamar doubleValue() porque T extends Number
    */
    public double calcularMedia(List<T> numeros) {
        if (numeros.isEmpty()) {
            throw new IllegalArgumentException("Lista de números não pode estar vazia!");
        }
        double soma = 0.0;
        for (T numero : numeros) {
            soma += numero.doubleValue(); // Podemos usar doubleValue() porque sabemos que T é um Number
        }
        return soma / numeros.size();
    }
    /*
     * Encontra o maior valor de uma lista de números
     * Usamos Comparable para poder comparar os valores
    */
    public T encontrarMaximo(List<T> numeros) {
        if (numeros.isEmpty()) {
            return null;
        }
        T maximo = numeros.get(0);
        for (T numero : numeros) {
            if (numero.doubleValue() > maximo.doubleValue()) { // Só podemos fazer esta comparação porque Number implementa Comparable
                maximo = numero;
            }
        }
        return maximo;
    }
    /*
     * Calcula a soma total dos elementos
    */
    public double calcularSoma(List<T> numeros) {
        return numeros.stream().mapToDouble(Number::doubleValue).sum(); // Metodo disponível por causa do bound
    }

}
