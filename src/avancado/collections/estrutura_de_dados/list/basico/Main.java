package avancado.collections.estrutura_de_dados.list.basico;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ArrayList internamente mantém um array que pode crescer
        List<String> sistemaBanco = new ArrayList<>();

        // Quando você adiciona elementos, eles vão para as "prateleiras" em ordem
        sistemaBanco.add("Cliente-001");    // Posição 0
        sistemaBanco.add("Cliente-002");    // Posição 1
        sistemaBanco.add("Cliente-003");    // Posição 2

        System.out.println("Lista: " + sistemaBanco);

        // Acesso direto por índice é instantâneo - como ir direto à prateleira 1
        String segundo = sistemaBanco.get(1);  // O(1) - acesso direto

        // Mas inserir no meio requer deslocar todos os elementos subsequentes
        sistemaBanco.add(1, "Cliente-VIP");   // O(n) - precisa mover Cliente-002 e Cliente-003

        System.out.println("===============================================================================================");

        // LinkedList usa nós que apontam uns para os outros
        List<String> logSistema = new LinkedList<>();

        // Adicionar no final é eficiente - só precisa atualizar o último nó
        logSistema.add("Sistema iniciado");       // O(1)
        logSistema.add("Usuário logado");         // O(1)

        System.out.println("Lista: " + logSistema);

        // Inserir no início também é eficiente - só atualiza referências
        logSistema.add(0, "Configuração carregada");  // O(1)

        // Mas acessar por índice requer "caminhar" pela corrente
        String terceiro = logSistema.get(2);      // O(n) - precisa navegar pelos nós


    }
}
