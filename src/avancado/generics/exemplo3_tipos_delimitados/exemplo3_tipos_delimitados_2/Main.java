package avancado.generics.exemplo3_tipos_delimitados.exemplo3_tipos_delimitados_2;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
      // Funciona com Integer (Serializable + Comparable)
        CacheOrdenado<Integer> cacheInt = new CacheOrdenado<>(3);
        cacheInt.adicionar("primeiro", 100);
        cacheInt.adicionar("segundo", 50);
        cacheInt.adicionar("terceiro", 150);
        cacheInt.adicionar("quarto", 75); // Vai remover o menor (50)

        cacheInt.exibirEstatisticas();

        // Funciona com String (Serializable + Comparable)
        CacheOrdenado<String> cacheStr = new CacheOrdenado<>(2);
        cacheStr.adicionar("nome1", "Carlos");
        cacheStr.adicionar("nome2", "Ana");
        cacheStr.adicionar("nome3", "Bruno"); // Vai remover "Ana" (menor lexicograficamente)

        cacheStr.exibirEstatisticas();
        cacheStr.salvarCache("cache_strings.dat");
    }
}
