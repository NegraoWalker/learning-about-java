package avancado.generics.exemplo3_tipos_delimitados.exemplo3_tipos_delimitados_2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

/**
 * Sistema de cache que mantém elementos ordenados
 * Usa múltiplos bounds: T deve implementar tanto Serializable quanto Comparable
 */
public class CacheOrdenado<T extends Serializable & Comparable<T>> {
    private final TreeMap<String, T> cache;
    private final int maxSize;

    public CacheOrdenado(int maxSize) {
        this.cache = new TreeMap<>();
        this.maxSize = maxSize;
    }

    /**
     * Adiciona um item ao cache
     * Por causa dos bounds, sabemos que T pode ser serializado e comparado
     */
    public void adicionar(String chave, T valor) {
        // Se o cache estiver cheio, remove o item com menor valor
        if (cache.size() >= maxSize && !cache.containsKey(chave)) {
            // Podemos fazer isso porque T implements Comparable<T>
            removerMenorItem();
        }

        cache.put(chave, valor);
        System.out.println("Item adicionado: " + chave + " = " + valor);
    }

    /**
     * Remove o item com menor valor do cache
     * Isso só é possível porque T implements Comparable<T>
     */
    private void removerMenorItem() {
        if (cache.isEmpty()) return;

        // Encontra a chave com menor valor
        String chaveComMenorValor = null;
        T menorValor = null;

        for (Map.Entry<String, T> entry : cache.entrySet()) {
            if (menorValor == null || entry.getValue().compareTo(menorValor) < 0) {
                menorValor = entry.getValue();
                chaveComMenorValor = entry.getKey();
            }
        }

        if (chaveComMenorValor != null) {
            cache.remove(chaveComMenorValor);
            System.out.println("Item removido (menor valor): " + chaveComMenorValor);
        }
    }

    /**
     * Serializa o cache completo para arquivo
     * Possível porque T extends Serializable
     */
    public void salvarCache(String nomeArquivo) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(
                new FileOutputStream(nomeArquivo))) {
            // Podemos serializar porque T extends Serializable
            oos.writeObject(cache);
            System.out.println("Cache salvo em: " + nomeArquivo);
        }
    }

    /**
     * Obtém todos os valores ordenados
     * Funciona porque TreeMap mantém ordem usando Comparable<T>
     */
    public List<T> obterValoresOrdenados() {
        return cache.values().stream()
                .sorted() // Possível porque T implements Comparable<T>
                .collect(Collectors.toList());
    }

    public T obter(String chave) {
        return cache.get(chave);
    }

    public void exibirEstatisticas() {
        System.out.println("Tamanho atual do cache: " + cache.size());
        System.out.println("Valores ordenados: " + obterValoresOrdenados());
    }
}
