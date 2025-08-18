package basico;

public class EstruturasDeCondicao {
    public static void main(String[] args) {
        System.out.println("============================================================");
        int numero1 = 10;
        if (numero1 > 5) {
            System.out.println("O número 1 é maior que 5.");
        }

        System.out.println("============================================================");

        int numero2 = 3;
        if (numero2 > 7) {
            System.out.println("O número 2 é maior que 7.");
        } else {
            System.out.println("O número 2 não é maior que 7.");
        }

        System.out.println("============================================================");

        int numero3 = 7;
        if (numero3 > 10) {
            System.out.println("O número 3 é maior que 10.");
        } else if (numero3 > 5) {
            System.out.println("O número 3 é maior que 5, mas menor ou igual a 10.");
        } else {
            System.out.println("O número 3 é menor ou igual a 5.");
        }

        System.out.println("============================================================");

        int diaSemana = 3;
        switch (diaSemana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Dia inválido");
        }

        System.out.println("============================================================");

        int idade = 20;
        String status;
        status = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println(status);

        System.out.println("============================================================");
    }
}
