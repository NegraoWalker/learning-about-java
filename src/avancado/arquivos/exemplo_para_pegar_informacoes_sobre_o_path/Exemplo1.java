package avancado.arquivos.exemplo_para_pegar_informacoes_sobre_o_path;

import java.io.File;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Entre com o path do arquivo: ");
        String strPath = scanner.nextLine();

        File file = new File(strPath);

        System.out.println("Informações: ");
        System.out.println("Nome do arquivo: " + file.getName());
        System.out.println("Nome da pasta que o arquivo está armazenado: " + file.getParent());
        scanner.close();
    }
}
