package exercicios.devsuperior.composicao_enumeracao.fixacao;

public class OrderItem {
    private Integer quantity;
    private Double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Double subTotal() {
        return price * quantity;
    }

    public String toString() {
        return product.getName()
                + ", $" + String.format("%.2f", this.price)
                + ", Quantity: " + this.quantity
                + ", Subtotal: $" + String.format("%.2f", subTotal());
    }
}