package conteudo3.arquivos.exemplo_leitura_arquivos_de_texto;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Usando as classes File e Scanner:
public class Exemplo1 {
    public static void main(String[] args) {
        File file = new File("C:\\Walker\\input1.txt");
        Scanner scanner = null;

        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (scanner != null) {
                scanner.close();
            }
        }
    }
}
