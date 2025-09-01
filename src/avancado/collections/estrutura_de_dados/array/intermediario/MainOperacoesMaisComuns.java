package avancado.collections.estrutura_de_dados.array.intermediario;

import java.util.Arrays;

public class MainOperacoesMaisComuns {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Operações comuns são as tarefas que você mais fará com arrays:
         * buscar, ordenar, filtrar, somar, encontrar máximo/mínimo, etc.
         * Como desenvolvedor backend, você usará essas operações constantemente para processar dados de APIs, bancos de dados, arquivos, etc.
         */

        // ==================== DADOS PARA OS EXEMPLOS ====================

        int[] numeros = {45, 12, 78, 23, 67, 34, 89, 56};
        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        double[] precos = {29.90, 15.50, 42.75, 8.30, 67.20};

        // ==================== BUSCA LINEAR ====================

        System.out.println("=== BUSCA LINEAR ===\n");

        // Busca por valor específico
        int valorBuscado = 67;
        int posicaoEncontrada = -1; // -1 indica "não encontrado"

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == valorBuscado) {
                posicaoEncontrada = i;
                break; // Para assim que encontrar
            }
        }

        if (posicaoEncontrada != -1) {
            System.out.println("Valor " + valorBuscado + " encontrado na posição " + posicaoEncontrada);
        } else {
            System.out.println("Valor " + valorBuscado + " não encontrado");
        }

        // Busca em array de strings (case-sensitive)
        String nomeBuscado = "Carlos";
        boolean encontrou = false;

        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equals(nomeBuscado)) { // Use equals() para strings!
                System.out.println("Nome '" + nomeBuscado + "' encontrado na posição " + i);
                encontrou = true;
                break;
            }
        }

        if (!encontrou) {
            System.out.println("Nome '" + nomeBuscado + "' não encontrado");
        }

        // ==================== ENCONTRAR MÁXIMO E MÍNIMO ====================

        System.out.println("\n=== MÁXIMO E MÍNIMO ===\n");

        // Encontrando o maior número
        int maior = numeros[0]; // Assume o primeiro como maior
        int indiceMaior = 0;

        for (int i = 1; i < numeros.length; i++) { // Começa do índice 1
            if (numeros[i] > maior) {
                maior = numeros[i];
                indiceMaior = i;
            }
        }

        System.out.println("Maior número: " + maior + " (posição " + indiceMaior + ")");

        // Encontrando o menor número
        int menor = numeros[0]; // Assume o primeiro como menor
        int indiceMenor = 0;

        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] < menor) {
                menor = numeros[i];
                indiceMenor = i;
            }
        }

        System.out.println("Menor número: " + menor + " (posição " + indiceMenor + ")");

        // Encontrando maior preço
        double maiorPreco = precos[0];
        int indiceMaiorPreco = 0;

        for (int i = 1; i < precos.length; i++) {
            if (precos[i] > maiorPreco) {
                maiorPreco = precos[i];
                indiceMaiorPreco = i;
            }
        }

        System.out.println("Maior preço: R$ " + String.format("%.2f", maiorPreco) +
                " (posição " + indiceMaiorPreco + ")");

        // ==================== SOMA E MÉDIA ====================

        System.out.println("\n=== SOMA E MÉDIA ===\n");

        // Soma de todos os números
        int soma = 0;
        for (int numero : numeros) {
            soma += numero; // soma = soma + numero
        }

        double media = (double) soma / numeros.length; // Cast para double para precisão

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + String.format("%.2f", media));

        // Soma de preços
        double somaPrecos = 0;
        for (double preco : precos) {
            somaPrecos += preco;
        }

        System.out.println("Soma dos preços: R$ " + String.format("%.2f", somaPrecos));
        System.out.println("Preço médio: R$ " + String.format("%.2f", somaPrecos / precos.length));

        // ==================== CONTAGEM CONDICIONAL ====================

        System.out.println("\n=== CONTAGEM CONDICIONAL ===\n");

        // Contando números maiores que 50
        int maioresQue50 = 0;
        for (int numero : numeros) {
            if (numero > 50) {
                maioresQue50++;
            }
        }

        System.out.println("Números maiores que 50: " + maioresQue50);

        // Contando preços abaixo de R$ 30
        int precosBaratos = 0;
        for (double preco : precos) {
            if (preco < 30.00) {
                precosBaratos++;
            }
        }

        System.out.println("Produtos com preço abaixo de R$ 30: " + precosBaratos);

        // Contando nomes com mais de 5 caracteres
        int nomesLongos = 0;
        for (String nome : nomes) {
            if (nome.length() > 5) {
                nomesLongos++;
            }
        }

        System.out.println("Nomes com mais de 5 caracteres: " + nomesLongos);

        // ==================== VERIFICAÇÃO DE EXISTÊNCIA ====================

        System.out.println("\n=== VERIFICAÇÃO DE EXISTÊNCIA ===\n");

        // Verificando se existe algum número par
        boolean temPar = false;
        for (int numero : numeros) {
            if (numero % 2 == 0) { // Resto da divisão por 2 é 0 = par
                temPar = true;
                break; // Para assim que encontrar o primeiro
            }
        }

        System.out.println("Tem número par: " + (temPar ? "Sim" : "Não"));

        // Verificando se todos os preços são positivos
        boolean todosPositivos = true;
        for (double preco : precos) {
            if (preco <= 0) {
                todosPositivos = false;
                break; // Para assim que encontrar um negativo/zero
            }
        }

        System.out.println("Todos os preços são positivos: " + (todosPositivos ? "Sim" : "Não"));

        // ==================== CÓPIA DE ARRAYS ====================

        System.out.println("\n=== CÓPIA DE ARRAYS ===\n");

        // CUIDADO: Atribuição simples copia apenas a referência!
        int[] array1 = {1, 2, 3};
        int[] array2 = array1; // PERIGO! Ambos apontam para o mesmo local

        array2[0] = 999; // Isso também modifica array1!
        System.out.println("array1[0] após modificar array2[0]: " + array1[0]); // Será 999!

        // CÓPIA CORRETA - Método 1: Loop manual
        int[] original = {10, 20, 30, 40, 50};
        int[] copia1 = new int[original.length];

        for (int i = 0; i < original.length; i++) {
            copia1[i] = original[i];
        }

        // CÓPIA CORRETA - Método 2: System.arraycopy() (mais eficiente)
        int[] copia2 = new int[original.length];
        System.arraycopy(original, 0, copia2, 0, original.length);
        //                 src   srcPos dst  dstPos length

        // CÓPIA CORRETA - Método 3: Arrays.copyOf() (mais simples)
        int[] copia3 = Arrays.copyOf(original, original.length);

        // Testando se as cópias funcionaram
        copia1[0] = 111;
        copia2[1] = 222;
        copia3[2] = 333;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Cópia 1:  " + Arrays.toString(copia1));
        System.out.println("Cópia 2:  " + Arrays.toString(copia2));
        System.out.println("Cópia 3:  " + Arrays.toString(copia3));

        // ==================== ORDENAÇÃO ====================

        System.out.println("\n=== ORDENAÇÃO ===\n");

        // Ordenação usando Arrays.sort() (mais fácil)
        int[] numerosParaOrdenar = {45, 12, 78, 23, 67, 34};
        System.out.println("Antes da ordenação: " + Arrays.toString(numerosParaOrdenar));

        Arrays.sort(numerosParaOrdenar); // Modifica o array original!
        System.out.println("Após ordenação: " + Arrays.toString(numerosParaOrdenar));

        // Ordenação de strings (ordem alfabética)
        String[] nomesParaOrdenar = {"Carlos", "Ana", "Bruno", "Diana"};
        System.out.println("Nomes antes: " + Arrays.toString(nomesParaOrdenar));

        Arrays.sort(nomesParaOrdenar);
        System.out.println("Nomes após: " + Arrays.toString(nomesParaOrdenar));

        // Ordenação manual - Bubble Sort (para entender o conceito)
        int[] bubble = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Bubble sort - antes: " + Arrays.toString(bubble));

        // Bubble Sort simples
        for (int i = 0; i < bubble.length - 1; i++) {
            for (int j = 0; j < bubble.length - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    // Troca os elementos
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }
            }
        }

        System.out.println("Bubble sort - após: " + Arrays.toString(bubble));

        // ==================== REMOÇÃO (SIMULADA) ====================

        System.out.println("\n=== REMOÇÃO SIMULADA ===\n");

        // Arrays têm tamanho fixo, então "remoção" na verdade é criar novo array
        int[] arrayOriginal = {10, 20, 30, 40, 50};
        int indiceRemover = 2; // Remover o elemento 30 (índice 2)

        System.out.println("Array original: " + Arrays.toString(arrayOriginal));

        // Criando novo array menor
        int[] arrayRemovido = new int[arrayOriginal.length - 1];

        // Copiando elementos, pulando o índice a ser removido
        int novoIndice = 0;
        for (int i = 0; i < arrayOriginal.length; i++) {
            if (i != indiceRemover) {
                arrayRemovido[novoIndice] = arrayOriginal[i];
                novoIndice++;
            }
        }

        System.out.println("Após remover índice " + indiceRemover + ": " + Arrays.toString(arrayRemovido));

        // ==================== INSERÇÃO (SIMULADA) ====================

        System.out.println("\n=== INSERÇÃO SIMULADA ===\n");

        int[] arrayInserir = {10, 20, 40, 50};
        int posicaoInserir = 2; // Inserir na posição 2
        int valorInserir = 30;

        System.out.println("Array antes da inserção: " + Arrays.toString(arrayInserir));

        // Criando novo array maior
        int[] arrayInserido = new int[arrayInserir.length + 1];

        // Copiando elementos antes da posição de inserção
        for (int i = 0; i < posicaoInserir; i++) {
            arrayInserido[i] = arrayInserir[i];
        }

        // Inserindo o novo elemento
        arrayInserido[posicaoInserir] = valorInserir;

        // Copiando elementos após a posição de inserção
        for (int i = posicaoInserir; i < arrayInserir.length; i++) {
            arrayInserido[i + 1] = arrayInserir[i];
        }

        System.out.println("Após inserir " + valorInserir + " na posição " + posicaoInserir + ": " +
                Arrays.toString(arrayInserido));

        // ==================== COMPARAÇÃO DE ARRAYS ====================

        System.out.println("\n=== COMPARAÇÃO DE ARRAYS ===\n");

        int[] array_A = {1, 2, 3, 4, 5};
        int[] array_B = {1, 2, 3, 4, 5};
        int[] array_C = {1, 2, 3, 4, 6};

        // CUIDADO: == compara referências, não conteúdo!
        System.out.println("array_A == array_B: " + (array_A == array_B)); // false!

        // Use Arrays.equals() para comparar conteúdo
        System.out.println("Arrays.equals(array_A, array_B): " + Arrays.equals(array_A, array_B)); // true!
        System.out.println("Arrays.equals(array_A, array_C): " + Arrays.equals(array_A, array_C)); // false!

        // ==================== EXEMPLOS PRÁTICOS BACKEND ====================

        System.out.println("\n=== EXEMPLOS PRÁTICOS BACKEND ===\n");

        // Cenário 1: Processando IDs de usuários de uma consulta SQL
        long[] userIds = {1001, 1002, 1003, 1004, 1005, 1002}; // ID duplicado!

        // Encontrando IDs duplicados
        System.out.println("Procurando IDs duplicados:");
        for (int i = 0; i < userIds.length; i++) {
            for (int j = i + 1; j < userIds.length; j++) {
                if (userIds[i] == userIds[j]) {
                    System.out.println("ID duplicado encontrado: " + userIds[i] +
                            " (posições " + i + " e " + j + ")");
                }
            }
        }

        // Cenário 2: Validação de códigos de status HTTP
        int[] statusCodes = {200, 201, 404, 500, 403, 200, 401};

        // Contando tipos de resposta
        int sucessos = 0, errosCliente = 0, errosServidor = 0;

        for (int status : statusCodes) {
            if (status >= 200 && status < 300) {
                sucessos++;
            } else if (status >= 400 && status < 500) {
                errosCliente++;
            } else if (status >= 500) {
                errosServidor++;
            }
        }

        System.out.println("Análise de Status HTTP:");
        System.out.println("- Sucessos (2xx): " + sucessos);
        System.out.println("- Erros do Cliente (4xx): " + errosCliente);
        System.out.println("- Erros do Servidor (5xx): " + errosServidor);

        // Cenário 3: Cache de dados com timestamp
        long[] timestamps = {1640995200, 1640995260, 1640995320, 1640995380, 1640995440}; // Unix timestamps
        String[] dadosCache = {"user:123", "product:456", "order:789", "payment:101", "shipping:202"};

        // Removendo dados do cache mais antigos que 5 minutos (300 segundos)
        long agora = 1640995500; // Timestamp atual simulado
        long limiteIdade = agora - 300; // 5 minutos atrás

        System.out.println("Limpeza de cache (dados mais antigos que 5 min):");
        int dadosRemovidos = 0;

        for (int i = 0; i < timestamps.length; i++) {
            if (timestamps[i] < limiteIdade) {
                System.out.println("Removido do cache: " + dadosCache[i] +
                        " (idade: " + (agora - timestamps[i]) + "s)");
                dadosRemovidos++;
            }
        }

        System.out.println("Total de dados removidos: " + dadosRemovidos);

        // ==================== MÉTODOS ÚTEIS DA CLASSE ARRAYS ====================

        System.out.println("\n=== MÉTODOS ÚTEIS DA CLASSE ARRAYS ===\n");

        int[] exemploArray = {5, 2, 8, 1, 9, 3};

        // Arrays.toString() - para imprimir arrays facilmente
        System.out.println("Array original: " + Arrays.toString(exemploArray));

        // Arrays.sort() - ordenação
        int[] arrayParaOrdenar = Arrays.copyOf(exemploArray, exemploArray.length);
        Arrays.sort(arrayParaOrdenar);
        System.out.println("Array ordenado: " + Arrays.toString(arrayParaOrdenar));

        // Arrays.binarySearch() - busca binária (array DEVE estar ordenado!)
        int valorProcurado = 8;
        int posicao = Arrays.binarySearch(arrayParaOrdenar, valorProcurado);
        System.out.println("Posição do valor " + valorProcurado + " no array ordenado: " + posicao);

        // Arrays.fill() - preenchendo array com um valor
        int[] arrayPreenchido = new int[5];
        Arrays.fill(arrayPreenchido, 42);
        System.out.println("Array preenchido com 42: " + Arrays.toString(arrayPreenchido));

        // Arrays.copyOfRange() - copiando parte do array
        int[] parteArray = Arrays.copyOfRange(exemploArray, 1, 4); // Do índice 1 ao 3
        System.out.println("Parte do array (índices 1-3): " + Arrays.toString(parteArray));

        demonstrarPerformance();
    }

    // ==================== DEMONSTRAÇÃO DE PERFORMANCE ====================

    public static void demonstrarPerformance() {
        System.out.println("\n=== DEMONSTRAÇÃO DE PERFORMANCE ===\n");

        int tamanho = 100000; // 100 mil elementos
        int[] arrayGrande = new int[tamanho];

        // Preenchendo com números aleatórios
        for (int i = 0; i < tamanho; i++) {
            arrayGrande[i] = (int) (Math.random() * 1000000);
        }

        // Testando busca linear vs busca binária
        int valorBusca = arrayGrande[tamanho / 2]; // Valor que sabemos que existe

        // Busca linear
        long inicioLinear = System.nanoTime();
        int posicaoLinear = -1;
        for (int i = 0; i < arrayGrande.length; i++) {
            if (arrayGrande[i] == valorBusca) {
                posicaoLinear = i;
                break;
            }
        }
        long fimLinear = System.nanoTime();

        // Busca binária (precisa ordenar primeiro)
        long inicioOrdenacao = System.nanoTime();
        int[] arrayOrdenado = Arrays.copyOf(arrayGrande, arrayGrande.length);
        Arrays.sort(arrayOrdenado);
        long fimOrdenacao = System.nanoTime();

        long inicioBinaria = System.nanoTime();
        int posicaoBinaria = Arrays.binarySearch(arrayOrdenado, valorBusca);
        long fimBinaria = System.nanoTime();

        // Resultados
        System.out.println("Performance com " + tamanho + " elementos:");
        System.out.println("Busca linear: " + (fimLinear - inicioLinear) / 1000 + " microssegundos");
        System.out.println("Ordenação: " + (fimOrdenacao - inicioOrdenacao) / 1000000 + " milissegundos");
        System.out.println("Busca binária: " + (fimBinaria - inicioBinaria) / 1000 + " microssegundos");

        System.out.println("\nConclusão:");
        System.out.println("- Busca linear: O(n) - tempo cresce com o tamanho");
        System.out.println("- Busca binária: O(log n) - muito mais rápida em arrays grandes");
        System.out.println("- Mas busca binária requer array ordenado!");
    }
}

/*
 * RESUMO DAS OPERAÇÕES MAIS IMPORTANTES:
 *
 * BUSCA:
 * - Linear: O(n) - percorre elemento por elemento
 * - Binária: O(log n) - divide pela metade (array ordenado)
 *
 * ORDENAÇÃO:
 * - Arrays.sort(): muito eficiente, use sempre que possível
 * - Bubble Sort: O(n²) - apenas para entender conceitos
 *
 * MÁXIMO/MÍNIMO:
 * - Percorrer uma vez: O(n)
 * - Guardar posição para acessos futuros
 *
 * CÓPIA:
 * - Arrays.copyOf(): mais simples
 * - System.arraycopy(): mais controle
 * - Loop manual: quando precisar de lógica especial
 *
 * COMPARAÇÃO:
 * - Arrays.equals(): para comparar conteúdo
 * - == compara apenas referências!
 *
 * PERFORMANCE:
 * - Arrays são muito rápidos para acesso direto: O(1)
 * - Inserção/remoção no meio: O(n) - caros!
 * - Para operações dinâmicas frequentes, use ArrayList
 */