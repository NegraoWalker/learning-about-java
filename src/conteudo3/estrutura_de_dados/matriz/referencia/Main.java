package conteudo3.estrutura_de_dados.matriz.referencia;

public class Main {
    public static void main(String[] args) {
        // Criando uma matriz de 2 turmas com 3 alunos cada
        Aluno[][] turmas = new Aluno[2][3];

        // Preenchendo a matriz com alunos
        turmas[0][0] = new Aluno("Ana", 8.5);
        turmas[0][1] = new Aluno("Bruno", 7.0);
        turmas[0][2] = new Aluno("Carlos", 9.2);

        turmas[1][0] = new Aluno("Daniela", 6.8);
        turmas[1][1] = new Aluno("Eduardo", 7.9);
        turmas[1][2] = new Aluno("Fernanda", 8.3);

        // Exibindo os dados dos alunos
        for (int i = 0; i < turmas.length; i++) {
            System.out.println("Turma " + (i + 1) + ":");

            for (int j = 0; j < turmas[i].length; j++) {
                turmas[i][j].exibirInfo();
            }
            System.out.println(); // linha em branco entre turmas
        }
    }
}
