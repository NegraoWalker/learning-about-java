package intermediario.exemplos_de_classe_e_objeto;

public class Product {
    public String name;
    public double price;
    public int quantity;

    public double totalPriceOfTheProduct() {
        return price * quantity;
    }

    public void addProducts(int quantity) {
        this.quantity += quantity;
    }

    public void removeProducts(int quantity) {
        this.quantity -= quantity;
    }
}
