package avancado.collections.estrutura_de_dados.array.intermediario;

public class MainIteracao {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Iteração é como percorrer todos os apartamentos de um prédio, visitando cada um para fazer alguma tarefa (ler, modificar, buscar).
         * Existem várias formas de percorrer: elevador (for), escadas (while), ou tour guiado (for-each). Cada uma tem suas vantagens!
         */

        //DECLARAÇÕES + INICIALIZAÇÕES:
        String[] produtos = {"Laptop", "Mouse", "Teclado", "Monitor", "Webcam"};
        double[] precos = {2500.00, 45.90, 150.00, 800.00, 120.00};
        int[] estoque = {10, 50, 25, 8, 15};

        System.out.println("============================================================================================");

        //FOR:
        //Estrutura: for(inicialização; condição; incremento)
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Índice " + i + ": " + produtos[i] + " - R$ " + precos[i] + " (estoque: " + estoque[i] + ")");
        }

        // Por que usar for tradicional?
        // - Você precisa do índice para acessar outros arrays relacionados
        // - Você quer modificar elementos baseado na posição
        // - Você precisa percorrer apenas parte do array
        // - Você quer percorrer de trás para frente

        System.out.println("============================================================================================");


        //FOR EACH:
        //Estrutura: for(Tipo elemento : array)
        //Lê-se: "para cada produto EM produtos"
        for (String produto : produtos) {
            System.out.println("Produto disponível: " + produto);
        }
        //ATENÇÃO: For-each NÃO dá acesso ao índice!
        //Como resolver? Usar o for tradicional


        System.out.println("============================================================================================");


        //WHILE:
        // While é útil quando você não sabe exatamente quantos elementos vai processar
        int indice = 0;
        int produtosCaros = 0; // Contador de produtos acima de R$ 200

        while (indice < precos.length) {
            if (precos[indice] > 200.00) {
                System.out.println("Produto caro encontrado: " + produtos[indice] + " - R$ " + String.format("%.2f", precos[indice]));
                produtosCaros++;

                // Podemos parar a busca se encontrarmos 2 produtos caros
                if (produtosCaros >= 2) {
                    System.out.println("Limite de produtos caros atingido. Parando busca.");
                    break; // Sai do while
                }
            }
            indice++; // MUITO IMPORTANTE: não esquecer de incrementar!
        }

        System.out.println("============================================================================================");


        //DO-WHILE:
        //Cenário: Validando se há pelo menos um produto em estoque
        int pos = 0;
        boolean temEstoque = false;

        // Array de exemplo com possível estoque zero
        int[] estoqueExemplo = {0, 0, 5, 0, 0}; // Só o terceiro item tem estoque

        if (estoqueExemplo.length > 0) { // Verificação de segurança
            do {
                if (estoqueExemplo[pos] > 0) {
                    System.out.println("Produto em estoque encontrado na posição " + pos + ": " + estoqueExemplo[pos] + " unidades");
                    temEstoque = true;
                    break;
                }
                pos++;
            } while (pos < estoqueExemplo.length);

            if (!temEstoque) {
                System.out.println("Nenhum produto em estoque encontrado!");
            }
        }

        System.out.println("============================================================================================");


        //ITERAÇÃO REVERSA (DE TRÁS PARA FRENTE):
        System.out.println("Útil para processamento em ordem inversa\n");

        System.out.println("Produtos em ordem reversa:");
        for (int i = produtos.length - 1; i >= 0; i--) {
            System.out.println((produtos.length - i) + "º: " + produtos[i]);
        }

        System.out.println("============================================================================================");


        //ITERAÇÃO PULANDO ELEMENTOS:
        System.out.println("Processando apenas elementos pares (0, 2, 4...)\n");
        for (int i = 0; i < produtos.length; i += 2) { // Incrementa de 2 em 2
            System.out.println("Posição " + i + ": " + produtos[i] +
                    " - R$ " + String.format("%.2f", precos[i]));
        }



    /*
     * QUANDO USAR CADA METODO:
         * FOR TRADICIONAL:
         * - Precisa do índice para acessar arrays relacionados
         * - Quer modificar elementos baseado na posição
         * - Precisa percorrer apenas parte do array
         * - Quer controle fino sobre início/fim/incremento
         *
         * FOR-EACH:
         * - Apenas lendo valores (não modificando o array)
         * - Não precisa do índice
         * - Código mais limpo e legível
         * - Menos propenso a erros de índice
         *
         * WHILE:
         * - Condição de parada mais complexa
         * - Não sabe quantos elementos vai processar
         * - Busca com parada precoce
     */




    }
}
