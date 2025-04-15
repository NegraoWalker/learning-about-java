package conteudo3.estrutura_de_dados.array;

import java.util.ArrayList;
import java.util.Arrays;

public class MetodosEPropriedades {
    public static void main(String[] args) {
        System.out.println("-----CRIANDO E ACESSANDO ARRAYS:-----");
        // Declaração e inicialização
        int[] numeros = {10, 20, 30};
        String[] nomes = new String[3];
        nomes[0] = "Ana";
        nomes[1] = "João";

        System.out.println("1. Primeiro número: " + numeros[0]); // 10
        System.out.println("1. Nome na posição 1: " + nomes[1]); // João
        System.out.println("---------------------------------------------------");

        System.out.println("-----ADICIONAR/REMOVER ELEMENTOS:-----");
        // Adicionar elemento (criando novo array)
        int[] novosNumeros = Arrays.copyOf(numeros, numeros.length + 1);
        novosNumeros[numeros.length] = 40;
        System.out.println("2. Array após adição: " + Arrays.toString(novosNumeros));

        // Remover último elemento (criando novo array)
        int[] numerosReduzidos = Arrays.copyOf(numeros, numeros.length - 1);
        System.out.println("2. Array após remoção: " + Arrays.toString(numerosReduzidos));
        System.out.println("---------------------------------------------------");

        System.out.println("-----ITERAÇÃO SOBRE ELEMENTOS:-----");
        System.out.println("3. For tradicional:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("   Índice " + i + ": " + numeros[i]);
        }

        System.out.println("\n3. For-each:");
        for (int num : numeros) {
            System.out.println("   Elemento: " + num);
        }
        System.out.println("---------------------------------------------------");

        System.out.println("-----BUSCA E VERIFICAÇÃO:-----");
        // Verificar se array contém elemento
        boolean contem20 = false;
        for (int num : numeros) {
            if (num == 20) {
                contem20 = true;
                break;
            }
        }
        System.out.println("4. Contém o número 20? " + contem20); // true

        // Busca binária (array deve estar ordenado)
        Arrays.sort(numeros);
        int indice = Arrays.binarySearch(numeros, 20);
        System.out.println("4. Índice do número 20: " + indice); // 1
        System.out.println("---------------------------------------------------");

        System.out.println("-----MESCLAGEM DE ARRAYS:-----");
        int[] array1 = {1, 2};
        int[] array2 = {3, 4};
        int[] merged = new int[array1.length + array2.length];

        System.arraycopy(array1, 0, merged, 0, array1.length);
        System.arraycopy(array2, 0, merged, array1.length, array2.length);
        System.out.println("5. Array mesclado: " + Arrays.toString(merged)); // [1,2,3,4]
        System.out.println("---------------------------------------------------");

        System.out.println("-----ARRAYS MULTIDIMENSIONAIS:-----");
        int[][] matriz = {{1, 2}, {3, 4}};
        System.out.println("6. Elemento [0][1]: " + matriz[0][1]); // 2
        System.out.println("6. Matriz completa: " + Arrays.deepToString(matriz));
        System.out.println("---------------------------------------------------");

        System.out.println("-----MÉTODOS ÚTEIS (CLASSE ARRAYS):-----");
        // Ordenação
        int[] desordenado = {5, 3, 1, 4};
        Arrays.sort(desordenado);
        System.out.println("7. Array ordenado: " + Arrays.toString(desordenado));

        // Preenchimento
        int[] vazio = new int[3];
        Arrays.fill(vazio, 100);
        System.out.println("7. Array preenchido: " + Arrays.toString(vazio));
        System.out.println("---------------------------------------------------");

        System.out.println("-----CÓPIA SEGURA:-----");
        int[] original = {10, 20, 30};
        int[] copiaProfunda = Arrays.copyOf(original, original.length);
        copiaProfunda[0] = 99;
        System.out.println("8. Original: " + Arrays.toString(original)); // [10,20,30]
        System.out.println("8. Cópia modificada: " + Arrays.toString(copiaProfunda)); // [99,20,30]
        System.out.println("---------------------------------------------------");

        System.out.println("-----CONVERSÃO PARA STRING/JSON:-----");
        String jsonArray = Arrays.toString(numeros);
        System.out.println("9. Array como string: " + jsonArray); // [10,20,30]
        System.out.println("---------------------------------------------------");

        System.out.println("-----VERIFICAÇÃO DE TIPO:-----");
        System.out.println("10. É array? " + numeros.getClass().isArray()); // true
        System.out.println("---------------------------------------------------");

        System.out.println("-----USANDO ARRAYLIST:-----");
        ArrayList<String> listaDinamica = new ArrayList<>();
        listaDinamica.add("Elemento 1");
        listaDinamica.add("Elemento 2");
        listaDinamica.remove(0);
        System.out.println("11. ArrayList modificado: " + listaDinamica); // [Elemento 2]
        System.out.println("---------------------------------------------------");
    }
}
