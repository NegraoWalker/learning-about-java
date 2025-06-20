package conteudo3.arquivos.exemplo_criacao_de_pastas_e_arquivos_de_texto;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

//Listagem de arquivos de um path:
public class Exemplo3 {
    public static void main(String[] args) {
        Path path = Paths.get("D:\\");
        File[] pastas = path.toFile().listFiles(File::isFile);
        System.out.println("Arquivos presentes no path:");
        for (File pasta : pastas) {
            System.out.println(pasta);
        }
    }
}
