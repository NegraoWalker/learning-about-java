package avancado.collections.estrutura_de_dados.list.avancado;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Integer> vendas = Arrays.asList(1500, 2300, 800, 4500, 1200, 3200, 900);

        // Pipeline funcional para análise de dados
        List<Integer> vendasAltas = vendas.stream()
                .filter(venda -> venda > 2000)           // Filtra vendas acima de R$ 2000
                .map(venda -> venda + (venda * 0.1))     // Adiciona bônus de 10%
                .map(Double::valueOf)                    // Converte para Double
                .map(Math::round)                        // Arredonda
                .map(Long::intValue)                     // Volta para Integer
                .sorted(Collections.reverseOrder())      // Ordena decrescente
                .collect(Collectors.toList());           // Coleta em nova List

        // Resultado: [4950, 3520, 2530] - vendas altas com bônus, ordenadas

        // Operações de agregação sem criar novas listas
        double mediaVendas = vendas.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        boolean temVendaAlta = vendas.stream().anyMatch(venda -> venda > 4000);


        System.out.println("===============================================================================================");
        // Sem genéricos - perigoso e propenso a erros
        List listaPerigosa = new ArrayList();
        listaPerigosa.add("String válida");
        listaPerigosa.add(42);              // Compila, mas pode causar ClassCastException
        listaPerigosa.add(true);            // Compila, mas pode causar problemas

        // Tentativa de uso - pode falhar em runtime
        String item = (String) listaPerigosa.get(1);  // ClassCastException!

        // Com genéricos - seguro em compile time
        List<String> listaSegura = new ArrayList<String>();
        listaSegura.add("String válida");
        // listaSegura.add(42);             // ERRO DE COMPILAÇÃO - problema detectado cedo!

        // Diamond operator (Java 7+) - tipo inferido automaticamente
        List<String> listaModerna = new ArrayList<>();  // Mais limpo, mesmo resultado

    }
}
