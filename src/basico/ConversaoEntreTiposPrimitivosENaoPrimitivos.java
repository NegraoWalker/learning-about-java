package basico;

public class ConversaoEntreTiposPrimitivosENaoPrimitivos {
    public static void main(String[] args) {
        String numeroIntString = "165";
        int numeroInteiro = Integer.parseInt(numeroIntString);
        System.out.println("Valor inteiro: " + numeroInteiro);

        String numeroDoubleString = "123.45";
        double numeroDouble = Double.parseDouble(numeroDoubleString);
        System.out.println("Valor com ponto flutuante: " + numeroDouble);

        int numeroInt = 456;
        String intString = String.valueOf(numeroInt);
        System.out.println("String: " + intString);

        double numDouble = 456.78;
        String doubleString = String.valueOf(numDouble);
        System.out.println("String: " + doubleString);
    }
}
