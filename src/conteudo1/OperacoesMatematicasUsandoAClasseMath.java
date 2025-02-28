package conteudo1;

public class OperacoesMatematicasUsandoAClasseMath {
    public static void main(String[] args) {
        System.out.println("============================================================================");
        // Constantes
        System.out.println("Valor de PI: " + Math.PI);
        System.out.println("Valor de E: " + Math.E);

        System.out.println("============================================================================");

        // Operações básicas
        int numero = -15;
        System.out.println("Valor absoluto de " + numero + ": " + Math.abs(numero));

        System.out.println("============================================================================");

        double num1 = 7.8, num2 = 3.4;
        System.out.println("Máximo entre " + num1 + " e " + num2 + ": " + Math.max(num1, num2));
        System.out.println("Mínimo entre " + num1 + " e " + num2 + ": " + Math.min(num1, num2));

        System.out.println("============================================================================");

        // Potenciação e Raiz
        System.out.println("2 elevado a 5: " + Math.pow(2, 5));
        System.out.println("Raiz quadrada de 64: " + Math.sqrt(64));

        System.out.println("============================================================================");

        // Funções Trigonométricas
        double anguloGraus = 45;
        double anguloRadianos = Math.toRadians(anguloGraus);
        System.out.println("Seno de " + anguloGraus + "°: " + Math.sin(anguloRadianos));
        System.out.println("Cosseno de " + anguloGraus + "°: " + Math.cos(anguloRadianos));
        System.out.println("Tangente de " + anguloGraus + "°: " + Math.tan(anguloRadianos));

        System.out.println("============================================================================");

        // Arredondamento
        double valorDecimal = 3.7;
        System.out.println("3.7 arredondado com (round): " + Math.round(valorDecimal));
        System.out.println("3.7 arredondado para cima (ceil): " + Math.ceil(valorDecimal));
        System.out.println("3.7 arredondado para baixo (floor): " + Math.floor(valorDecimal));

        System.out.println("============================================================================");

        // Números Aleatórios
        System.out.println("Número aleatório entre 0.0 e 1.0: " + Math.random());
        System.out.println("============================================================================");

    }
}
