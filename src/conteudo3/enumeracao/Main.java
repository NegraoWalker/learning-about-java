package conteudo3.enumeracao;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Order order = new Order(1, new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);
    }
}
