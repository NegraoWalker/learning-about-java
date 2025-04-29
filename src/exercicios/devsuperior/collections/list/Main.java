package exercicios.devsuperior.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        int tamanhoLista;
        int id;
        String nome;
        double salario, percentual;

        // Parte 1: Receber o tamanho da lista
        System.out.print("Informe a quantidade de funcionários: ");
        tamanhoLista = scanner.nextInt();

        // Parte 2: Instanciar a lista e adicionar os funcionários
        List<Funcionario> funcionarios = new ArrayList<>();

        for (int i = 0; i < tamanhoLista; i++) {
            System.out.println("Funcionário #" + (i + 1) + ":");
            System.out.print("Id: ");
            id = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do Enter
            System.out.print("Nome: ");
            nome = scanner.nextLine();
            System.out.print("Salário: ");
            salario = scanner.nextDouble();
            funcionarios.add(new Funcionario(id, nome, salario));
            System.out.println();
        }

        // Parte 3: Atualizar salário com base no ID
        System.out.print("Informe o Id do funcionário que quer incrementar o salário: ");
        id = scanner.nextInt();
        System.out.print("Informe o percentual de aumento: ");
        percentual = scanner.nextDouble();

        // Busca o funcionário pelo ID
        Funcionario funcionario = null;
        for (Funcionario f : funcionarios) {
            if (f.getId() == id) {
                funcionario = f;
                break;
            }
        }

        // Verifica se o funcionário foi encontrado
        if (funcionario != null) {
            funcionario.incrementarSalario(percentual);
        } else {
            System.out.println("Funcionário com o ID " + id + " não encontrado.");
        }

        // Parte 4: Imprime a lista final de funcionários
        System.out.println("\nLista de funcionários atualizada:");
        for (Funcionario f : funcionarios) {
            System.out.println(f);
        }

        scanner.close();
    }
}