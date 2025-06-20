package conteudo3.arquivos.exemplo_criacao_de_pastas_e_arquivos_de_texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

//Criação de uma pasta usando NIO:
public class Exemplo1 {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\/teste");
        try {
            Files.createDirectories(path);
            System.out.println("Pasta criada!");
        } catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
