package avancado.collections.estrutura_de_dados.set.basico;

import java.util.*;

public class MainImplementacoes {
    public static void main(String[] args) {
        // Dados de teste - vamos adicionar na mesma ordem em todos os conjuntos
        String[] frutas = {"banana", "maçã", "uva", "laranja", "abacaxi"}; // Array de Strings

        // 1. HashSet - Sem garantia de ordem
        System.out.println("=== HashSet ===");
        Set<String> hashSet = new HashSet<>();
        for (String fruta : frutas) {
            hashSet.add(fruta);
        }
        System.out.println("Ordem no HashSet: " + hashSet);

        // 2. LinkedHashSet - Mantém ordem de inserção
        System.out.println("\n=== LinkedHashSet ===");
        Set<String> linkedHashSet = new LinkedHashSet<>();
        for (String fruta : frutas) {
            linkedHashSet.add(fruta);
        }
        System.out.println("Ordem no LinkedHashSet: " + linkedHashSet);

        // 3. TreeSet - Ordem alfabética automática
        System.out.println("\n=== TreeSet ===");
        Set<String> treeSet = new TreeSet<>();
        for (String fruta : frutas) {
            treeSet.add(fruta);
        }
        System.out.println("Ordem no TreeSet: " + treeSet);

        // Demonstrando que duplicatas são ignoradas
        System.out.println("\n=== Teste de Duplicatas ===");
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(2); // Duplicata - será ignorada
        numeros.add(3);
        numeros.add(1); // Duplicata - será ignorada

        System.out.println("Números adicionados: 1, 2, 2, 3, 1");
        System.out.println("Conjunto resultante: " + numeros);
        System.out.println("Tamanho do conjunto: " + numeros.size());

        // Operações básicas
        System.out.println("\n=== Operações Básicas ===");
        System.out.println("Contém o número 2? " + numeros.contains(2));
        System.out.println("Conjunto está vazio? " + numeros.isEmpty());

        // Convertendo para Array
        Integer[] arrayNumeros = numeros.toArray(new Integer[0]);
        System.out.println("Como array: " + Arrays.toString(arrayNumeros));
    }
}
