package conteudo3.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Declaração e inicialização de listas
        List<String> listaArrayList = new ArrayList<>(); // Implementação com array dinâmico
        List<Integer> listaLinkedList = new LinkedList<>(); // Implementação com lista encadeada

        // 2. Adicionando elementos
        listaArrayList.add("Maçã"); // Adiciona no final
        listaArrayList.add(0, "Banana"); // Insere na posição 0 (desloca outros elementos)
        listaArrayList.add("Laranja");

        listaLinkedList.add(10); // Autoboxing de int para Integer
        listaLinkedList.add(20);
        listaLinkedList.add(1, 15); // Insere 15 na posição 1

        System.out.println("Lista ArrayList inicial: " + listaArrayList); // [Banana, Maçã, Laranja]
        System.out.println("Lista LinkedList inicial: " + listaLinkedList); // [10, 15, 20]

        // 3. Acessando elementos
        String primeiroElemento = listaArrayList.get(0);
        System.out.println("\nPrimeiro elemento (ArrayList): " + primeiroElemento); // Banana

        // 4. Removendo elementos
        listaArrayList.remove("Banana"); // Remove por objeto
        listaArrayList.remove(1); // Remove por índice (remove "Laranja")

        listaLinkedList.remove(2); // Remove o elemento na posição 2 (valor 20)
        System.out.println("\nApós remoções:");
        System.out.println("ArrayList: " + listaArrayList); // [Maçã]
        System.out.println("LinkedList: " + listaLinkedList); // [10, 15]

        // 5. Verificações
        System.out.println("\nTamanho do ArrayList: " + listaArrayList.size()); // 1
        System.out.println("ArrayList está vazio? " + listaArrayList.isEmpty()); // false
        System.out.println("Contém 'Maçã'? " + listaArrayList.contains("Maçã")); // true
        System.out.println("Índice de 'Maçã': " + listaArrayList.indexOf("Maçã")); // 0

        // 6. Substituição de elemento
        listaArrayList.set(0, "Pêra");
        System.out.println("\nApós substituição: " + listaArrayList); // [Pêra]

        // 7. Iteração tradicional
        System.out.println("\nIteração com for-each:");
        for (String fruta : listaArrayList) {
            System.out.println(fruta);
        }

        // 8. Convertendo para array
        Object[] arrayFruta = listaArrayList.toArray();
        System.out.println("\nElemento do array convertido: " + arrayFruta[0]);

        // 9. Limpando a lista
        listaArrayList.clear();
        System.out.println("\nApós clear(): " + listaArrayList); // []

        // 10. Lista imutável (Java 9+)
        List<String> listaImutavel = List.of("A", "B", "C");
        System.out.println("\nLista imutável: " + listaImutavel);
        // listaImutavel.add("D"); // Lançaria UnsupportedOperationException

        // 11. Trabalhando com null
        listaArrayList.add(null);
        System.out.println("\nContém null? " + listaArrayList.contains(null)); // true

        // 12. Iteração com Iterator
        System.out.println("\nIteração com Iterator:");
        Iterator<Integer> it = listaLinkedList.iterator();
        while (it.hasNext()) {
            System.out.println("Elemento: " + it.next());
        }

        // 13. Iteração com forEach (Java 8+)
        System.out.println("\nIteração com forEach:");
        listaLinkedList.forEach(num -> System.out.println("Número: " + num));

        // 14. Uso de streams (Java 8+)
        System.out.println("\nUso de stream com filter:");
        listaLinkedList.stream()
                .filter(num -> num > 10)
                .forEach(System.out::println); // 15
    }
}
