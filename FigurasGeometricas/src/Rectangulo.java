public class Rectangulo implements IShape {

    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area;
        area = base * altura;
        return area;
    }

    @Override
    public double calcularPerimetro() {
        double perimetro;
        perimetro = (base + altura)*2;
        return perimetro;
    }
}
