package avancado.collections.estrutura_de_dados.array.basico;

public class Main {
    public static void main(String[] args) {
        int[] idades; //AINDA NÃO EXISTE NA MEMORIA | SÓ DECLAROU E RESERVOU O NOME
        double[] notas; //AINDA NÃO EXISTE NA MEMORIA | SÓ DECLAROU E RESERVOU O NOME
        String[] nomes;
//        System.out.println(numerosInteiros1); //ERRO! ARRAY NAO FOI INICIALIZADO

        idades = new int[5]; //INICIALIZANDO O ARRAY VAZIO | COM TAMANHO FIXO DE 5 | PARA INT CADA POSICAO/INDICE É PREENCHIDA(O)/ARMAZENADO COM VALOR 0
        notas = new double[3]; //INICIALIZANDO O ARRAY VAZIO | COM TAMANHO FIXO DE 3 | PARA DOUBLE CADA POSICAO/INDICE É PREENCHIDA(O)/ARMAZENADO COM VALOR 0.0
        nomes = new String[2]; //INICIALIZANDO O ARRAY VAZIO | COM TAMANHO FIXO DE 2 | PARA STRING CADA POSICAO/INDICE É PREENCHIDA(O)/ARMAZENADO COM VALOR NULL

        System.out.println(idades[0]);
        System.out.println(notas[0]);
        System.out.println(nomes[0]);

//        idades = {15, 32, 44, 50, 8}; //ERRO!

        int[] datas = new int[]{1, 31, 29}; //INICIALIZAÇÃO DE FORMA RÁPIDA -> USAR QUANDO SE SABE OS ELEMENTOS DO ARRAY
        double[] alturas = new double[]{1.88, 1.60}; //INICIALIZAÇÃO DE FORMA RÁPIDA -> USAR QUANDO SE SABE OS ELEMENTOS DO ARRAY
        String[] cidades = new String[]{"Walker", "Maria", "Antonela", "Julia"}; //INICIALIZAÇÃO DE FORMA RÁPIDA -> USAR QUANDO SE SABE OS ELEMENTOS DO ARRAY

        System.out.println("Tamanho do array idades: " + idades.length);
        System.out.println("Tamanho do array cidades: " + cidades.length);

    }
}
