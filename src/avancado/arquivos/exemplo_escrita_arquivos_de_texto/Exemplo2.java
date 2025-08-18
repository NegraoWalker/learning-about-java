package avancado.arquivos.exemplo_escrita_arquivos_de_texto;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

//Usando NIO:
public class Exemplo2 {
    public static void main(String[] args) {
        String path = "C:\\Walker\\output3.txt";
        String conteudo = "Hello World!\nMy name is Walker!";
        try {
            Files.write(Paths.get(path), conteudo.getBytes());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
