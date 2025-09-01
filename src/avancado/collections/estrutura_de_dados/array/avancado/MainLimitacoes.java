package avancado.collections.estrutura_de_dados.array.avancado;

import java.util.ArrayList;
import java.util.Arrays;

public class MainLimitacoes {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Arrays são ferramentas poderosas, mas têm limitações importantes.
         * Como desenvolvedor backend, você precisa saber quando usar arrays e quando escolher outras estruturas de dados como ArrayList.
         * Pense nos arrays como carros de Fórmula 1: extremamente rápidos, mas não são práticos para uso diário na cidade!
         */

        // ==================== LIMITAÇÃO 1: TAMANHO FIXO ====================

        System.out.println("=== LIMITAÇÃO 1: TAMANHO FIXO ===\n");

        // Problema: Array criado com 5 posições sempre terá 5 posições
        String[] funcionarios = new String[5];
        funcionarios[0] = "Ana";
        funcionarios[1] = "Bruno";
        funcionarios[2] = "Carlos";

        System.out.println("Array de funcionários: " + Arrays.toString(funcionarios));
        System.out.println("Tamanho: " + funcionarios.length); // Sempre 5

        // Se precisar adicionar mais funcionários, você deve criar um novo array
        String[] funcionariosNovo = new String[8]; // Novo array maior

        // Copiando dados do array antigo para o novo (trabalhoso!)
        for (int i = 0; i < funcionarios.length; i++) {
            funcionariosNovo[i] = funcionarios[i];
        }

        // Agora pode adicionar os novos
        funcionariosNovo[5] = "Diana";
        funcionariosNovo[6] = "Eduardo";

        System.out.println("Novo array expandido: " + Arrays.toString(funcionariosNovo));

        // Compare com ArrayList (tamanho dinâmico)
        ArrayList<String> funcionariosList = new ArrayList<>();
        funcionariosList.add("Ana");
        funcionariosList.add("Bruno");
        funcionariosList.add("Carlos");

        System.out.println("ArrayList antes: " + funcionariosList);
        System.out.println("Tamanho: " + funcionariosList.size());

        // Adicionar é muito fácil!
        funcionariosList.add("Diana");
        funcionariosList.add("Eduardo");

        System.out.println("ArrayList após adicionar: " + funcionariosList);
        System.out.println("Novo tamanho: " + funcionariosList.size());

        // ==================== LIMITAÇÃO 2: INSERÇÃO NO MEIO É CUSTOSA ====================

        System.out.println("\n=== LIMITAÇÃO 2: INSERÇÃO NO MEIO ===\n");

        int[] numeros = {10, 20, 40, 50}; // Queremos inserir 30 entre 20 e 40
        System.out.println("Array original: " + Arrays.toString(numeros));

        // Para inserir no meio, precisamos:
        // 1. Criar novo array maior
        // 2. Copiar elementos antes da posição
        // 3. Inserir o novo elemento
        // 4. Copiar elementos após a posição

        int[] numerosComInsercao = new int[numeros.length + 1];
        int posicaoInserir = 2; // Inserir na posição 2
        int valorInserir = 30;

        // Copiando elementos antes da posição
        for (int i = 0; i < posicaoInserir; i++) {
            numerosComInsercao[i] = numeros[i];
        }

        // Inserindo novo elemento
        numerosComInsercao[posicaoInserir] = valorInserir;

        // Copiando elementos após a posição (deslocando)
        for (int i = posicaoInserir; i < numeros.length; i++) {
            numerosComInsercao[i + 1] = numeros[i];
        }

        System.out.println("Array após inserção manual: " + Arrays.toString(numerosComInsercao));

        // Compare com ArrayList
        ArrayList<Integer> numerosList = new ArrayList<>();
        numerosList.add(10);
        numerosList.add(20);
        numerosList.add(40);
        numerosList.add(50);

        System.out.println("ArrayList antes: " + numerosList);
        numerosList.add(2, 30); // Inserir 30 na posição 2 - muito simples!
        System.out.println("ArrayList após: " + numerosList);

        // ==================== LIMITAÇÃO 3: REMOÇÃO NO MEIO É CUSTOSA ====================

        System.out.println("\n=== LIMITAÇÃO 3: REMOÇÃO NO MEIO ===\n");

        String[] cores = {"Azul", "Verde", "Vermelho", "Amarelo", "Roxo"};
        System.out.println("Array original: " + Arrays.toString(cores));

        // Removendo "Vermelho" (posição 2)
        int posicaoRemover = 2;
        String[] coresSemVermelho = new String[cores.length - 1];

        // Copiando elementos antes da posição removida
        for (int i = 0; i < posicaoRemover; i++) {
            coresSemVermelho[i] = cores[i];
        }

        // Copiando elementos após a posição removida (puxando para trás)
        for (int i = posicaoRemover + 1; i < cores.length; i++) {
            coresSemVermelho[i - 1] = cores[i];
        }

        System.out.println("Array após remoção manual: " + Arrays.toString(coresSemVermelho));

        // Compare com ArrayList
        ArrayList<String> coresList = new ArrayList<>();
        coresList.add("Azul");
        coresList.add("Verde");
        coresList.add("Vermelho");
        coresList.add("Amarelo");
        coresList.add("Roxo");

        System.out.println("ArrayList antes: " + coresList);
        coresList.remove(2); // Remove posição 2 - muito simples!
        System.out.println("ArrayList após: " + coresList);

        // ==================== LIMITAÇÃO 4: FALTA DE MÉTODOS ÚTEIS ====================

        System.out.println("\n=== LIMITAÇÃO 4: FALTA DE MÉTODOS ÚTEIS ===\n");

        String[] animais = {"Gato", "Cachorro", "Pássaro", "Peixe"};

        // Arrays não têm métodos como contains(), indexOf(), etc.
        // Você precisa implementar manualmente

        String animalProcurado = "Pássaro";
        boolean encontrou = false;
        int indiceEncontrado = -1;

        // Busca manual
        for (int i = 0; i < animais.length; i++) {
            if (animais[i].equals(animalProcurado)) {
                encontrou = true;
                indiceEncontrado = i;
                break;
            }
        }

        System.out.println("Array contém '" + animalProcurado + "': " + encontrou);
        System.out.println("Posição: " + indiceEncontrado);

        // Compare com ArrayList (tem métodos prontos)
        ArrayList<String> animaisList = new ArrayList<>();
        animaisList.add("Gato");
        animaisList.add("Cachorro");
        animaisList.add("Pássaro");
        animaisList.add("Peixe");

        boolean contemArrayList = animaisList.contains(animalProcurado);
        int indiceArrayList = animaisList.indexOf(animalProcurado);

        System.out.println("ArrayList contém '" + animalProcurado + "': " + contemArrayList);
        System.out.println("Posição no ArrayList: " + indiceArrayList);

        // ==================== LIMITAÇÃO 5: VALORES PADRÃO PODEM CONFUNDIR ====================

        System.out.println("\n=== LIMITAÇÃO 5: VALORES PADRÃO ===\n");

        // Arrays são inicializados com valores padrão, o que pode confundir
        int[] idades = new int[5];        // Todos 0
        boolean[] status = new boolean[3]; // Todos false
        String[] nomes = new String[4];    // Todos null

        System.out.println("int[] com valores padrão: " + Arrays.toString(idades));
        System.out.println("boolean[] com valores padrão: " + Arrays.toString(status));
        System.out.println("String[] com valores padrão: " + Arrays.toString(nomes));

        // Problema: Como distinguir entre "valor não definido" e "valor zero"?
        idades[0] = 25; // Idade definida
        idades[1] = 0;  // Bebê recém-nascido OU valor não definido?

        System.out.println("idades[0] = " + idades[0] + " (definido)");
        System.out.println("idades[1] = " + idades[1] + " (bebê ou não definido?)");
        System.out.println("idades[2] = " + idades[2] + " (claramente não definido)");

        // Com ArrayList, você pode usar null para indicar "não definido"
        ArrayList<Integer> idadesList = new ArrayList<>();
        idadesList.add(25);   // Idade definida
        idadesList.add(0);    // Bebê (explicitamente zero)
        idadesList.add(null); // Não definido (explicitamente null)

        System.out.println("ArrayList com nulls: " + idadesList);

        // ==================== QUANDO USAR ARRAYS ====================

        System.out.println("\n=== QUANDO USAR ARRAYS ===\n");

        System.out.println("✓ USE ARRAYS QUANDO:");
        System.out.println("  - Você sabe o tamanho dos dados antecipadamente");
        System.out.println("  - Performance máxima é crucial");
        System.out.println("  - Trabalhando com grandes quantidades de dados primitivos");
        System.out.println("  - Implementando estruturas de dados personalizadas");
        System.out.println("  - Processamento matemático/científico (matrizes)");
        System.out.println("  - Jogos (tabuleiros, mapas, coordenadas)");
        System.out.println("  - Cache de tamanho fixo");

        // ==================== QUANDO NÃO USAR ARRAYS ====================

        System.out.println("\n=== QUANDO NÃO USAR ARRAYS ===\n");

        System.out.println("✗ NÃO USE ARRAYS QUANDO:");
        System.out.println("  - O tamanho dos dados varia frequentemente");
        System.out.println("  - Você precisa inserir/remover no meio frequentemente");
        System.out.println("  - Você quer métodos de conveniência (contains, indexOf, etc.)");
        System.out.println("  - Você está construindo APIs que outros desenvolvedores usarão");
        System.out.println("  - O código precisa ser mais legível que performático");

        // ==================== COMPARAÇÃO DE PERFORMANCE ====================

        System.out.println("\n=== COMPARAÇÃO DE PERFORMANCE ===\n");

        demonstrarPerformanceArrayVsArrayList();

        // ==================== EXEMPLOS PRÁTICOS BACKEND ====================

        System.out.println("\n=== EXEMPLOS PRÁTICOS BACKEND ===\n");

        // ✓ BOM USO: Cache de configurações (tamanho fixo, acesso frequente)
        String[] ambientes = {"development", "staging", "production"}; // Sempre 3
        int[] portasServidor = {8080, 8081, 8082}; // Correspondentes aos ambientes

        // Acesso super rápido por índice
        int ambienteAtual = 1; // staging
        System.out.println("Ambiente: " + ambientes[ambienteAtual]);
        System.out.println("Porta: " + portasServidor[ambienteAtual]);

        // ✓ BOM USO: Buffer de dados fixo
        byte[] buffer = new byte[1024]; // Buffer de 1KB para leitura de arquivos

        // ✓ BOM USO: Coordenadas/matrizes matemáticas
        double[][] matrizTransformacao = {
                {1.0, 0.0, 0.0},
                {0.0, 1.0, 0.0},
                {0.0, 0.0, 1.0}
        }; // Matriz identidade 3x3

        // ✗ MAU USO: Lista de usuários (tamanho varia)
        // String[] usuarios = new String[1000]; // E se tiver 1001 usuários?
        ArrayList<String> usuariosCorreto = new ArrayList<>(); // Cresce conforme necessário

        // ✗ MAU USO: Histórico de transações (sempre cresce)
        // int[] transacoes = new int[???]; // Quantas transações teremos?
        ArrayList<Integer> transacoesCorreto = new ArrayList<>(); // Sem limite pré-definido
    }

    // ==================== DEMONSTRAÇÃO DE PERFORMANCE ====================

    public static void demonstrarPerformanceArrayVsArrayList() {
        int tamanho = 1000000; // 1 milhão de elementos

        // Teste 1: Acesso por índice
        int[] array = new int[tamanho];
        ArrayList<Integer> arrayList = new ArrayList<>(tamanho);

        // Preenchendo ambos
        for (int i = 0; i < tamanho; i++) {
            array[i] = i;
            arrayList.add(i);
        }

        // Testando acesso por índice
        long inicioArray = System.nanoTime();
        long soma = 0;
        for (int i = 0; i < tamanho; i++) {
            soma += array[i];
        }
        long fimArray = System.nanoTime();

        long inicioArrayList = System.nanoTime();
        long somaArrayList = 0;
        for (int i = 0; i < tamanho; i++) {
            somaArrayList += arrayList.get(i);
        }
        long fimArrayList = System.nanoTime();

        System.out.println("Performance - Acesso por índice (" + tamanho + " elementos):");
        System.out.println("Array:     " + (fimArray - inicioArray) / 1000000 + " ms");
        System.out.println("ArrayList: " + (fimArrayList - inicioArrayList) / 1000000 + " ms");

        // Teste 2: Inserção no final
        ArrayList<Integer> listTeste = new ArrayList<>();

        long inicioInsercao = System.nanoTime();
        for (int i = 0; i < 100000; i++) {
            listTeste.add(i);
        }
        long fimInsercao = System.nanoTime();

        System.out.println("ArrayList - Inserção no final: " + (fimInsercao - inicioInsercao) / 1000000 + " ms");
        System.out.println("Array - Inserção no final: IMPOSSÍVEL (tamanho fixo)");

        // Conclusão
        System.out.println("\nConclusão:");
        System.out.println("- Arrays são mais rápidos para acesso direto");
        System.out.println("- ArrayLists são mais flexíveis para modificações");
        System.out.println("- Use arrays quando performance é crítica E tamanho é fixo");
        System.out.println("- Use ArrayList na maioria dos outros casos");
    }
}

/*
 * DECISÃO: ARRAY OU ARRAYLIST?
 *
 * ESCOLHA ARRAY QUANDO:
 * ✓ Performance é crítica
 * ✓ Tamanho é conhecido e fixo
 * ✓ Trabalhando com primitivos em grande quantidade
 * ✓ Implementando estruturas de dados de baixo nível
 * ✓ Processamento matemático/científico
 *
 * ESCOLHA ARRAYLIST QUANDO:
 * ✓ Tamanho varia durante execução
 * ✓ Precisa inserir/remover elementos frequentemente
 * ✓ Quer código mais limpo e legível
 * ✓ Precisa de métodos de conveniência
 * ✓ Na dúvida (ArrayList é mais seguro para maioria dos casos)
 *
 * REGRA PRÁTICA PARA BACKEND:
 * - Use ArrayList por padrão
 * - Mude para Array apenas quando tiver certeza que precisa da performance extra
 * - Arrays são otimização prematura na maioria dos casos
 * - Teste a performance real antes de otimizar
 */