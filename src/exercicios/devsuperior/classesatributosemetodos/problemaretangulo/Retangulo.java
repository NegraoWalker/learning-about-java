package exercicios.devsuperior.classesatributosemetodos.problemaretangulo;

public class Retangulo {
    public double width; //largura
    public double height; //altura

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (height + width);
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }

    @Override
    public String toString() {
        return "Área: " + String.format("%.2f", area()) + "\n" +
                "Perímetro: " + String.format("%.2f", perimeter()) + "\n" +
                "Diagonal: " + String.format("%.2f", diagonal());
    }
}
