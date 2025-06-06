package exercicios.devsuperior.collections.list;

public class Funcionario {

    private Integer id;
    private String nome;
    private Double salario;

    public Funcionario() {
    }

    public Funcionario(Integer id) {
        this.id = id;
    }

    public Funcionario(Integer id, String nome, Double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public void incrementarSalario(double percentual) {
        double aumento = (percentual / 100) * this.salario;
        this.salario += aumento;
    }

    @Override
    public String toString() {
        return "Id: " + this.id + ", " + "Nome: " + this.nome + ", " + "Salário: " + "R$" + String.format("%.2f", this.salario);
    }
}
