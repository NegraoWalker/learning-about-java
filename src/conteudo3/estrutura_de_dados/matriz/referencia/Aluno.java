package conteudo3.estrutura_de_dados.matriz.referencia;

class Aluno {
    public String nome;
    public double notaFinal;

    // Construtor
    public Aluno(String nome, double notaFinal) {
        this.nome = nome;
        this.notaFinal = notaFinal;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + " | Nota Final: " + notaFinal);
    }


}
