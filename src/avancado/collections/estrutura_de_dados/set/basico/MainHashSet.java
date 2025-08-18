package avancado.collections.estrutura_de_dados.set.basico;

import java.util.HashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        Set<String> listaDeFrutas = new HashSet<>(); // + RAPIDA | NAO MANTEM A ORDEM DOS ELEMENTOS ADICIONADOS

        listaDeFrutas.add("Maçã"); //METODO ADD() ADICIONA UM NOVO ELEMENTO A ESTRUTURA
        listaDeFrutas.add("Laranja");
        listaDeFrutas.add("Uva");
        listaDeFrutas.add("Banana");

//        listaDeFrutas.add("Maçã"); //TENTANDO ADICIONAR UMA DUPLICATA DE UM ELEMENTO - SET IGNORA!

        System.out.println("Elementos da estrutura: " + listaDeFrutas);
        System.out.println("Tamanho da estrutura: " + listaDeFrutas.size()); //METODO SIZE() RETORNA O TAMANHO DA ESTRUTURA HASHSET CRIADA

        if (listaDeFrutas.contains("Laranja")) { //METODO CONTAINS() RETORNA TRUE SE O ELEMENTO PESQUISADO ESTIVER DENTRO DA ESTRUTURA HASHSET
            System.out.println("Laranja está presente!");
        }

//        System.out.println(listaDeFrutas[0]); // NÃO PODE REALIZAR! ELEMENTOS DENTRO DO SET NÃO TEM ÍNDICES

        listaDeFrutas.remove("Banana"); //METODO REMOVE() REMOVE O ELEMENTO INFORMADO DA ESTRUTURA
        System.out.println("Elementos da estrutura: " + listaDeFrutas);

        System.out.println();

        System.out.println("Elementos da estrutura:");
        for (String fruta : listaDeFrutas) {
            System.out.println("- " + fruta);
        }

    }
}
