package exercicios.buildandrun.variaveiseostiposdedados;

import java.util.Locale;
import java.util.Scanner;

public class Aula7 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sistema de pesagem de pacientes");
        System.out.println("Informe o peso do paciente em Janeiro: ");
        double pesoPacienteJaneiro = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Fevereiro: ");
        double pesoPacienteFevereiro = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Março: ");
        double pesoPacienteMarco = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Abril: ");
        double pesoPacienteAbril = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Maio: ");
        double pesoPacienteMaio = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Junho: ");
        double pesoPacienteJunho = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Julho: ");
        double pesoPacienteJulho = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Agosto: ");
        double pesoPacienteAgosto = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Setembro: ");
        double pesoPacienteSetembro = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Outubro: ");
        double pesoPacienteOutubro = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Novembro: ");
        double pesoPacienteNovembro = scanner.nextDouble();
        System.out.println("Informe o peso do paciente em Dezembro: ");
        double pesoPacienteDezembro = scanner.nextDouble();

        double pesoMedioAnual = (pesoPacienteJaneiro + pesoPacienteFevereiro + pesoPacienteMarco + pesoPacienteAbril + pesoPacienteMaio + pesoPacienteJunho + pesoPacienteJulho +
                                pesoPacienteAgosto + pesoPacienteSetembro + pesoPacienteOutubro + pesoPacienteNovembro + pesoPacienteDezembro) / 12;
        System.out.printf("Peso médio anual do paciente: %.2f Kg", pesoMedioAnual);


        scanner.close();
    }
}
