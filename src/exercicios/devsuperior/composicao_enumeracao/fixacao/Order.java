package exercicios.devsuperior.composicao_enumeracao.fixacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private static final DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    private LocalDateTime moment;
    private OrderStatus status;
    private Client client;
    private List<OrderItem> items = new ArrayList<>();

    public Order() {
    }

    public Order(LocalDateTime moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Order moment: ").append(this.moment.format(fmt)).append("\n");
        stringBuilder.append("Order status: ").append(this.status).append("\n");
        stringBuilder.append("Client: ").append(this.client).append("\n");
        stringBuilder.append("Order items:\n");
        for (OrderItem item : this.items) {
            stringBuilder.append(item).append("\n");
        }
        stringBuilder.append("Total price: $").append(String.format("%.2f", total()));
        return stringBuilder.toString();
    }
}