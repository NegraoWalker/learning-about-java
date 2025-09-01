package avancado.collections.estrutura_de_dados.array.avancado;

import java.util.Arrays;
import java.util.List;

public class MainPrincipaisMetodos {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Arrays em Java são simples por design - eles não têm muitos métodos próprios.
         * A maioria dos métodos úteis vem da classe java.util.Arrays.
         * Pense nos arrays como uma ferramenta básica (martelo) e a classe Arrays como uma caixa de ferramentas especializada para trabalhar com arrays.
         * Como desenvolvedor backend, estes métodos serão seus companheiros diários!
         */

        // ==================== PROPRIEDADES NATIVAS DO ARRAY ====================

        System.out.println("=== PROPRIEDADES NATIVAS DO ARRAY ===\n");

        // Os arrays têm apenas UMA propriedade nativa importante
        int[] numeros = {10, 20, 30, 40, 50};
        String[] nomes = {"Ana", "Bruno", "Carlos"};

        // .length - PROPRIEDADE (não método!) para obter o tamanho
        System.out.println("numeros.length: " + numeros.length);     // 5
        System.out.println("nomes.length: " + nomes.length);         // 3

        // CUIDADO: É .length SEM parênteses!
        // numeros.length() <- ISSO ESTÁ ERRADO!

        // Por que é propriedade e não metodo?
        // Para máxima performance - não há overhead de chamada de metodo
        System.out.println("Acesso ao tamanho é O(1) - instantâneo!");

        // ==================== Arrays.toString() - VISUALIZAÇÃO ====================

        System.out.println("\n=== Arrays.toString() - VISUALIZAÇÃO ===\n");

        // Sem Arrays.toString(), imprimir array mostra a referência de memória
        System.out.println("Array sem toString(): " + numeros); // [I@hashcode

        // Com Arrays.toString(), vemos o conteúdo de forma legível
        System.out.println("Array com toString(): " + Arrays.toString(numeros));
        System.out.println("Array de strings: " + Arrays.toString(nomes));

        // Para arrays multidimensionais, use deepToString()
        int[][] matriz = {{1, 2}, {3, 4}, {5, 6}};
        System.out.println("Matriz com toString(): " + Arrays.toString(matriz)); // Mostra referências!
        System.out.println("Matriz com deepToString(): " + Arrays.deepToString(matriz)); // Mostra conteúdo!

        // Por que isso é importante para backend?
        // - Logs mais legíveis para debug
        // - Respostas de API mais claras durante desenvolvimento
        // - Facilita troubleshooting de problemas em produção

        // ==================== Arrays.sort() - ORDENAÇÃO ====================

        System.out.println("\n=== Arrays.sort() - ORDENAÇÃO ===\n");

        // Arrays.sort() é extremamente eficiente (algoritmo Dual-Pivot Quicksort)
        int[] numerosDesordenados = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Antes da ordenação: " + Arrays.toString(numerosDesordenados));

        Arrays.sort(numerosDesordenados); // MODIFICA o array original!
        System.out.println("Após ordenação: " + Arrays.toString(numerosDesordenados));

        // Ordenação de strings (ordem lexicográfica/alfabética)
        String[] cidades = {"São Paulo", "Rio de Janeiro", "Belo Horizonte", "Salvador"};
        System.out.println("Cidades antes: " + Arrays.toString(cidades));

        Arrays.sort(cidades);
        System.out.println("Cidades após: " + Arrays.toString(cidades));

        // Ordenação parcial - apenas uma parte do array
        int[] numerosGrandes = {50, 30, 80, 10, 90, 20, 70};
        System.out.println("Array completo: " + Arrays.toString(numerosGrandes));

        // Ordena apenas do índice 1 ao 4 (exclusivo)
        Arrays.sort(numerosGrandes, 1, 5); // sort(array, fromIndex, toIndex)
        System.out.println("Ordenação parcial (índices 1-4): " + Arrays.toString(numerosGrandes));

        // Complexidade: O(n log n) - muito eficiente mesmo para arrays grandes
        System.out.println("Complexidade: O(n log n) - adequado para milhões de elementos");

        // ==================== Arrays.binarySearch() - BUSCA BINÁRIA ====================

        System.out.println("\n=== Arrays.binarySearch() - BUSCA BINÁRIA ===\n");

        // PRÉ-REQUISITO: Array DEVE estar ordenado!
        int[] arrayOrdenado = {5, 12, 23, 34, 45, 56, 67, 78, 89};
        System.out.println("Array ordenado: " + Arrays.toString(arrayOrdenado));

        // Buscando elementos que existem
        int valorProcurado = 45;
        int posicao = Arrays.binarySearch(arrayOrdenado, valorProcurado);
        System.out.println("Posição do valor " + valorProcurado + ": " + posicao);

        // Buscando elemento que NÃO existe
        int valorInexistente = 40;
        int posicaoInexistente = Arrays.binarySearch(arrayOrdenado, valorInexistente);
        System.out.println("Busca por " + valorInexistente + " retorna: " + posicaoInexistente);

        // Resultado negativo indica onde o elemento DEVERIA estar inserido
        if (posicaoInexistente < 0) {
            int posicaoInsercao = -(posicaoInexistente + 1);
            System.out.println("Elemento " + valorInexistente +
                    " deveria ser inserido na posição " + posicaoInsercao);
        }

        // Busca parcial em array ordenado
        int posicaoParcial = Arrays.binarySearch(arrayOrdenado, 2, 6, 45);
        System.out.println("Busca parcial por 45 entre índices 2-6: " + posicaoParcial);

        // Performance: O(log n) - extremamente rápida para arrays grandes
        System.out.println("Complexidade: O(log n) - encontra 1 elemento entre 1 milhão em ~20 comparações!");

        // ==================== Arrays.copyOf() - CÓPIA DE ARRAYS ====================

        System.out.println("\n=== Arrays.copyOf() - CÓPIA DE ARRAYS ===\n");

        int[] original = {10, 20, 30, 40, 50};
        System.out.println("Array original: " + Arrays.toString(original));

        // Cópia com mesmo tamanho
        int[] copia = Arrays.copyOf(original, original.length);
        System.out.println("Cópia igual: " + Arrays.toString(copia));

        // Cópia com tamanho maior (preenche com zeros)
        int[] copiaMaior = Arrays.copyOf(original, 8);
        System.out.println("Cópia maior: " + Arrays.toString(copiaMaior));

        // Cópia com tamanho menor (trunca)
        int[] copiaMenor = Arrays.copyOf(original, 3);
        System.out.println("Cópia menor: " + Arrays.toString(copiaMenor));

        // Testando independência das cópias
        original[0] = 999;
        System.out.println("Original modificado: " + Arrays.toString(original));
        System.out.println("Cópia não afetada: " + Arrays.toString(copia));

        // Arrays.copyOf() vs System.arraycopy()
        // copyOf() é mais simples, arraycopy() dá mais controle

        // ==================== Arrays.copyOfRange() - CÓPIA PARCIAL ====================

        System.out.println("\n=== Arrays.copyOfRange() - CÓPIA PARCIAL ===\n");

        String[] diasSemana = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};
        System.out.println("Todos os dias: " + Arrays.toString(diasSemana));

        // Copiando apenas dias úteis (índices 0 a 4, exclusivo do 5)
        String[] diasUteis = Arrays.copyOfRange(diasSemana, 0, 5);
        System.out.println("Dias úteis: " + Arrays.toString(diasUteis));

        // Copiando fim de semana (índices 5 a 7)
        String[] fimSemana = Arrays.copyOfRange(diasSemana, 5, 7);
        System.out.println("Fim de semana: " + Arrays.toString(fimSemana));

        // Muito útil para dividir arrays em chunks para processamento paralelo!

        // ==================== Arrays.fill() - PREENCHIMENTO ====================

        System.out.println("\n=== Arrays.fill() - PREENCHIMENTO ===\n");

        // Criando e preenchendo array com valor padrão
        int[] buffer = new int[10];
        System.out.println("Buffer vazio: " + Arrays.toString(buffer));

        Arrays.fill(buffer, 42); // Preenche TODAS as posições com 42
        System.out.println("Buffer preenchido: " + Arrays.toString(buffer));

        // Preenchimento parcial
        int[] configuracoes = new int[8];
        Arrays.fill(configuracoes, 0, 3, 100);    // Posições 0-2 com 100
        Arrays.fill(configuracoes, 3, 6, 200);    // Posições 3-5 com 200
        Arrays.fill(configuracoes, 6, 8, 300);    // Posições 6-7 com 300

        System.out.println("Configurações por seção: " + Arrays.toString(configuracoes));

        // Muito útil para:
        // - Inicializar cache com valores padrão
        // - Limpar buffers com zeros
        // - Configurar arrays de flags

        // ==================== Arrays.equals() - COMPARAÇÃO ====================

        System.out.println("\n=== Arrays.equals() - COMPARAÇÃO ===\n");

        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4, 6};

        // NUNCA use == para comparar arrays!
        System.out.println("array1 == array2: " + (array1 == array2)); // false - compara referências!

        // Use Arrays.equals() para comparar conteúdo
        System.out.println("Arrays.equals(array1, array2): " + Arrays.equals(array1, array2)); // true
        System.out.println("Arrays.equals(array1, array3): " + Arrays.equals(array1, array3)); // false

        // Para arrays multidimensionais, use deepEquals()
        int[][] matriz1 = {{1, 2}, {3, 4}};
        int[][] matriz2 = {{1, 2}, {3, 4}};

        System.out.println("Arrays.equals(matriz1, matriz2): " + Arrays.equals(matriz1, matriz2)); // false!
        System.out.println("Arrays.deepEquals(matriz1, matriz2): " + Arrays.deepEquals(matriz1, matriz2)); // true

        // ==================== System.arraycopy() - CÓPIA AVANÇADA ====================

        System.out.println("\n=== System.arraycopy() - CÓPIA AVANÇADA ===\n");

        // System.arraycopy() oferece controle total sobre a cópia
        int[] origem = {10, 20, 30, 40, 50, 60, 70};
        int[] destino = new int[10];

        System.out.println("Origem: " + Arrays.toString(origem));
        System.out.println("Destino antes: " + Arrays.toString(destino));

        // Sintaxe: arraycopy(src, srcPos, dest, destPos, length)
        System.arraycopy(origem, 2, destino, 3, 4);
        // Copia 4 elementos da origem (começando do índice 2)
        // para destino (começando do índice 3)

        System.out.println("Destino após: " + Arrays.toString(destino));

        // Útil para:
        // - Mover dados entre diferentes arrays
        // - Implementar estruturas de dados dinâmicas
        // - Otimizar operações de inserção/remoção

        // ==================== MÉTODOS PARA ARRAYS COMO LISTA ====================

        System.out.println("\n=== CONVERTENDO ARRAY PARA LISTA ===\n");

        // Arrays.asList() - converte array para List (view, não cópia!)
        String[] cores = {"Vermelho", "Verde", "Azul"};
        List<String> listaCores = Arrays.asList(cores);

        System.out.println("Array: " + Arrays.toString(cores));
        System.out.println("Lista: " + listaCores);

        // CUIDADO: Modificações afetam ambos!
        listaCores.set(0, "Amarelo"); // Modifica a lista
        System.out.println("Array após modificar lista: " + Arrays.toString(cores)); // Array também muda!

        // A lista tem tamanho fixo - não pode adicionar/remover
        // listaCores.add("Roxo"); // UnsupportedOperationException!

        // Para lista independente e modificável:
        List<String> listaIndependente = new java.util.ArrayList<>(Arrays.asList(cores));
        listaIndependente.add("Roxo"); // Agora funciona!
        System.out.println("Lista independente: " + listaIndependente);
        System.out.println("Array não afetado: " + Arrays.toString(cores));

        demonstrarCasosUsoBackend();
    }

    // ==================== CASOS DE USO PRÁTICOS PARA BACKEND ====================

    public static void demonstrarCasosUsoBackend() {
        System.out.println("\n=== CASOS DE USO PRÁTICOS BACKEND ===\n");

        // Caso 1: Processamento de logs com Arrays.sort()
        String[] timestampLogs = {"2024-01-15 10:30", "2024-01-15 08:15", "2024-01-15 12:45", "2024-01-15 09:30"};

        System.out.println("Logs desordenados: " + Arrays.toString(timestampLogs));
        Arrays.sort(timestampLogs); // Ordena cronologicamente
        System.out.println("Logs ordenados: " + Arrays.toString(timestampLogs));

        // Caso 2: Cache de IDs de usuários ativos com Arrays.binarySearch()
        long[] usuariosAtivos = {1001, 1005, 1012, 1023, 1034, 1045, 1056}; // JÁ ordenado!

        long usuarioVerificar = 1023;
        int posicaoUsuario = Arrays.binarySearch(usuariosAtivos, usuarioVerificar);

        boolean usuarioEstaAtivo = posicaoUsuario >= 0;
        System.out.println("Usuário " + usuarioVerificar + " está ativo: " + usuarioEstaAtivo);

        // Caso 3: Configuração de servidores com Arrays.fill()
        int[] portas = new int[5];
        Arrays.fill(portas, 8080); // Todas as instâncias começam na porta 8080

        // Ajustando portas específicas
        for (int i = 0; i < portas.length; i++) {
            portas[i] += i; // 8080, 8081, 8082, 8083, 8084
        }
        System.out.println("Portas dos servidores: " + Arrays.toString(portas));

        // Caso 4: Backup de configurações com Arrays.copyOf()
        String[] configProducao = {"db.host=prod.db.com", "cache.enabled=true", "log.level=INFO"};
        String[] backupConfig = Arrays.copyOf(configProducao, configProducao.length);

        System.out.println("Configuração original: " + Arrays.toString(configProducao));
        System.out.println("Backup da configuração: " + Arrays.toString(backupConfig));

        // Caso 5: Validação de dados com Arrays.equals()
        String[] dadosRecebidos = {"user123", "password456", "session789"};
        String[] dadosEsperados = {"user123", "password456", "session789"};

        boolean dadosValidos = Arrays.equals(dadosRecebidos, dadosEsperados);
        System.out.println("Dados recebidos são válidos: " + dadosValidos);

        // Caso 6: Paginação de resultados com Arrays.copyOfRange()
        String[] todosResultados = {"Item1", "Item2", "Item3", "Item4", "Item5", "Item6", "Item7", "Item8"};

        int paginaTamanho = 3;
        int paginaAtual = 1; // Segunda página (0-indexed)

        int inicio = paginaAtual * paginaTamanho;
        int fim = Math.min(inicio + paginaTamanho, todosResultados.length);

        String[] paginaResultados = Arrays.copyOfRange(todosResultados, inicio, fim);

        System.out.println("Página " + (paginaAtual + 1) + ": " + Arrays.toString(paginaResultados));
    }
}

/*
 * RESUMO DOS MÉTODOS MAIS IMPORTANTES:
 *
 * PROPRIEDADES NATIVAS:
 * - array.length : Obtém tamanho (O(1))
 *
 * VISUALIZAÇÃO:
 * - Arrays.toString(array) : Para debug e logs
 * - Arrays.deepToString(array) : Para arrays multidimensionais
 *
 * ORDENAÇÃO E BUSCA:
 * - Arrays.sort(array) : Ordenação eficiente O(n log n)
 * - Arrays.binarySearch(array, value) : Busca rápida O(log n) - requer array ordenado
 *
 * CÓPIA:
 * - Arrays.copyOf(array, newLength) : Cópia com redimensionamento
 * - Arrays.copyOfRange(array, from, to) : Cópia parcial
 * - System.arraycopy() : Cópia com controle total
 *
 * COMPARAÇÃO E PREENCHIMENTO:
 * - Arrays.equals(array1, array2) : Comparação de conteúdo
 * - Arrays.fill(array, value) : Preenchimento com valor
 *
 * CONVERSÃO:
 * - Arrays.asList(array) : Converte para List (view)
 *
 * DICA PRÁTICA:
 * Estes métodos cobrem 95% das operações que você fará com arrays.
 * Memorize Arrays.toString(), Arrays.sort(), Arrays.copyOf() e Arrays.equals() -
 * são os mais usados no dia a dia de desenvolvimento backend!
 */
