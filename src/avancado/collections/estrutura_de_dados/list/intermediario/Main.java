package avancado.collections.estrutura_de_dados.list.intermediario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Declaração básica - deixa o Java escolher a implementação
        List<String> pedidos = new ArrayList<>();

        // Inicialização com capacidade estimada - evita realocações custosas
        List<String> pedidosOtimizados = new ArrayList<>(1000);

        // Inicialização com dados existentes - útil para testes e migrações
        List<String> pedidosIniciais = new ArrayList<>(Arrays.asList("Pedido-001", "Pedido-002", "Pedido-003"));

        // Listas imutáveis - dados que nunca devem mudar (Java 9+)
        List<String> statusValidos = List.of("PENDENTE", "PROCESSANDO", "CONCLUIDO");

        System.out.println("===============================================================================================");

        List<String> filaProcessamento = new ArrayList<>();

        // Adição no final - operação mais comum e eficiente
        filaProcessamento.add("Processamento-A");      // O(1) amortizado
        filaProcessamento.add("Processamento-B");      // O(1) amortizado

        // Adição em posição específica - pode ser custosa
        filaProcessamento.add(1, "Processamento-URGENTE");  // O(n) - desloca elementos

        // Adição de múltiplos elementos de uma só vez
        List<String> novosProcessamentos = Arrays.asList("Proc-C", "Proc-D", "Proc-E");
        filaProcessamento.addAll(novosProcessamentos);      // Mais eficiente que múltiplos add()

        // Inserção condicional - adiciona apenas se não existe
        if (!filaProcessamento.contains("Processamento-A")) {
            filaProcessamento.add("Processamento-A");
        }

        System.out.println("===============================================================================================");

        List<String> produtos = Arrays.asList("Notebook", "Mouse", "Teclado", "Monitor", "Mouse");

        // Acesso direto por índice - comportamento diferente por implementação
        String primeiro = produtos.get(0);           // ArrayList: O(1), LinkedList: O(n)
        String ultimo = produtos.get(produtos.size() - 1);  // ArrayList: O(1), LinkedList: O(n)

        // Busca por conteúdo - sempre O(n) para qualquer implementação
        boolean temMouse = produtos.contains("Mouse");        // Para na primeira ocorrência
        int posicaoMouse = produtos.indexOf("Mouse");         // Retorna primeira posição (1)
        int ultimaMouse = produtos.lastIndexOf("Mouse");      // Retorna última posição (4)

        // Verificações de estado - sempre O(1)
        int totalItens = produtos.size();          // Contador interno mantido
        boolean listaVazia = produtos.isEmpty();   // Equivale a size() == 0

        System.out.println("===============================================================================================");

        List<String> tarefas = new ArrayList<>(Arrays.asList("Backup", "Cleanup", "Debug", "Teste", "Deploy"));

        // Remoção por índice - retorna o elemento removido
        String tarefaRemovida = tarefas.remove(2);    // Remove "Debug", retorna "Debug"

        // Remoção por objeto - remove primeira ocorrência
        boolean removeuTeste = tarefas.remove("Teste");  // Retorna true se removeu

        // Remoção segura durante iteração - CRUCIAL para evitar exceptions
        Iterator<String> iterator = tarefas.iterator();
        while (iterator.hasNext()) {
            String tarefa = iterator.next();
            if (tarefa.startsWith("D")) {  // Remove tarefas que começam com "D"
                iterator.remove();         // Única forma segura durante iteração
            }
        }

        // Limpeza completa - mais eficiente que remover um por um
        tarefas.clear();  // Remove todos os elementos, mantém a capacidade interna


        System.out.println("===============================================================================================");
        List<String> logs = Arrays.asList("INFO: Sistema iniciado", "WARN: Memória baixa", "ERROR: Falha na conexão");

        // For-each é a forma mais limpa para leitura sequencial
        for (String log : logs) {
            // Processamento seguro - não pode modificar a lista aqui
            System.out.println("Processando: " + log);

            // NUNCA faça isso durante for-each:
            // logs.remove(log);  // ConcurrentModificationException!
        }
    }
}
