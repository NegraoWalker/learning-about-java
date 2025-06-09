package exercicios.devsuperior.classes_atributos_e_metodos.problemaalunos;

public class Student {
    public String name;
    public double grade1;
    public double grade2;
    public double grade3;

    public double gradeYear() {
        return grade1 + grade2 + grade3;
    }

    public String approvedOrNot() {
        if (gradeYear() >= 60.00) {
            return "PASS";
        } else {
            return "FAILED" + "\n" + "Faltaram " + String.format("%.2f", howManyPoints()) + " pontos";
        }
    }

    public double howManyPoints() {
        return 60.00 - gradeYear();
    }

    @Override
    public String toString() {
        return "Nota final: " + String.format("%.2f", gradeYear()) + "\n" +
                approvedOrNot();
    }
}
