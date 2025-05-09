package conteudo3.estrutura_de_dados.array.matriz.primitivos;

public class NotasAlunos {
    public static void main(String[] args) {
        // Declaração e inicialização da matriz 3x4 (3 alunos, 4 notas por aluno)
        double[][] notas = {
                {7.5, 8.0, 6.5, 9.0},   // Aluno 0
                {6.0, 5.5, 7.0, 6.5},   // Aluno 1
                {9.0, 8.5, 8.0, 9.5}    // Aluno 2
        };

        // Percorre os alunos (linhas da matriz)
        for (int i = 0; i < notas.length; i++) {
            double soma = 0;

            // Percorre as notas do aluno i (colunas da matriz)
            for (int j = 0; j < notas[i].length; j++) {
                soma += notas[i][j]; // Soma as notas do aluno i
            }

            double media = soma / notas[i].length; // Calcula a média
            System.out.println("Aluno " + i + " - Média: " + media);
        }
    }
}