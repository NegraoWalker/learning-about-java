package avancado.collections.estrutura_de_dados.set.avancado;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // Criar dados de teste
        List<Funcionario> funcionarios = criarDadosTeste();

        demonstrarFiltragensComSet(funcionarios);
        System.out.println();

        demonstrarOperacoesConjunto(funcionarios);
        System.out.println();

        demonstrarAgrupamentos(funcionarios);
        System.out.println();

        demonstrarAnaliseHabilidades(funcionarios);
        System.out.println();

        demonstrarOperacoesAvancadas(funcionarios);
    }

    private static List<Funcionario> criarDadosTeste() {
        List<Funcionario> funcionarios = new ArrayList<>();

        Funcionario joao = new Funcionario("João Silva", "Backend", 8000, 28);
        joao.adicionarHabilidades("java", "spring", "mysql", "docker", "aws");

        Funcionario maria = new Funcionario("Maria Santos", "Frontend", 7500, 26);
        maria.adicionarHabilidades("javascript", "react", "css", "typescript", "docker");

        Funcionario pedro = new Funcionario("Pedro Costa", "Backend", 9000, 32);
        pedro.adicionarHabilidades("java", "spring", "postgresql", "kubernetes", "aws", "redis");

        Funcionario ana = new Funcionario("Ana Oliveira", "DevOps", 10000, 30);
        ana.adicionarHabilidades("docker", "kubernetes", "aws", "terraform", "jenkins", "linux");

        Funcionario carlos = new Funcionario("Carlos Lima", "Backend", 7000, 25);
        carlos.adicionarHabilidades("java", "spring", "mongodb", "docker");

        Funcionario lucia = new Funcionario("Lúcia Ferreira", "Frontend", 8500, 29);
        lucia.adicionarHabilidades("javascript", "vue", "typescript", "sass", "webpack");

        funcionarios.addAll(Arrays.asList(joao, maria, pedro, ana, carlos, lucia));
        return funcionarios;
    }

    private static void demonstrarFiltragensComSet(List<Funcionario> funcionarios) {
        System.out.println("=== FILTRAGENS COM SET ===");

        // 1. Funcionários que sabem Java
        Set<Funcionario> desenvolvedoresJava = funcionarios.stream()
                .filter(f -> f.getHabilidades().contains("java"))
                .collect(Collectors.toSet());

        System.out.println("Desenvolvedores Java (" + desenvolvedoresJava.size() + "):");
        desenvolvedoresJava.forEach(f -> System.out.println("  " + f.getNome()));

        // 2. Funcionários com salário acima de 8000 usando TreeSet para ordenação
        Set<Funcionario> altosGanhos = funcionarios.stream()
                .filter(f -> f.getSalario() > 8000)
                .collect(Collectors.toCollection(() ->
                        new TreeSet<>(Comparator.comparing(Funcionario::getSalario).reversed())
                ));

        System.out.println("\nFuncionários com salário > 8000 (ordenados por salário):");
        altosGanhos.forEach(f ->
                System.out.println("  " + f.getNome() + " - R$ " + f.getSalario())
        );

        // 3. Funcionários que sabem tanto Java quanto Docker
        Set<String> habilidadesRequeridas = Set.of("java", "docker");
        Set<Funcionario> fullStack = funcionarios.stream()
                .filter(f -> f.getHabilidades().containsAll(habilidadesRequeridas))
                .collect(Collectors.toSet());

        System.out.println("\nFuncionários que sabem Java E Docker:");
        fullStack.forEach(f -> System.out.println("  " + f.getNome()));
    }

    private static void demonstrarOperacoesConjunto(List<Funcionario> funcionarios) {
        System.out.println("=== OPERAÇÕES DE CONJUNTO COM STREAMS ===");

        // Separar funcionários por departamento
        Set<Funcionario> backend = funcionarios.stream()
                .filter(f -> f.getDepartamento().equals("Backend"))
                .collect(Collectors.toSet());

        Set<Funcionario> frontend = funcionarios.stream()
                .filter(f -> f.getDepartamento().equals("Frontend"))
                .collect(Collectors.toSet());

        Set<Funcionario> devops = funcionarios.stream()
                .filter(f -> f.getDepartamento().equals("DevOps"))
                .collect(Collectors.toSet());

        System.out.println("Backend: " + backend.stream().map(Funcionario::getNome).collect(Collectors.joining(", ")));
        System.out.println("Frontend: " + frontend.stream().map(Funcionario::getNome).collect(Collectors.joining(", ")));
        System.out.println("DevOps: " + devops.stream().map(Funcionario::getNome).collect(Collectors.joining(", ")));

        // União de todos os departamentos técnicos
        Set<Funcionario> todosTecnicos = Stream.of(backend, frontend, devops)
                .flatMap(Set::stream)
                .collect(Collectors.toSet());

        System.out.println("\nTodos os técnicos (" + todosTecnicos.size() + "): " +
                todosTecnicos.stream().map(Funcionario::getNome).collect(Collectors.joining(", ")));

        // Funcionários que trabalham com containerização (Docker ou Kubernetes)
        Set<Funcionario> containerizacao = funcionarios.stream()
                .filter(f -> f.getHabilidades().contains("docker") || f.getHabilidades().contains("kubernetes"))
                .collect(Collectors.toSet());

        System.out.println("\nFuncionários que trabalham com containerização:");
        containerizacao.forEach(f -> {
            Set<String> tecContainer = new HashSet<>(f.getHabilidades());
            tecContainer.retainAll(Set.of("docker", "kubernetes"));
            System.out.println("  " + f.getNome() + " - " + tecContainer);
        });
    }

    private static void demonstrarAgrupamentos(List<Funcionario> funcionarios) {
        System.out.println("=== AGRUPAMENTOS AVANÇADOS ===");

        // Agrupar funcionários por departamento (retorna Sets)
        Map<String, Set<Funcionario>> porDepartamento = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.toSet()
                ));

        System.out.println("Funcionários por departamento:");
        porDepartamento.forEach((depto, funcionarioSet) -> {
            System.out.println("  " + depto + " (" + funcionarioSet.size() + "): " +
                    funcionarioSet.stream().map(Funcionario::getNome).collect(Collectors.joining(", ")));
        });

        // Agrupar por faixa salarial
        Map<String, Set<Funcionario>> porFaixaSalarial = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        f -> {
                            if (f.getSalario() < 7500) return "Júnior";
                            else if (f.getSalario() < 9000) return "Pleno";
                            else return "Sênior";
                        },
                        Collectors.toSet()
                ));

        System.out.println("\nFuncionários por faixa salarial:");
        porFaixaSalarial.forEach((faixa, funcionarioSet) -> {
            double salarioMedio = funcionarioSet.stream()
                    .mapToDouble(Funcionario::getSalario)
                    .average()
                    .orElse(0);
            System.out.println("  " + faixa + " (" + funcionarioSet.size() + " funcionários, salário médio: R$ " +
                    String.format("%.0f", salarioMedio) + ")");
            funcionarioSet.forEach(f -> System.out.println("    - " + f.getNome() + " (R$ " + f.getSalario() + ")"));
        });
    }

    private static void demonstrarAnaliseHabilidades(List<Funcionario> funcionarios) {
        System.out.println("=== ANÁLISE DE HABILIDADES ===");

        // Todas as habilidades únicas da empresa
        Set<String> todasHabilidades = funcionarios.stream()
                .flatMap(f -> f.getHabilidades().stream())
                .collect(Collectors.toSet());

        System.out.println("Total de habilidades diferentes na empresa: " + todasHabilidades.size());
        System.out.println("Habilidades: " + todasHabilidades.stream().sorted().collect(Collectors.joining(", ")));

        // Habilidades mais populares (aparece em mais funcionários)
        Map<String, Long> popularidadeHabilidades = funcionarios.stream()
                .flatMap(f -> f.getHabilidades().stream())
                .collect(Collectors.groupingBy(
                        habilidade -> habilidade,
                        Collectors.counting()
                ));

        System.out.println("\nHabilidades mais populares:");
        popularidadeHabilidades.entrySet().stream()
                .sorted(Map.Entry.<String, Long>comparingByValue().reversed())
                .limit(5)
                .forEach(entry ->
                        System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " funcionários")
                );

        // Habilidades raras (apenas 1 funcionário tem)
        Set<String> habilidadesRaras = popularidadeHabilidades.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());

        System.out.println("\nHabilidades raras (apenas 1 funcionário): " + habilidadesRaras);

        // Funcionários com mais habilidades
        funcionarios.stream()
                .collect(Collectors.toMap(
                        Funcionario::getNome,
                        f -> f.getHabilidades().size()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(3)
                .forEach(entry ->
                        System.out.println("  " + entry.getKey() + ": " + entry.getValue() + " habilidades")
                );
    }

    private static void demonstrarOperacoesAvancadas(List<Funcionario> funcionarios) {
        System.out.println("=== OPERAÇÕES AVANÇADAS ===");

        // 1. Encontrar funcionários que poderiam formar uma equipe completa
        // (que juntos tenham todas as habilidades necessárias para um projeto)
        Set<String> habilidadesNecessarias = Set.of("java", "javascript", "docker", "aws");

        System.out.println("Habilidades necessárias para o projeto: " + habilidadesNecessarias);

        // Verificar se é possível formar a equipe
        Set<String> habilidadesDisponiveis = funcionarios.stream()
                .flatMap(f -> f.getHabilidades().stream())
                .collect(Collectors.toSet());

        habilidadesDisponiveis.retainAll(habilidadesNecessarias);
        boolean podeFormarEquipe = habilidadesDisponiveis.containsAll(habilidadesNecessarias);

        System.out.println("Pode formar equipe com habilidades necessárias? " + podeFormarEquipe);

        if (podeFormarEquipe) {
            // Encontrar a menor equipe possível
            Set<Funcionario> equipeMinima = encontrarEquipeMinima(funcionarios, habilidadesNecessarias);
            System.out.println("Equipe mínima encontrada (" + equipeMinima.size() + " pessoas):");
            equipeMinima.forEach(f -> System.out.println("  " + f.getNome() + " - " + f.getHabilidades()));
        }

        // 2. Análise de sobreposição de habilidades entre departamentos
        Map<String, Set<String>> habilidadesPorDepartamento = funcionarios.stream()
                .collect(Collectors.groupingBy(
                        Funcionario::getDepartamento,
                        Collectors.flatMapping(
                                f -> f.getHabilidades().stream(),
                                Collectors.toSet()
                        )
                ));

        System.out.println("\nHabilidades por departamento:");
        habilidadesPorDepartamento.forEach((depto, habilidades) ->
                System.out.println("  " + depto + " (" + habilidades.size() + "): " +
                        habilidades.stream().sorted().collect(Collectors.joining(", ")))
        );

        // Habilidades compartilhadas entre Backend e Frontend
        Set<String> habilidadesBackend = habilidadesPorDepartamento.get("Backend");
        Set<String> habilidadesFrontend = habilidadesPorDepartamento.get("Frontend");

        if (habilidadesBackend != null && habilidadesFrontend != null) {
            Set<String> habilidadesCompartilhadas = new HashSet<>(habilidadesBackend);
            habilidadesCompartilhadas.retainAll(habilidadesFrontend);
            System.out.println("\nHabilidades compartilhadas Backend/Frontend: " + habilidadesCompartilhadas);
        }
    }

    // Algoritmo simples para encontrar equipe mínima (pode não ser ótimo, mas demonstra o conceito)
    private static Set<Funcionario> encontrarEquipeMinima(List<Funcionario> funcionarios, Set<String> habilidadesNecessarias) {
        Set<Funcionario> equipe = new HashSet<>();
        Set<String> habilidadesConcluidas = new HashSet<>();

        // Ordenar funcionários por número de habilidades necessárias que possuem (estratégia gulosa)
        List<Funcionario> funcionariosOrdenados = funcionarios.stream()
                .sorted((f1, f2) -> {
                    Set<String> h1 = new HashSet<>(f1.getHabilidades());
                    h1.retainAll(habilidadesNecessarias);

                    Set<String> h2 = new HashSet<>(f2.getHabilidades());
                    h2.retainAll(habilidadesNecessarias);

                    return Integer.compare(h2.size(), h1.size()); // Ordem decrescente
                })
                .collect(Collectors.toList());

        // Selecionar funcionários até cobrir todas as habilidades
        for (Funcionario funcionario : funcionariosOrdenados) {
            Set<String> habilidadesNovas = new HashSet<>(funcionario.getHabilidades());
            habilidadesNovas.retainAll(habilidadesNecessarias);
            habilidadesNovas.removeAll(habilidadesConcluidas);

            if (!habilidadesNovas.isEmpty()) {
                equipe.add(funcionario);
                habilidadesConcluidas.addAll(habilidadesNovas);

                if (habilidadesConcluidas.containsAll(habilidadesNecessarias)) {
                    break;
                }
            }
        }

        return equipe;
    }
}

