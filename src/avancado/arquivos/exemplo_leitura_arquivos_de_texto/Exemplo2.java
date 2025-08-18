package avancado.arquivos.exemplo_leitura_arquivos_de_texto;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

//Usando as classes BufferedReader e FileReader:
public class Exemplo2 {
    public static void main(String[] args) {
        String path = "C:\\Walker\\input1.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) { //Bloco try-with-resources
            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
