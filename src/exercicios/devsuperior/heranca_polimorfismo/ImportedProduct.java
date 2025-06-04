package exercicios.devsuperior.heranca_polimorfismo;

public class ImportedProduct extends Product{
    private Double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, Double price, Double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public Double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(Double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag() {
        return String.format("%s (used) $ %.2f (Custom fee: $ %.2f)",
                getName(), totalPrice(), customsFee );
    }

    public Double totalPrice() {
        return this.getPrice() + customsFee;
    }
}
