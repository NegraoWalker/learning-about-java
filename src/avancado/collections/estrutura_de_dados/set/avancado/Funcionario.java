package avancado.collections.estrutura_de_dados.set.avancado;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Funcionario {
    private String nome;
    private String departamento;
    private double salario;
    private Set<String> habilidades;
    private int idade;

    public Funcionario(String nome, String departamento, double salario, int idade) {
        this.nome = nome;
        this.departamento = departamento;
        this.salario = salario;
        this.idade = idade;
        this.habilidades = new HashSet<>();
    }

    public void adicionarHabilidade(String habilidade) {
        this.habilidades.add(habilidade.toLowerCase());
    }

    public void adicionarHabilidades(String... habilidades) {
        Arrays.stream(habilidades).forEach(this::adicionarHabilidade);
    }

    // Getters
    public String getNome() { return nome; }
    public String getDepartamento() { return departamento; }
    public double getSalario() { return salario; }
    public Set<String> getHabilidades() { return new HashSet<>(habilidades); }
    public int getIdade() { return idade; }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Funcionario that = (Funcionario) obj;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }

    @Override
    public String toString() {
        return String.format("Funcionario{nome='%s', depto='%s', salario=%.0f, habilidades=%s}",
                nome, departamento, salario, habilidades);
    }
}
