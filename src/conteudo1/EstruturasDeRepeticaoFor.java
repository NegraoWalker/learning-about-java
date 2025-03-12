package conteudo1;

import java.util.Scanner;

public class EstruturasDeRepeticaoFor {
    public static void main(String[] args) {
        String[] produtos = {"Celular", "Notebook", "Tablet", "Smartwatch"};

        System.out.println("Lista de produtos:");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println((i + 1) + ". " + produtos[i]);
        }
    }
}

