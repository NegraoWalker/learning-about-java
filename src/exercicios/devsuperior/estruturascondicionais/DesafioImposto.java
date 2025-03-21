package exercicios.devsuperior.estruturascondicionais;

import java.util.Locale;
import java.util.Scanner;

public class DesafioImposto {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        System.out.println("==================================================================");
        System.out.println("CÁLCULO DO IMPOSTO DE RENDA: ");
        System.out.println("==================================================================");
        System.out.print("Informe a renda anual com salário: ");
        double rendaAnualComSalario = scanner.nextDouble();
        System.out.print("Informe a renda anual com prestação de serviço: ");
        double rendaAnualComPrestacaoDeServico = scanner.nextDouble();
        System.out.print("Informe a renda anual com ganho de capital: ");
        double rendaAnualComGanhoDeCapital = scanner.nextDouble();
        System.out.print("Informe os gastos médicos: ");
        double gastosMedicos = scanner.nextDouble();
        System.out.print("Informe os gastos educacionais: ");
        double gastosEducacionais = scanner.nextDouble();


        double salarioMensal = rendaAnualComSalario / 12;
        double impostoSobreSalario = 0.0;

        if (salarioMensal >= 3000 && salarioMensal < 5000) {
            impostoSobreSalario = rendaAnualComSalario * 0.1;
        } else if (salarioMensal >= 5000) {
            impostoSobreSalario = rendaAnualComSalario * 0.2;
        }

        double impostoSobrePrestacaoDeServico = rendaAnualComPrestacaoDeServico * 0.15;
        double impostoSobreGanhoCapital = rendaAnualComGanhoDeCapital * 0.2;

        double impostoBrutoTotal = impostoSobreSalario + impostoSobrePrestacaoDeServico + impostoSobreGanhoCapital;

        double gastosTotais = gastosMedicos + gastosEducacionais;
        double limiteAbatimento = impostoBrutoTotal * 0.3;

        double abatimentoReal = Math.min(gastosTotais, limiteAbatimento);
        double impostoDevido = impostoBrutoTotal - abatimentoReal;

        System.out.println();
        System.out.println("------------------------------------");
        System.out.println("RELATÓRIO DE IMPOSTO DE RENDA: ");
        System.out.println("------------------------------------");
        System.out.printf("Imposto sobre o salário: R$%.2f\n", impostoSobreSalario);
        System.out.printf("Imposto sobre serviços: R$%.2f\n", impostoSobrePrestacaoDeServico);
        System.out.printf("Imposto sobre ganho de capital: R$%.2f\n", impostoSobreGanhoCapital);
        System.out.println();
        System.out.println("DEDUÇÕES:");
        System.out.printf("Valor máximo dedutível: R$%.2f\n", limiteAbatimento);
        System.out.printf("Gastos dedutíveis: R$%.2f\n", gastosTotais);
        System.out.println();
        System.out.println("RESUMO:");
        System.out.printf("Imposto bruto total: R$%.2f\n", impostoBrutoTotal);
        System.out.printf("Abatimento: R$%.2f\n", abatimentoReal);
        System.out.printf("Imposto devido: R$%.2f\n", impostoDevido);

        scanner.close();
    }
}