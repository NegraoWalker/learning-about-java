package avancado.collections.estrutura_de_dados.array.intermediario;

public class MainMultidimensionais {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Arrays multidimensionais são como prédios de apartamentos com múltiplos andares.
         * - Array 1D: Uma fileira de casas (linha única)
         * - Array 2D: Um prédio com andares e apartamentos (matriz/tabela)
         * - Array 3D: Vários prédios, cada um com andares e apartamentos
         *
         * Muito útil para: tabelas, matrizes matemáticas, jogos (tabuleiros), dados tabulares, coordenadas 3D, etc.
         */

        // ==================== ARRAYS BIDIMENSIONAIS (2D) ====================
        System.out.println("=== ARRAYS BIDIMENSIONAIS (MATRIZES) ===\n");
        // Declaração e inicialização
        int[][] matriz = new int[3][4]; // 3 linhas, 4 colunas (matriz 3x4)

        // Inicialização com valores específicos
        int[][] tabuleiro = {
                {1, 2, 3},    // Linha 0
                {4, 5, 6},    // Linha 1
                {7, 8, 9}     // Linha 2
        };

        // Acessando elementos: [linha][coluna]
        System.out.println("Elemento na posição [1][2]: " + tabuleiro[1][2]); // 6
        System.out.println("Elemento na posição [0][0]: " + tabuleiro[0][0]); // 1
        System.out.println("Elemento na posição [2][1]: " + tabuleiro[2][1]); // 8

        // Modificando elementos
        tabuleiro[1][1] = 99; // Mudando o 5 para 99
        System.out.println("Após modificação [1][1]: " + tabuleiro[1][1]); // 99

        // ==================== PERCORRENDO ARRAYS 2D ====================
        System.out.println("\n--- Percorrendo matriz com loops aninhados ---");

        // Metodo 1: For tradicional aninhado
        for (int linha = 0; linha < tabuleiro.length; linha++) {
            for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                System.out.print(tabuleiro[linha][coluna] + "\t"); // \t = tab
            }
            System.out.println(); // Nova linha após cada linha da matriz
        }

        // Metodo 2: For-each aninhado (mais limpo para leitura)
        System.out.println("\n--- Usando for-each ---");
        int numeroLinha = 0;
        for (int[] linha : tabuleiro) {
            System.out.print("Linha " + numeroLinha + ": ");
            for (int elemento : linha) {
                System.out.print(elemento + " ");
            }
            System.out.println();
            numeroLinha++;
        }

        // ==================== EXEMPLO PRÁTICO: NOTAS DE ALUNOS ====================

        System.out.println("\n=== EXEMPLO PRÁTICO: SISTEMA DE NOTAS ===");

        // Matriz onde cada linha é um aluno e cada coluna é uma prova
        // 4 alunos, 3 provas cada
        double[][] notasAlunos = {
                {8.5, 7.2, 9.1},  // Aluno 0: Ana
                {6.8, 8.9, 7.5},  // Aluno 1: Bruno
                {9.2, 8.8, 9.5},  // Aluno 2: Carlos
                {7.1, 6.9, 8.2}   // Aluno 3: Diana
        };

        String[] nomes = {"Ana", "Bruno", "Carlos", "Diana"};
        String[] provas = {"P1", "P2", "P3"};

        // Calculando média de cada aluno
        System.out.println("Médias dos alunos:");
        for (int aluno = 0; aluno < notasAlunos.length; aluno++) {
            double soma = 0;
            for (int prova = 0; prova < notasAlunos[aluno].length; prova++) {
                soma += notasAlunos[aluno][prova];
            }
            double media = soma / notasAlunos[aluno].length;
            System.out.println(nomes[aluno] + ": " + String.format("%.2f", media));
        }

        // Calculando média de cada prova
        System.out.println("\nMédias das provas:");
        for (int prova = 0; prova < provas.length; prova++) {
            double soma = 0;
            for (int aluno = 0; aluno < notasAlunos.length; aluno++) {
                soma += notasAlunos[aluno][prova];
            }
            double media = soma / notasAlunos.length;
            System.out.println(provas[prova] + ": " + String.format("%.2f", media));

        }

        // ==================== OPERAÇÕES COMUNS EM MATRIZES ====================

        System.out.println("\n=== OPERAÇÕES COMUNS EM MATRIZES ===");

        int[][] matrizA = {
                {1, 2, 3},
                {4, 5, 6}
        };

        int[][] matrizB = {
                {7, 8, 9},
                {10, 11, 12}
        };

        // Soma de matrizes (mesmo tamanho)
        System.out.println("Soma das matrizes:");
        int[][] matrizSoma = new int[matrizA.length][matrizA[0].length];

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                matrizSoma[i][j] = matrizA[i][j] + matrizB[i][j];
                System.out.print(matrizSoma[i][j] + "\t");
            }
            System.out.println();
        }

        // Encontrando maior elemento da matriz
        int maior = matrizA[0][0]; // Assume primeiro como maior
        int linhaMaior = 0, colunaMaior = 0;

        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[i].length; j++) {
                if (matrizA[i][j] > maior) {
                    maior = matrizA[i][j];
                    linhaMaior = i;
                    colunaMaior = j;
                }
            }
        }

        System.out.println("\nMaior elemento: " + maior + " na posição [" + linhaMaior + "][" + colunaMaior + "]");

        // ==================== ARRAYS TRIDIMENSIONAIS (3D) ====================

        System.out.println("\n=== ARRAYS TRIDIMENSIONAIS (3D) ===");

        // Imagine um prédio com vários andares, cada andar com salas, cada sala com itens
        // [prédio][andar][sala]
        int[][][] inventario = new int[2][3][4]; // 2 prédios, 3 andares, 4 salas

        // Inicializando com alguns valores
        inventario[0][1][2] = 15; // Prédio 0, andar 1, sala 2: 15 itens
        inventario[1][0][3] = 8;  // Prédio 1, andar 0, sala 3: 8 itens

        // Percorrendo array 3D
        System.out.println("Inventário dos prédios:");
        for (int predio = 0; predio < inventario.length; predio++) {
            System.out.println("Prédio " + predio + ":");
            for (int andar = 0; andar < inventario[predio].length; andar++) {
                for (int sala = 0; sala < inventario[predio][andar].length; sala++) {
                    int itens = inventario[predio][andar][sala];
                    if (itens > 0) { // Só mostra salas com itens
                        System.out.println("  Andar " + andar + ", Sala " + sala + ": " + itens + " itens");
                    }
                }
            }
        }

    }
}

/*
 * PONTOS-CHAVE PARA ARRAYS MULTIDIMENSIONAIS:
 * 1. Array 2D: array[linha][coluna] - como tabela Excel
 * 2. Array 3D: array[x][y][z] - como cubo de dados
 * 3. Use loops aninhados para percorrer (for dentro de for)
 * 4. array.length = número de linhas, array[i].length = colunas da linha i
 * 5. Útil para: jogos, matrizes matemáticas, dados tabulares, coordenadas
 * 6. Cuidado com índices: sempre verifique os limites
 * 7. Arrays 3D+ são menos comuns, mas úteis para dados complexos
 */
