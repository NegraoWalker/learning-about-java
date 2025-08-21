package avancado.collections.estrutura_de_dados.array.basico;

public class MainDeclaracaoInicializacao {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Declaração é quando você informa ao Java que quer um array
         * Inicialização é quando você realmente cria o array na memória
         * Analogia: É como reservar uma mesa no restaurante (declaração) e depois chegar no restaurante e se sentar na mesa (inicialização)
         */

        //DECLARAÇÃO: Ainda não existe na memória, apenas foi reservado o nome
        int[] idades;
        double[] notas;
        String[] nomes;
//        System.out.println(numerosInteiros1); //Erro! Array nao foi inicializado

        System.out.println("============================================================================================");

        //INICIALIZAÇÃO: Cria o array vazio com tamanho fixo na memória
        idades = new int[5]; //Cria um array de tamanho fixo de 5 com todos os elementos com o valor de 0
        notas = new double[3]; //Cria um array de tamanho fixo de 3 com todos os elementos com o valor de 0.0
        nomes = new String[2]; //Cria um array de tamanho fixo de 2 com todos os elementos com o valor de null
        System.out.println(idades[0]);
        System.out.println(notas[0]);
        System.out.println(nomes[0]);

//        idades = {15, 32, 44, 50, 8}; //Erro!

        System.out.println("============================================================================================");

        //DECLARAÇÃO + INICIALIZAÇÃO: Usar quando se sabe quais são os elementos do array
        int[] datas = new int[]{1, 31, 29};
        double[] alturas = new double[]{1.88, 1.60};
        String[] cidades = new String[]{"Walker", "Maria", "Antonela", "Julia"};
        System.out.println("Tamanho do array idades: " + idades.length);
        System.out.println("Tamanho do array cidades: " + cidades.length);
    }
}
