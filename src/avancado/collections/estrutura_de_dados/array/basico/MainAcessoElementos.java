package avancado.collections.estrutura_de_dados.array.basico;

public class MainAcessoElementos {
    public static void main(String[] args) {
        /*
         * CONCEITO FUNDAMENTAL:
         * Acessar elementos é como usar o número do apartamento para encontrar e entrar em um apartamento específico no prédio.
         * REGRA DE OURO: Índices sempre começam em 0!
         * Array de 5 elementos: índices válidos são 0, 1, 2, 3, 4
         */

        //DECLARAÇÕES + INICIALIZAÇÕES:
        String[] funcionarios = new String[]{"Ana", "Bruno", "Carlos", "Diana", "Eduardo"};
        int[] salarios = new int[]{5000, 6500, 4800, 7200, 5500};
        boolean[] ativo = new boolean[]{true, true, false, true, true};

        System.out.println("============================================================================================");

        //ACESSANDO E EXIBINDO O ELEMENTO A PARTIR DO ÍNDICE/POSIÇÃO:
        System.out.println("Primeiro funcionário: " + funcionarios[0]);    // Ana (índice 0)
        System.out.println("Segundo funcionário: " + funcionarios[1]);     // Bruno (índice 1)
        System.out.println("Último funcionário: " + funcionarios[4]);      // Eduardo (índice 4)

        System.out.println("============================================================================================");

        //MODIFICANDO OS ELEMENTOS DO ARRAY:
        System.out.println("Salário original do Carlos: R$ " + salarios[2]); //Armazenando o valor original para comparação
        salarios[2] = 5200; //Modificando o salário do carlos (índice 2) -> Aumentando de R$ 4800 para R$ 5200
        System.out.println("Salário atualizado do Carlos: R$ " + salarios[2]);

        System.out.println("============================================================================================");

        //IMPORTANTE: length é uma propriedade, NÃO um metodo (sem parênteses!)
        System.out.println("Total de funcionários: " + funcionarios.length);
        System.out.println("Total de salários: " + salarios.length);

        System.out.println("Último funcionário: " + funcionarios[funcionarios.length - 1]); //Usando length para acessar o último elemento de qualquer array

    }
}

/*
 * PONTOS-CHAVE PARA LEMBRAR:
 * 1. Índices começam SEMPRE em 0
 * 2. Último índice é sempre (length - 1)
 * 3. Use .length para obter tamanho (SEM parênteses)
 * 4. Índices podem ser variáveis ou expressões
 * 5. Sempre valide índices antes de usar
 * 6. ArrayIndexOutOfBoundsException é o erro mais comum
 * 7. Índices negativos sempre causam erro em Java
 * 8. Use try-catch para tratar acessos inseguros
 */