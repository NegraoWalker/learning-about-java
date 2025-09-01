package avancado.collections.estrutura_de_dados.set.intermediario;

import java.util.HashSet;
import java.util.Set;

public class MainOperacoes {
    public static void main(String[] args) {
        // Criando conjuntos para demonstrar as operações
        Set<String> linguagensBackend = new HashSet<>();
        linguagensBackend.add("Java");
        linguagensBackend.add("Python");
        linguagensBackend.add("C#");
        linguagensBackend.add("Node.js");

        Set<String> linguagensMobileWeb = new HashSet<>();
        linguagensMobileWeb.add("JavaScript");
        linguagensMobileWeb.add("Swift");
        linguagensMobileWeb.add("Java");
        linguagensMobileWeb.add("Python");

        System.out.println("Linguagens Backend: " + linguagensBackend);
        System.out.println("Linguagens Mobile/Web: " + linguagensMobileWeb);

        // 1. UNIÃO - addAll()
        // Combina todos os elementos dos dois conjuntos
        Set<String> uniao = new HashSet<>(linguagensBackend);
        uniao.addAll(linguagensMobileWeb);
        System.out.println("\nUNIÃO (todas as linguagens): " + uniao);

        // 2. INTERSEÇÃO - retainAll()
        // Mantém apenas elementos que existem em ambos os conjuntos
        Set<String> intersecao = new HashSet<>(linguagensBackend);
        intersecao.retainAll(linguagensMobileWeb);
        System.out.println("INTERSEÇÃO (linguagens comuns): " + intersecao);

        // 3. DIFERENÇA - removeAll()
        // Remove do primeiro conjunto todos os elementos do segundo
        Set<String> diferenca = new HashSet<>(linguagensBackend);
        diferenca.removeAll(linguagensMobileWeb);
        System.out.println("DIFERENÇA (apenas backend): " + diferenca);

        // 4. DIFERENÇA SIMÉTRICA
        // Elementos que estão em um ou outro conjunto, mas não em ambos
        Set<String> diferencaSimetrica = new HashSet<>(uniao);
        diferencaSimetrica.removeAll(intersecao);
        System.out.println("DIFERENÇA SIMÉTRICA (não comuns): " + diferencaSimetrica);

        // Exemplo prático: Sistema de permissões
        exemploPermissoes();
    }

    public static void exemploPermissoes() {
        System.out.println("\n=== EXEMPLO PRÁTICO: SISTEMA DE PERMISSÕES ===");

        // Permissões de diferentes tipos de usuário
        Set<String> permissoesAdmin = Set.of("READ", "WRITE", "DELETE", "ADMIN", "BACKUP");
        Set<String> permissoesEditor = Set.of("READ", "WRITE", "EDIT");
        Set<String> permissoesViewer = Set.of("READ");

        // Um usuário específico tem algumas permissões
        Set<String> permissoesUsuario = new HashSet<>();
        permissoesUsuario.add("READ");
        permissoesUsuario.add("WRITE");
        permissoesUsuario.add("DELETE");

        System.out.println("Permissões do usuário: " + permissoesUsuario);
        System.out.println("Permissões de admin: " + permissoesAdmin);

        // Verificar se o usuário tem todas as permissões de editor
        Set<String> verificaEditor = new HashSet<>(permissoesEditor);
        boolean ehEditor = permissoesUsuario.containsAll(verificaEditor);
        System.out.println("Usuário tem perfil de editor? " + ehEditor);

        // Verificar se o usuário tem todas as permissões de admin
        boolean ehAdmin = permissoesUsuario.containsAll(permissoesAdmin);
        System.out.println("Usuário tem perfil de admin? " + ehAdmin);

        // Quais permissões faltam para ser admin?
        Set<String> permissoesFaltantes = new HashSet<>(permissoesAdmin);
        permissoesFaltantes.removeAll(permissoesUsuario);
        System.out.println("Permissões faltantes para admin: " + permissoesFaltantes);

        // Quais permissões extras o usuário tem além de viewer?
        Set<String> permissoesExtras = new HashSet<>(permissoesUsuario);
        permissoesExtras.removeAll(permissoesViewer);
        System.out.println("Permissões extras além de viewer: " + permissoesExtras);
    }
}
