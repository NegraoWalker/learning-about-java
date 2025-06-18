package conteudo3.arquivos.exemplo_escrita_arquivos_de_texto;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Exemplo1 {
    public static void main(String[] args) {
        //Usando as classes BufferedWriter e FileWriter - Escrita recriando o arquivo
        String path = "C:\\Walker\\output1.txt";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path))) {
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();
            bufferedWriter.write("My name is Walker!");
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        //Usando as classes BufferedWriter e FileWriter - Escrita sem recriar o arquivo e escrevendo no final
        String path2 = "C:\\Walker\\output2.txt";
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path2, true))) {
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();
            bufferedWriter.write("My name is Walker!");
            bufferedWriter.newLine();
        }catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
