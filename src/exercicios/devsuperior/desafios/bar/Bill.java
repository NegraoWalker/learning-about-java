package exercicios.devsuperior.desafios.bar;

public class Bill {
    public char gender; //gênero ou sexo
    public int beer; //cerveja
    public int barbecue; //churrasco
    public int softDrink; //refrigerante

    public static final double VALUE_BEER = 5.00;
    public static final double VALUE_SOFT_DRINK = 3.00;
    public static final double VALUE_BARBECUE = 7.00;



    public double cover() { //taxa de música
        if (feeding() > 30.00) {
            return 0.00;
        } else {
            return 4.00;
        }
    }

    public double feeding() { //alimentação
        return beer * VALUE_BEER + softDrink * VALUE_SOFT_DRINK + barbecue * VALUE_BARBECUE;
    }

    public double ticket() { //ingresso
        if (gender == 'M') {
            return 10.00;
        } else {
            return 8.00;
        }
    }

    public double total() {
        return feeding() + cover() + ticket();
    }

    @Override
    public String toString() {
        return "Consumo: R$ " + String.format("%.2f", feeding()) + "\n" +
                (cover() == 0 ? "ISENTO DE COUVERT\n" : "Couvert: R$ " + String.format("%.2f", cover()) + "\n") +
                "Ingresso: R$ " + String.format("%.2f", ticket()) + "\n\n" +
                "Total a pagar: R$ " + String.format("%.2f", total());
    }
}
