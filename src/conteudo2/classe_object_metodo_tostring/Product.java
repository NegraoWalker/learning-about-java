package conteudo2.classe_object_metodo_tostring;

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

//    //Método toString padrão:
//    @Override
//    public String toString() {
//        return "Product{" +
//                "name='" + name + '\'' +
//                ", price=" + price +
//                ", quantity=" + quantity +
//                '}';
//    }

    //Método personalizado por mim:
    @Override
    public String toString() {
        return "Nome do produto: " + name + "\n"
                + "Preço do produto: R$" + String.format("%.2f", price) + "\n"
                + "Quantidade do produto: " + quantity + "\n"
                + "Valor total: R$" + String.format("%.2f", totalPriceOfTheProduct());
    }
}
