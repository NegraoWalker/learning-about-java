package conteudo3.arquivos.exemplo_leitura_arquivos_de_texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

//Usando NIO
public class Exemplo3 {
    public static void main(String[] args) {
        String path = "C:\\Walker\\input1.txt";
        try {
            List<String> linhas = Files.readAllLines(Paths.get(path));
            for (String linha : linhas) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
