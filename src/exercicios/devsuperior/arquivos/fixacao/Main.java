package exercicios.devsuperior.arquivos.fixacao;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String pathInput = "C:\\Walker\\input.csv";
        String pathOutputFolder = "C:\\Walker\\out";
        String pathOutputFile = "C:\\Walker\\out\\summary.csv";

        try {
            // Cria a pasta de saída, se não existir
            Files.createDirectories(Path.of(pathOutputFolder));

            // Lê as linhas do arquivo de entrada
            List<String> linhas = Files.readAllLines(Paths.get(pathInput));

            List<String> linhasOutput = new ArrayList<>();

            // Adiciona cabeçalho (opcional)
            linhasOutput.add("Produto;Total");

            for (String linha : linhas) {
                String[] campos = linha.split(";");
                String nome = campos[0].trim();
                double preco = Double.parseDouble(campos[1].trim().replace(",", "."));
                int quantidade = Integer.parseInt(campos[2].trim());
                double total = preco * quantidade;
                // Converte ponto para vírgula no valor formatado
                String totalFormatado = String.format("%.2f", total).replace(".", ",");
                String linhaSaida = nome + ";" + totalFormatado;
                linhasOutput.add(linhaSaida);
                System.out.println(linhaSaida);
            }

            // Escreve no arquivo summary.csv
            Files.write(Paths.get(pathOutputFile), linhasOutput);
            System.out.println("Arquivo gravado com sucesso em: " + pathOutputFile);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão numérica: " + e.getMessage());
        }
    }
}
