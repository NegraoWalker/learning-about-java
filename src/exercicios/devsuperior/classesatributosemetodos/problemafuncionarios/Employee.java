package exercicios.devsuperior.classesatributosemetodos.problemafuncionarios;

public class Employee {
    public String name; //nome
    public double grossSalary; //salarioBruto
    public double tax; //imposto

    //salarioLiquido
    public double netSalary() {
        return grossSalary - tax;
    }

    //aumentarSalario
    public void increaseSalary(double percentage) {
        grossSalary += grossSalary * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Funcionário: " + name + "\n" +
                "Salário líquido: R$" + String.format("%.2f", netSalary());
    }
}
